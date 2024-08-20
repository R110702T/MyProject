package com;
import java.util.Scanner;

public class NumberGuessing {

	

		static Scanner sc=new Scanner(System.in);
		public static void main(String[] args) throws Exception
		{
			boolean value=true;
			System.out.println("Lets start a game.I assume a number from 1 to 50 and you will tell me");
				int sys_num=(int)(Math.random()*50);
				System.out.println("Thinking.......");
				Thread.sleep(2000);
				System.out.println("tell me what number i assume");

			do{
				
				int input=sc.nextInt();
	    
	                if(input>sys_num)
				{
					System.out.println("it is high value");
				}
				else if (input<sys_num)
				{
					System.out.println("it is low number");
				}

				else if(input==sys_num)
				{
					System.out.println("congratulation you guessed it right ");



					System.out.println("1.play again\n2.exit");
					int key=sc.nextInt();
					if (key==2)
					{
						value=false;
						System.out.println("thank you for playing");
					}

						sys_num=(int)(Math.random()*70);
				}
					
				
						

					
				}



			
			while(value);
		}
	}
	
	
	
