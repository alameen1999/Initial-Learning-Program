package com.experion.testassertion;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAssertions {
	@Test
	public void testAssertions() {
		//test data
		String str1 = new String ("abc");
		String str2 = new String ("abc");
		String str3 = null;
		String str4 = "abc";
		String str5 = "abc";
		
		int val1 = 4;
		int val2 = 6;
		
		String[] expectedArray = {"one","two","three"};
		String[] resultArray = {"one","two","three"};
		
		assertEquals(str1, str2);
	

}
}
