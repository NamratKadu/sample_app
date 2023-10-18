package Dem.tringle;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseClass {
	private static RemoteWebDriver driver;
	public  static RemoteWebDriver OpenBrowser() {
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com"); 
		return driver;
	}

}
