package testclasses;

import org.testng.annotations.Test;

public class TestClass2 {
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
}
