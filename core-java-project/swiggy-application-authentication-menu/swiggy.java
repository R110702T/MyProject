package com;


import java.util.Scanner;
public class swiggy {

	static Scanner sc=new Scanner(System.in);
		public static void main(String[] args) throws Exception
		{
			System.out.println("WELCOME TO SWIGGY");
			System.out.println("*****************************");
			System.out.println("\t\tselect the hotel name\n\t\t________________________");
			System.out.println("1.BUHARI\n2.AMINIA\n3.A2B");
			System.out.println("enter your favoiurite restaurent");
			 int value=sc.nextInt();
			
			 
			 
			 switch(value)
			{
				case 1:  { 
					    System.out.println("WELCOME TO BUHARI");
				       System.out.println("MENU\n________________________");
				       System.out.println("1.chicken biriyani\n2.mutton biriyani\n3.spring roll");
						      int key=sc.nextInt();

							  switch(key)
					{
								  case 1:{
									  System.out.println("chicken biriyani price is 180");
									  double price=180;
									  System.out.println("enter your quantity");
									  int qnt=sc.nextInt();

									  double total=price*qnt;

									  System.out.println("your total price is"+total);

									  System.out.println("select payment mode");
									  System.out.println("1.phone pay\n2.google pay");
									  int pay=sc.nextInt();
	                                       switch(pay)
									  {
											   case 1:{
												   System.out.println("processing.....");
													   Thread.sleep(2000);

	                                                   
												   System.out.println("enter your bill amount");
												   int bill=sc.nextInt();
												   if(bill==total)
												   {
													
												 int sys=(int)(Math.random()*9999+9999);
												   System.out.println("your otp is");
												   
												   System.out.println("waiting.....");
												   
												   System.out.println(sys);

												  
												   System.out.println("please enter your otp");
												   int user=sc.nextInt();

												   if(user==sys)
													   {
														
												   System.out.println("PLACED YOUR ORDER");
												   
												   System.out.println("your order delivery within 30 min");
													   }
												   else{
													  System.out.println("wront otp.");
												        }
												   
												   }
	                                                   else{
													 System.out.println("please check your bill");
												           }


													   
												   break;}//phone pay

											   case 2:{ System.out.println("processing.....");
													   Thread.sleep(2000);

	                                                   
												   System.out.println("enter your bill amount");
												   int bill=sc.nextInt();
												   if(bill==total)
												   {
													
												 int sys=(int)(Math.random()*9999+9999);
												   System.out.println("your otp is");
												   
												   System.out.println("waiting.....");
												   
												   System.out.println(sys);

												  
												   System.out.println("please enter your otp");
												   int user=sc.nextInt();

												   if(user==sys)
													   {
														
												   System.out.println("PLACED YOUR ORDER");
												   
												   System.out.println("your order delivery within 30 min");
													   }
												   else{
													  System.out.println("wront otp.");
												        }
												   
												   }
	                                                   else{
													 System.out.println("please check your bill");
												           }
												   
												   break;}//google pay
											   default: {
												   System.out.println("invalid");
												   break;}//invalid
										
									  }//pay

									  break;}//chicken bir

								  case 2:{ System.out.println("mutton biriyani price is 380");
									  double price=380;
									  System.out.println("enter your quantity");
									  int qnt=sc.nextInt();

									  double total=price*qnt;

									  System.out.println("your total price is"+total);

									  System.out.println("select payment mode");
									  System.out.println("1.phone pay\n2.google pay");
									  int pay=sc.nextInt();
	                                       switch(pay)
									  {
											   case 1:{
												   System.out.println("processing.....");
													   Thread.sleep(2000);

	                                                   
												   System.out.println("enter your bill amount");
												   int bill=sc.nextInt();
												   if(bill==total)
												   {
													
												 int sys=(int)(Math.random()*9999+9999);
												   System.out.println("your otp is");
												   
												   System.out.println("waiting.....");
												   
												   System.out.println(sys);

												  
												   System.out.println("please enter your otp");
												   int user=sc.nextInt();

												   if(user==sys)
													   {
														
												   System.out.println("PLACED YOUR ORDER");
												   
												   System.out.println("your order delivery within 30 min");
													   }
												   else{
													  System.out.println("wront otp.");
												        }
												   
												   }
	                                                   else{
													 System.out.println("please check your bill");
												           }


													   
												   break;}//phone pay

											   case 2:{ System.out.println("processing.....");
													   Thread.sleep(2000);

	                                                   
												   System.out.println("enter your bill amount");
												   int bill=sc.nextInt();
												   if(bill==total)
												   {
													
												 int sys=(int)(Math.random()*9999+9999);
												   System.out.println("your otp is");
												   
												   System.out.println("waiting.....");
												   
												   System.out.println(sys);

												  
												   System.out.println("please enter your otp");
												   int user=sc.nextInt();

												   if(user==sys)
													   {
														
												   System.out.println("PLACED YOUR ORDER");
												   
												   System.out.println("your order delivery within 30 min");
													   }
												   else{
													  System.out.println("wront otp.");
												        }
												   
												   }
	                                                   else{
													 System.out.println("please check your bill");
												           }
												   
												   break;}//google pay
											   default: {
												   System.out.println("invalid");
												   break;}//invalid
										
									  }//pay

									  
									  break;}//mutton biriyani
								  case 3: { System.out.println("spring roll price is 90");
									  double price=180;
									  System.out.println("enter your quantity");
									  int qnt=sc.nextInt();

									  double total=price*qnt;

									  System.out.println("your total price is"+total);

									  System.out.println("select payment mode");
									  System.out.println("1.phone pay\n2.google pay");
									  int pay=sc.nextInt();
	                                       switch(pay)
									  {
											   case 1:{
												   System.out.println("processing.....");
													   Thread.sleep(2000);

	                                                   
												   System.out.println("enter your bill amount");
												   int bill=sc.nextInt();
												   if(bill==total)
												   {
													
												 int sys=(int)(Math.random()*9999+9999);
												   System.out.println("your otp is");
												   
												   System.out.println("waiting.....");
												   
												   System.out.println(sys);

												  
												   System.out.println("please enter your otp");
												   int user=sc.nextInt();

												   if(user==sys)
													   {
														
												   System.out.println("PLACED YOUR ORDER");
												   
												   System.out.println("your order delivery within 30 min");
													   }
												   else{
													  System.out.println("wront otp.");
												        }
												   
												   }
	                                                   else{
													 System.out.println("please check your bill");
												           }


													   
												   break;}//phone pay

											   case 2:{ System.out.println("processing.....");
													   Thread.sleep(2000);

	                                                   
												   System.out.println("enter your bill amount");
												   int bill=sc.nextInt();
												   if(bill==total)
												   {
													
												 int sys=(int)(Math.random()*9999+9999);
												   System.out.println("your otp is");
												   
												   System.out.println("waiting.....");
												   
												   System.out.println(sys);

												  
												   System.out.println("please enter your otp");
												   int user=sc.nextInt();

												   if(user==sys)
													   {
														
												   System.out.println("PLACED YOUR ORDER");
												   
												   System.out.println("your order delivery within 30 min");
													   }
												   else{
													  System.out.println("wront otp.");
												        }
												   
												   }
	                                                   else{
													 System.out.println("please check your bill");
												           }
												   
												   break;}//google pay
											   default: {
												   System.out.println("invalid");
												   break;}//invalid
										
									  }//pay

									  
									  break;}//spring roll
								  default:{
									  System.out.println("invalid");
									  break;}//invalid
						
					}//key

						
						
			break;
				}//buhari




				case 2: {System.out.println("WELCOMW TO AMINIA");
				
				       System.out.println("MENU\n_________________________");
				       System.out.println("1.momo\n2.chowmein\n3.chicken65");
						      int key=sc.nextInt();

							  switch(key)
					{
								  case 1:{
									  System.out.println("momo plate is 120");
									  double price=120;
									  System.out.println("enter your quantity");
									  int qnt=sc.nextInt();

									  double total=price*qnt;

									  System.out.println("your total price is"+total);

									  System.out.println("select payment mode");
									  System.out.println("1.phone pay\n2.google pay");
									  int pay=sc.nextInt();
	                                       switch(pay)
									  {
											   case 1:{
												   System.out.println("processing.....");
													   Thread.sleep(2000);

	                                                   
												   System.out.println("enter your bill amount");
												   int bill=sc.nextInt();
												   if(bill==total)
												   {
													
												 int sys=(int)(Math.random()*9999+9999);
												   System.out.println("your otp is");
												   
												   System.out.println("waiting.....");
												   
												   System.out.println(sys);

												  
												   System.out.println("please enter your otp");
												   int user=sc.nextInt();

												   if(user==sys)
													   {
														
												   System.out.println("PLACED YOUR ORDER");
												   
												   System.out.println("your order delivery within 30 min");
													   }
												   else{
													  System.out.println("wront otp.");
												        }
												   
												   }
	                                                   else{
													 System.out.println("please check your bill");
												           }


													   
												   break;}//phone pay

											   case 2:{ System.out.println("processing.....");
													   Thread.sleep(2000);

	                                                   
												   System.out.println("enter your bill amount");
												   int bill=sc.nextInt();
												   if(bill==total)
												   {
													
												 int sys=(int)(Math.random()*9999+9999);
												   System.out.println("your otp is");
												   
												   System.out.println("waiting.....");
												   
												   System.out.println(sys);

												  
												   System.out.println("please enter your otp");
												   int user=sc.nextInt();

												   if(user==sys)
													   {
														
												   System.out.println("PLACED YOUR ORDER");
												   
												   System.out.println("your order delivery within 30 min");
													   }
												   else{
													  System.out.println("wront otp.");
												        }
												   
												   }
	                                                   else{
													 System.out.println("please check your bill");
												           }
												   
												   break;}//google pay
											   default: {
												   System.out.println("invalid");
												   break;}//invalid
										
									  }//pay

									  break;}//chicken bir

								  case 2:{ System.out.println("chowmein price is 80");
									  double price=80;
									  System.out.println("enter your quantity");
									  int qnt=sc.nextInt();

									  double total=price*qnt;

									  System.out.println("your total price is"+total);

									  System.out.println("select payment mode");
									  System.out.println("1.phone pay\n2.google pay");
									  int pay=sc.nextInt();
	                                       switch(pay)
									  {
											   case 1:{
												   System.out.println("processing.....");
													   Thread.sleep(2000);

	                                                   
												   System.out.println("enter your bill amount");
												   int bill=sc.nextInt();
												   if(bill==total)
												   {
													
												 int sys=(int)(Math.random()*9999+9999);
												   System.out.println("your otp is");
												   
												   System.out.println("waiting.....");
												   
												   System.out.println(sys);

												  
												   System.out.println("please enter your otp");
												   int user=sc.nextInt();

												   if(user==sys)
													   {
														
												   System.out.println("PLACED YOUR ORDER");
												   
												   System.out.println("your order delivery within 30 min");
													   }
												   else{
													  System.out.println("wront otp.");
												        }
												   
												   }
	                                                   else{
													 System.out.println("please check your bill");
												           }


													   
												   break;}//phone pay

											   case 2:{ System.out.println("processing.....");
													   Thread.sleep(2000);

	                                                   
												   System.out.println("enter your bill amount");
												   int bill=sc.nextInt();
												   if(bill==total)
												   {
													
												 int sys=(int)(Math.random()*9999+9999);
												   System.out.println("your otp is");
												   
												   System.out.println("waiting.....");
												   
												   System.out.println(sys);

												  
												   System.out.println("please enter your otp");
												   int user=sc.nextInt();

												   if(user==sys)
													   {
														
												   System.out.println("PLACED YOUR ORDER");
												   
												   System.out.println("your order delivery within 30 min");
													   }
												   else{
													  System.out.println("wront otp.");
												        }
												   
												   }
	                                                   else{
													 System.out.println("please check your bill");
												           }
												   
												   break;}//google pay
											   default: {
												   System.out.println("invalid");
												   break;}//invalid
										
									  }//pay

									  
									  break;}//mutton biriyani
								  case 3: { System.out.println("chicken65 price is 120");
									  double price=120;
									  System.out.println("enter your quantity");
									  int qnt=sc.nextInt();

									  double total=price*qnt;

									  System.out.println("your total price is"+total);

									  System.out.println("select payment mode");
									  System.out.println("1.phone pay\n2.google pay");
									  int pay=sc.nextInt();
	                                       switch(pay)
									  {
											   case 1:{
												   System.out.println("processing.....");
													   Thread.sleep(2000);

	                                                   
												   System.out.println("enter your bill amount");
												   int bill=sc.nextInt();
												   if(bill==total)
												   {
													
												 int sys=(int)(Math.random()*9999+9999);
												   System.out.println("your otp is");
												   
												   System.out.println("waiting.....");
												   
												   System.out.println(sys);

												  
												   System.out.println("please enter your otp");
												   int user=sc.nextInt();

												   if(user==sys)
													   {
														
												   System.out.println("PLACED YOUR ORDER");
												   
												   System.out.println("your order delivery within 30 min");
													   }
												   else{
													  System.out.println("wront otp.");
												        }
												   
												   }
	                                                   else{
													 System.out.println("please check your bill");
												           }


													   
												   break;}//phone pay

											   case 2:{ System.out.println("processing.....");
													   Thread.sleep(2000);

	                                                   
												   System.out.println("enter your bill amount");
												   int bill=sc.nextInt();
												   if(bill==total)
												   {
													
												 int sys=(int)(Math.random()*9999+9999);
												   System.out.println("your otp is");
												   
												   System.out.println("waiting.....");
												   
												   System.out.println(sys);

												  
												   System.out.println("please enter your otp");
												   int user=sc.nextInt();

												   if(user==sys)
													   {
														
												   System.out.println("PLACED YOUR ORDER");
												   
												   System.out.println("your order delivery within 30 min");
													   }
												   else{
													  System.out.println("wront otp.");
												        }
												   
												   }
	                                                   else{
													 System.out.println("please check your bill");
												           }
												   
												   break;}//google pay
											   default: {
												   System.out.println("invalid");
												   break;}//invalid
										
									  }//pay

									  
									  break;}//spring roll
								  default:{
									  System.out.println("invalid");
									  break;}//invalid
						
					}
				break;	
				}//aminia

				case 3: {System.out.println("WELCOME TO A2B");
				
				       System.out.println("MENU\n_________________________");
				       System.out.println("1.poori\n2.samosa\n3.milkshake");
						      int key=sc.nextInt();

							  switch(key)
					{
								  case 1:{
									  System.out.println("poori price is 60");
									  double price=60;
									  System.out.println("enter your quantity");
									  int qnt=sc.nextInt();

									  double total=price*qnt;

									  System.out.println("your total price is"+total);

									  System.out.println("select payment mode");
									  System.out.println("1.phone pay\n2.google pay");
									  int pay=sc.nextInt();
	                                       switch(pay)
									  {
											   case 1:{
												   System.out.println("processing.....");
													   Thread.sleep(2000);

	                                                   
												   System.out.println("enter your bill amount");
												   int bill=sc.nextInt();
												   if(bill==total)
												   {
													
												 int sys=(int)(Math.random()*9999+9999);
												   System.out.println("your otp is");
												   
												   System.out.println("waiting.....");
												   
												   System.out.println(sys);

												  
												   System.out.println("please enter your otp");
												   int user=sc.nextInt();

												   if(user==sys)
													   {
														
												   System.out.println("PLACED YOUR ORDER");
												   
												   System.out.println("your order delivery within 30 min");
													   }
												   else{
													  System.out.println("wront otp.");
												        }
												   
												   }
	                                                   else{
													 System.out.println("please check your bill");
												           }


													   
												   break;}//phone pay

											   case 2:{ System.out.println("processing.....");
													   Thread.sleep(2000);

	                                                   
												   System.out.println("enter your bill amount");
												   int bill=sc.nextInt();
												   if(bill==total)
												   {
													
												 int sys=(int)(Math.random()*9999+9999);
												   System.out.println("your otp is");
												   
												   System.out.println("waiting.....");
												   
												   System.out.println(sys);

												  
												   System.out.println("please enter your otp");
												   int user=sc.nextInt();

												   if(user==sys)
													   {
														
												   System.out.println("PLACED YOUR ORDER");
												   
												   System.out.println("your order delivery within 30 min");
													   }
												   else{
													  System.out.println("wront otp.");
												        }
												   
												   }
	                                                   else{
													 System.out.println("please check your bill");
												           }
												   
												   break;}//google pay
											   default: {
												   System.out.println("invalid");
												   break;}//invalid
										
									  }//pay

									  break;}//chicken bir

								  case 2:{ System.out.println("samosa price is 20");
									  double price=20;
									  System.out.println("enter your quantity");
									  int qnt=sc.nextInt();

									  double total=price*qnt;

									  System.out.println("your total price is"+total);

									  System.out.println("select payment mode");
									  System.out.println("1.phone pay\n2.google pay");
									  int pay=sc.nextInt();
	                                       switch(pay)
									  {
											   case 1:{
												   System.out.println("processing.....");
													   Thread.sleep(2000);

	                                                   
												   System.out.println("enter your bill amount");
												   int bill=sc.nextInt();
												   if(bill==total)
												   {
													
												 int sys=(int)(Math.random()*9999+9999);
												   System.out.println("your otp is");
												   
												   System.out.println("waiting.....");
												   
												   System.out.println(sys);

												  
												   System.out.println("please enter your otp");
												   int user=sc.nextInt();

												   if(user==sys)
													   {
														
												   System.out.println("PLACED YOUR ORDER");
												   
												   System.out.println("your order delivery within 30 min");
													   }
												   else{
													  System.out.println("wront otp.");
												        }
												   
												   }
	                                                   else{
													 System.out.println("please check your bill");
												           }


													   
												   break;}//phone pay

											   case 2:{ System.out.println("processing.....");
													   Thread.sleep(2000);

	                                                   
												   System.out.println("enter your bill amount");
												   int bill=sc.nextInt();
												   if(bill==total)
												   {
													
												 int sys=(int)(Math.random()*9999+9999);
												   System.out.println("your otp is");
												   
												   System.out.println("waiting.....");
												   
												   System.out.println(sys);

												  
												   System.out.println("please enter your otp");
												   int user=sc.nextInt();

												   if(user==sys)
													   {
														
												   System.out.println("PLACED YOUR ORDER");
												   
												   System.out.println("your order delivery within 30 min");
													   }
												   else{
													  System.out.println("wront otp.");
												        }
												   
												   }
	                                                   else{
													 System.out.println("please check your bill");
												           }
												   
												   break;}//google pay
											   default: {
												   System.out.println("invalid");
												   break;}//invalid
										
									  }//pay

									  
									  break;}//mutton biriyani
								  case 3: { System.out.println("milkshake price is 170");
									  double price=170;
									  System.out.println("enter your quantity");
									  int qnt=sc.nextInt();

									  double total=price*qnt;

									  System.out.println("your total price is"+total);

									  System.out.println("select payment mode");
									  System.out.println("1.phone pay\n2.google pay");
									  int pay=sc.nextInt();
	                                       switch(pay)
									  {
											   case 1:{
												   System.out.println("processing.....");
													   Thread.sleep(2000);

	                                                   
												   System.out.println("enter your bill amount");
												   int bill=sc.nextInt();
												   if(bill==total)
												   {
													
												 int sys=(int)(Math.random()*9999+9999);
												   System.out.println("your otp is");
												   
												   System.out.println("waiting.....");
												   
												   System.out.println(sys);

												  
												   System.out.println("please enter your otp");
												   int user=sc.nextInt();

												   if(user==sys)
													   {
														
												   System.out.println("PLACED YOUR ORDER");
												   
												   System.out.println("your order delivery within 30 min");
													   }
												   else{
													  System.out.println("wront otp.");
												        }
												   
												   }
	                                                   else{
													 System.out.println("please check your bill");
												           }


													   
												   break;}//phone pay

											   case 2:{ System.out.println("processing.....");
													   Thread.sleep(2000);

	                                                   
												   System.out.println("enter your bill amount");
												   int bill=sc.nextInt();
												   if(bill==total)
												   {
													
												 int sys=(int)(Math.random()*9999+9999);
												   System.out.println("your otp is");
												   
												   System.out.println("waiting.....");
												   
												   System.out.println(sys);

												  
												   System.out.println("please enter your otp");
												   int user=sc.nextInt();

												   if(user==sys)
													   {
														
												   System.out.println("PLACED YOUR ORDER");
												   
												   System.out.println("your order delivery within 30 min");
													   }
												   else{
													  System.out.println("wront otp.");
												        }
												   
												   }
	                                                   else{
													 System.out.println("please check your bill");
												           }
												   
												   break;}//google pay
											   default: {
												   System.out.println("invalid");
												   break;}//invalid
										
									  }//pay

									  
									  break;}//spring roll
								  default:{
									  System.out.println("invalid");
									  break;}//invalid
						
					}
				break;	
				}//a2b

				default: {System.out.println("PLEASE CHECK YOUR OPTION AGAIN");
				break;	
				}

	             
		 } //hotel end
				  
			

		}
	}

	


