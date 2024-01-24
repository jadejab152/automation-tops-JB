package com.core;

import java.util.Scanner;

public class Ladderif {
	public static void main(String[] args) 
	{
		int rno,s1,s2,s3,total;
		double per;
		String sname;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Name of student : ");
		sname=sc.next();
		System.out.print("Enter Roll No of student : ");
		rno=sc.nextInt();
		System.out.print("Enter Marks of subject 1 : ");
		s1=sc.nextInt();
		System.out.print("Enter Marks of subject 2 : ");
		s2=sc.nextInt();
		System.out.print("Enter Marks of subject 3 : ");
		s3=sc.nextInt();
		
		total=s1+s2+s3;
		per=total/3;
		
		System.out.println("Student Name : "+sname);
		System.out.println("Roll No : "+rno);
		System.out.println("Total : "+total);
		System.out.println("Percentage : "+per);

		if(per>=70)
		{
			System.out.println("Distinction");
		}
		else if(per>=60)
		{
			System.out.println("Fist Class");
		}
		else if(per>=50)
		{
			System.out.println("Second Class");
		}
		else if (per>=40)
		{
			System.out.println("Pass");

		}
		else if(per>=30)
		{
			System.out.println("Fail");

		}
	}
	

}
