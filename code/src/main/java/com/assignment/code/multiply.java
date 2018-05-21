package com.assignment.code;
import java.util.Scanner;

public class multiply
{
	public static void main(String ar[])
	{
		int n1,n2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number");
		n1=sc.nextInt();
		System.out.println("Enter Second number");
		n2=sc.nextInt();
		Square s=new Square();
		int a=s.sqr1(n1);
		int b=s.sqr2(n2);
		int c=a*b;
		System.out.println("Multiplication is : "+c);
	}
}