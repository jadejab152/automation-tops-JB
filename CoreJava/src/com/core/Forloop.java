package com.core;

import java.util.Scanner;

public class Forloop 
{
	public static void main(String[] args) 
	{
		int i,sum=0,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		
		System.out.println("Sum : "+sum);
		}
}
