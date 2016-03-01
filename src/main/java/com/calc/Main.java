package com.calc;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	
		int a, b;
		
		Scanner scn = new Scanner(System.in);	
		Addition AddObj=new Addition();
		Substraction SubObj=new Substraction();
		multiplication mulobj=new Multiplication();
			
		System.out.println("\nEnter the values for a and b");
		
		a=scn.nextInt();
		b=scn.nextInt();
		
		AddObj.add(a,b);
		SubObj.sub(a,b);
		Mulobj.mul(a,b);

		System.out.println("\nExecution Completed!");
	}
}