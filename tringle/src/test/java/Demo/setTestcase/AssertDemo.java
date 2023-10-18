package Demo.setTestcase;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class AssertDemo {
	public void testcase1() {

System.out.println("Hello");
Assert.assertEquals("Hello", "Hi");

	}
	public void testcase() {
		 System.out.println("Hi Namrata");
		 Assert.assertEquals("Hi Namrata", "Hi Namrata");
	 }
	public void Testcase3() {
		// TODO Auto-generated method stub
		System.out.println("Hi Namrata");
		 Assert.assertFalse(5<6);

	}
	public void Testcase4() {
		// TODO Auto-generated method stub
		System.out.println("Hi Namrata");
		Assert.assertTrue(5>6);

	}
}
