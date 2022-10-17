package Keyword;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priority {
	public class Annotation {
		@BeforeClass
		public  void Brpwser() {
			System.out.println("@BeforeClass");
		}
		@BeforeMethod
		public  void login() {
			System.out.println("@BeforeMethod");
		}
		@Test//Test case run alphabetical order
		public void TC001() {
			System.out.println("TC001");
		}
		@Test(priority=1)//Default priority  is 0 
		public  void TC002() {
			System.out.println("TC002");
		}
		@Test(priority=-1)
		public  void TC003() {
			System.out.println("TC003");
		}
		@AfterMethod
		public void logout() {
			System.out.println("AfterMethod");
		}
		@AfterClass
		public void close() {
			System.out.println("AfterClass");
		}
		}

}
