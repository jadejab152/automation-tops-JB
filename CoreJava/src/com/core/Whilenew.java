package com.core;

import java.util.Scanner;

public class Whilenew 
{
	public static void main(String[] args) 
	{
		int i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		i=sc.nextInt();
		while(i>0)
		{
			sum=sum+i;
			i=i-1;
		}
		System.out.println("Sum : "+sum);
		
	}

}
