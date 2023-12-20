package JUnitPackage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExecutionProcedureJUnit {

	// execute only once in the beginning
	@BeforeClass
	public static void beforeClass() {
		System.out.println("is before class");
	}

	// execute only once in the end
	@AfterClass
	public static void afterClass() {
		System.out.println("is after class");
	}

	// execute for each test,before executing test
	@Before
	public void before() {
		System.out.println("is before");
	}

	@After
	public void after() {
		System.out.println("is after");
	}

	@Test
	public void testCase1() {
		System.out.println("in test case 1");
	}

	@Test
	public void testCase2() {
		System.out.println("in test case 2");
	}

}