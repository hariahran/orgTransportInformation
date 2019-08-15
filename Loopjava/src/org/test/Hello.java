package org.test;

import java.util.Scanner;


public class Hello {
		public static void main(String[] args)
		{
		checkEligibility();
		}

		static void checkEligibility(){

		int age;
		Scanner sc=new Scanner(System.in);
		System.out.print("Input= "+" ");
		age=sc.nextInt();
		if(age>=18)
		System.out.println("eligible.");
		else
		System.out.println("print not eligible.");


		}

		}

