package SuitePackage;

public class TestJunit2 {
	
	String message = "Robert";
	MessageUtil messageUtil = new MessageUtil(message);
	
	
	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutation")
	}
	
}
