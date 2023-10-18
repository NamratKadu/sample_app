package DemoTestBaseClass;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestBaseClass {
	private static RemoteWebDriver driver;

	public RemoteWebDriver getdriver() {
		return driver;
	}

	@Parameters("browser-name")

	@BeforeMethod
	public void setUp(@Optional String browserName) throws Exception {
		if (browserName == null) {
			browserName = "Chrome";
		}
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}else {
			System.err.println("Invalid Browser name:");
		}
		}
	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
		
	}
	}


