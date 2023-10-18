package Demo.setTestcase;

import org.testng.annotations.Test;


public class Testcasedemo {
	@Test
	public  void demo1() {
		System.out.println("Namrata");

	}
	@Test
	public void testcase() {
		System.out.println("second testcase");
		throw new ArrayIndexOutOfBoundsException();

	}
	@Test
	public void testcase1() {
	System.out.println("third testcase");

	}

}
//test case kab fail hogi jab exception ya  exceptional error aygi not syntactical errors 