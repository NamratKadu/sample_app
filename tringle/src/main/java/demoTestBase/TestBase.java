package demoTestBase;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestBase {
	private  static RemoteWebDriver driver;
	public  static RemoteWebDriver getDriver() {
		return driver;
	}
	@Parameters("browser-name")
	@BeforeMethod
	public RemoteWebDriver  setUp(@Optional    String browserName) {
		if(browserName==null){
			System.out.println("Browser name was not Provided,Setting up");
			browserName="Chrome";
			
		}
		if (browserName.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
			System.out.println("Lunch Chrome Browser");
			
		} 
		/*else if(browserName.equalsIgnoreCase("Firefox")){
			driver=new Firefox();

		}
		else if (browserName.equalsIgnoreCase("internet explorer"))
			
		driver=new internet explorer();
		
		
	}*/
	else {
		System.out.println("Lunching Defult browser:Chrome");
		
	
		//System.err.println("Invalid Browser name:"+browserName);
		driver=new ChromeDriver();

}
	driver.get("https://www.myntra.com");
	return driver;
	}
}
