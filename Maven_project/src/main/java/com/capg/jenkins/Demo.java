package com.capg.jenkins;

public class Demo {
	public static void main(String[] args) {
		
		int result =addNumbers(5,5);
		System.out.println(result);
		
		int result1 =substractNumbers(5,5);
		System.out.println(result1);
		
	}
	public int addNumbers(int n1,int n2) {
		return n1+n2;
	}
	
	public int substractNumbers(int n1,int n2) {
		return n1-n2;
	}

}
