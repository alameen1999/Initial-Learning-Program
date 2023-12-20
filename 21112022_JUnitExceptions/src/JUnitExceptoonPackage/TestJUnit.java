package JUnitExceptoonPackage;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;


public class TestJUnit {
	
	String message = "Robert";
	MeesageUtil messageUtil = new MeesageUtil(message);
	
	@Test(expected = ArithmeticException.class)
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		messageUtil.printMessage();
	}
	
	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Robert";
		assertEquals(message,messageUtil.salutationMessage());
	}

}
