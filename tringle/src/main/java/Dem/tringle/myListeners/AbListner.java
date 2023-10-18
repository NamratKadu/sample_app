package Dem.tringle.myListeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import demoTestBase.TestBase;

@Listeners(MyListener.class)
public class AbListner extends TestBase {
	@Test
	public void M1() {
		System.out.println("Pincode");
		

	}
	@Test
	public void M2() {
		String dir=System.getProperty("user.dir");
		System.out.println(dir);
		throw new ArrayIndexOutOfBoundsException();
	

	}

}
