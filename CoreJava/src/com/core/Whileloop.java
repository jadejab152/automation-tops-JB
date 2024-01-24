package com.core;

import java.util.Scanner;

public class Whileloop {
	public static void main(String[] args) {
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		i=sc.nextInt();
		while(i>0)
		{
			System.out.println("Tops Technologies");
			i=i-1;
		}
	}

}
