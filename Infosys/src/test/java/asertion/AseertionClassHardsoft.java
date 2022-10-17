package asertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AseertionClassHardsoft {
String expUrl="google.com";
String actUrl="google.com";
String actUrl2="google.co";

@Test
public void TC001() {
	Assert.assertEquals(actUrl, expUrl,"Assertion fail due to");//pass
	System.out.println("Assertion1");
	Assert.assertNotEquals(actUrl2, expUrl,"Assertionn fail due to");//pass
	System.out.println("Assertion2");
	
}

}
