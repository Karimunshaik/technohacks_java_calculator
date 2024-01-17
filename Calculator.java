package javaApplication;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1,num2,res=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		num1=s.nextDouble();
		num2=s.nextDouble();
		System.out.println("Enter your choice from:\n 1)Addition\n 2)Subtraction\n 3)Multiplication\n 4)Division");
		int ch=s.nextInt();
		switch(ch) {
		case 1:
			res=num1+num2;
			
			break;
		case 2:
			res=num1-num2;
			
			break;
		case 3:
			res=num1*num2;
			
			break;
		case 4:
			res=num1/num2;
			
			break;
		default:
			System.out.println("Enter a valid Choice");
		}
		System.out.println("The reult is:");
		System.out.println(res);
		
	}

}
