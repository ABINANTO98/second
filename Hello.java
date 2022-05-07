package hello;

import java.util.Scanner;

public class Hello 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello");
		System.out.println("Enter two number\n");
		Scanner inp=new Scanner (System.in);
		int num1=inp.nextInt();
		int num2=inp.nextInt();
		System.out.println("the two numbers are "+num1+" and "+num2+".");
<<<<<<< HEAD
		int sum=num1+num2;
		System.out.println("the sum is "+sum);
		int prod=num1*num2;
		System.out.println("the product is "+prod);
=======
		System.out.println("something is wrong");
>>>>>>> feature
	}
}
