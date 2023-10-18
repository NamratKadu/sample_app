package Demo.setTestcase;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametersDemo {
	@Parameters({"rollNo","Name"})
	@Test
	public void testParameter(int rollNo,String name) {
		// TODO Auto-generated method stub
		System.out.println(rollNo+"\t"+name);

	}

}
