package JUnitExceptoonPackage;

public class MeesageUtil {
	
	private String message;
	
	public MeesageUtil(String message) {
		this.message = message;
	}
	
	public void printMessage() {
		System.out.println(message);
		int a = 0;
		int b = 1/0;
	}
	
	public String salutationMessage() {
		message = "Hi!" + message;
		System.out.println(message);
		return message;
	}

}
