package com.core;

import java.util.Scanner;

public class IfCondition {
	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A : ");
		a=sc.nextInt();
		if(a>0)
		{
			System.out.println("A is Positive Number");
		}
		else
		{
			System.out.println("A is Negative Number");
		}
	}

}
