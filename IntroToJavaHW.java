package model;

import java.util.Scanner;

public class IntroToJavaHW {

	//illegal field names
	
	int school;
	public static void main(String[] args) {
		school.subject;
		school.grade;
	}
	
	//Uninitialized fields
	
	private final String subject;
	
	public IntroToJavaHW() {
	}
	
	//Uninitialized local variables
	
	public static void Var(String[] args) {
	
	 int a=5;
	 int b;
	 int c=a+b;
	}
	 
}
