package com;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Batch b = new Batch();

		b.setBcode("java01");
		b.setNoOfStudent(20);
		b.setSub("java");
		b.setTimming("12AM");
		b.setTrainer("tabrez");
		// student data not created because many student present

		Student s1 = new Student();

		s1.setName("riya");
		s1.setEmail("riya@gmail.com");
		s1.setAge(24);
		s1.setPhone(876543);
		s1.setBatch(b); // every student has same batch so we created one object

		Student s2 = new Student();

		s2.setName("rimi");
		s2.setEmail("rimi@gmail.com");
		s2.setAge(22);
		s2.setPhone(123338);
		s2.setBatch(b);

		Student s3 = new Student();

		s3.setName("mimi");
		s3.setEmail("mimi@gmail.com");
		s3.setAge(20);
		s3.setPhone(675463);
		s3.setBatch(b);

		List<Student> list = new ArrayList<Student>(); // here we created student collection

		list.add(s1);
		list.add(s2);
		list.add(s3);
		b.setStudents(list);

		et.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.persist(b);
		et.commit();

		System.out.println("data saved");

	}
}
