package com.core;

import java.util.Scanner;

public class Ifelseodd 
{
 public static void main(String[] args) 
 {
	int a;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter A : ");
	a=sc.nextInt();
	if(a%2==0)
	{
		System.out.println("A is Even Number");
	}
	else
	{
		System.out.println("A is Odd Number");
	}
}
}
