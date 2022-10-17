package testclasses;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestClass3 {
	@Test
	public void TC001() {
		System.out.println("Class2 TC001");
	}
	@Test(groups="regression")
	public void TC002() {
		System.out.println("Class2 TC002");
	}
	@Test
	public void TC003() {
		System.out.println("Class2 TC003");
	}
	@BeforeSuite
	public void BeforeSuit(){
		System.out.println("@BeforeSuit");
	}
	
	
}

