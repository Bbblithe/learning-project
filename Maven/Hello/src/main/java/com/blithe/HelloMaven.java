package com.blithe;
public class HelloMaven{
	public static void main(String[] args){
		HelloMaven hello = new HelloMaven();
		int res = hello.add(10,20);
		System.out.println("10 + 20 = " + res);
	}

	public int add(int n1 , int n2){
		return n1 + n2;
	}
}