package Demo.setTestcase;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Test(groups= {"SearchComponentTests","Sanity"})
public class assertSoftDemo {
	
@Test
	public void softAssert() {
		// TODO Auto-generated method stu
	
	String s1="Hello";
	String s2="hi";
	String s3="hello";
	String s4="Hello";
	SoftAssert softly =new SoftAssert();
	softly.assertEquals(s1, s4);
	softly.assertEquals(s2,s3);
	softly.assertAll();// assert  all method  method assert throw karti hain

}

}
//softasset main sabhi assert check karega bad main batayega kitane pass ahin aur kitane fail hain. test case hard asset hi recomand ki jati tain