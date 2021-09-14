package com.blithe;
import org.junit.Assert;
import org.junit.Test;

public class TestHelloMaven{

	@Test
	public void testAdd(){
		System.out.println("maven junit testAdd()方法执行！");
		HelloMaven hello = new HelloMaven();
		int res = hello.add(10,20);
		// 验证 10 + 20 是不是20 , junit提供的方法，对比结果的
		// assertEquals(期望值,实际值);  如果两个只想等证明是正确的，如果不等就抛异常，错误
		Assert.assertEquals(30,res);
	}

	@Test
	public void testAdd2(){
		System.out.println("===============TestAdd2方法执行！=========");
		HelloMaven hello = new HelloMaven();
		int rest = hello.add(10,29);
		Assert.assertEquals(39,rest);
	}
}