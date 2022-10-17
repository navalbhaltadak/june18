package Keyword;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dependsOnMethod {
	@BeforeClass// this annotation is used to execute the method before executing the test class
	public  void Brpwser() {
		System.out.println("@BeforeClass");
	}
	@BeforeMethod//these annotation is used to to execute the method before execution of every test method  
	public  void login() {//
		System.out.println("@BeforeMethod");
	}
	@Test//by using enabled keyword we can hide the test case
	public void TC001() {
		System.out.println("TC001");
	}
	@Test(dependsOnMethods={"TC001","TC003"}) //these annotation is used to execute the test method 
	public  void TC002() {
		System.out.println("TC002");
	}
	@Test
	public  void TC003() {
		System.out.println("TC003");
	}
	@AfterMethod //these annotation is used to to execute the method after execution of every test method
	public void logout() {
		System.out.println("AfterMethod");
	}
	@AfterClass//this annotation is used to execute the method after executing the test class
	public void close() {
		System.out.println("AfterClass");
	}
}
