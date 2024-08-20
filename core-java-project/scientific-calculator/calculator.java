package com;

import java.util.Scanner;

public class calculator {

	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args)
	{
		 boolean operation=true;


           do
           {
			   System.out.println("WELCOME TO  THE SCIENTIFIC CALCULATOR");
			   System.out.println("*********************************************************************");
			   System.out.println("1.BASIC OPERATION\n2.SQUARE ROOT\n3.POWER\n4.TRIGONOMETRY\n5.EXIT");
               int option=sc.nextInt();
			   


			   try{
               switch(option)
			   {
				  case 1:{  System.out.println("1.addition\n2.subtraction\n3.multiplication\n4.division");
				            int value=sc.nextInt();
							switch(value)
					               {
								case 1:{
									  System.out.println("welcome to addition");
									    System.out.println("______________________________________");
									    System.out.println("enter the 1st number");
										     double num1=sc.nextInt();
										  System.out.println("enter the 2nd number");
										      double num2=sc.nextInt();

										      double sum=num1+num2;
										    System.out.println("your two number addition value is:"+"  "+sum);


									break;}
								case 2:{
									 System.out.println("welcome to subtraction");
									    System.out.println("______________________________________");
									    System.out.println("enter the 1st number");
										double num1=sc.nextInt();
										  System.out.println("enter the 2nd number");
										  double num2=sc.nextInt();

										  double sub=num1-num2;
										    System.out.println("your two number subtraction value is:"+"  "+sub);

									break;}
								case 3:{ System.out.println("welcome to multiplication");
									    System.out.println("______________________________________");
									    System.out.println("enter the 1st number");
										double num1=sc.nextInt();
										  System.out.println("enter the 2nd number");
										  double num2=sc.nextInt();

										  double mul=num1*num2;
										    System.out.println("your two number multiplication value is:"+"  "+mul);

									break;}
								case 4:{
									
								System.out.println("welcome to division");
									    System.out.println("______________________________________");
									    System.out.println("enter the 1st number");
										double num1=sc.nextDouble();
										  System.out.println("enter the 2nd number");
										  double num2=sc.nextDouble();
                                         
                                             double div=0;
                                            try{
										   div=num1/num2;
										  }
										  catch(ArithmeticException e)
									            {
												System.out.println("can,t divisible by zero");
	                                             }
									    System.out.println("your two number division value is:"+"  "+div);
									
									break;}
						
					               }
					  break;}


				  case 2:{  System.out.println("enter the squart root number ");
				            double  number=sc.nextInt();
							double result= Math.sqrt(number);
							System.out.println("your Result is"+"  "+result);
							
					  break;}


				  case 3:{  System.out.println("enter the base value");
				        double base=sc.nextInt();

				    System.out.println("enter the exponent value");
					double exponent=sc.nextInt();

					double result=Math.pow(base, exponent);
					System.out.println("your Result is"+"  "+result);
					  break;}


				  case 4:{  System.out.println("1.sin\n2.cos\n3.tan");
				  int trigo=sc.nextInt();


				   System.out.println("enter the degree");
					double degree=sc.nextInt();
					double radians= Math.toRadians(degree);
;

				    switch(trigo)
					  {
						case 1:{
							double res= Math.sin(radians);
							 System.out.println("your Result is"+"  "+res);

							break;}
						case 2:{

							double res= Math.cos(radians);
							 System.out.println("your Result is"+"  "+res);
							break;}
						case 3:{
							double res= Math.tan(radians);
							 System.out.println("your Result is"+"  "+res);
							break;}

						default:{
								System.out.println("invalid function");
								continue;
								}
					  }
					             // System.out.println("your Result is"+"  "+res);
				     break;}


				  case 5:{
					  System.out.println("thank you visit again");
					  operation=false;
					  break;}
			   }

			  

			  }catch(Exception e)
			   {
				System.out.println("Error :"+e.getMessage());
			   }
			


    

           }
           while (operation);



	}
	
	
}
