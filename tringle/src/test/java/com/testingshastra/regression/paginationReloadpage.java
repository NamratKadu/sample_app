package com.testingshastra.regression;
	import java.time.Duration;
	import java.util.ArrayList;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class paginationReloadpage {
		@Test
		public void DemoReloadPgination() throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			// RemoteWebDriver driver = BaseClass.OpenBrowser();
			// driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
			driver.manage().window().maximize();
			driver.get("https://www.meesho.com/nightdresses-women/pl/3nm?page=1");
			// String displayCount =
			// driver.findElement(By.xpath("//span[@class=\"title-count\"]")).getText().split("
			// ")[1];
			WebElement reLoad= driver.findElement(By.id("__NEXT_DATA__"));
			driver.executeScript("window.scrollBy(0,2000)");
			List<WebElement> productList = driver.findElements(By.xpath(
					"//div[@class=\"sc-ftTHYK dSpUEW NewProductCardstyled__CardStyled-sc-6y2tys-0 ccpfUL NewProductCardstyled__CardStyled-sc-6y2tys-0 ccpfUL\"]//child::p[@class=\"sc-eDvSVe gQDOBc NewProductCardstyled__StyledDesktopProductTitle-sc-6y2tys-5 ejhQZU NewProductCardstyled__StyledDesktopProductTitle-sc-6y2tys-5 ejhQZU\"]"));
			List<String> productName = new ArrayList<String>();
			for (WebElement name : productList) {
				productName.add(name.getText());
				System.out.println(name.getText());

			}
			System.out.println("*****************");

			while (true) {
				Thread.sleep(3000);
				//nextButton.click();
				//Thread.sleep(3000);
				driver.executeScript("window.scrollBy(0,2000)");
				Thread.sleep(5000);
				productList = driver.findElements(By.xpath(
						"//div[@class=\"sc-ftTHYK dSpUEW NewProductCardstyled__CardStyled-sc-6y2tys-0 ccpfUL NewProductCardstyled__CardStyled-sc-6y2tys-0 ccpfUL\"]//child::p[@class=\"sc-eDvSVe gQDOBc NewProductCardstyled__StyledDesktopProductTitle-sc-6y2tys-5 ejhQZU NewProductCardstyled__StyledDesktopProductTitle-sc-6y2tys-5 ejhQZU\"]"));
				for (WebElement name : productList) {
					productName.add(name.getText());
					System.out.println(name.getText());

				}
				try {
					reLoad= driver.findElement(By.id("__NEXT_DATA__"));
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("No more element");
				}

			}
		}

	}



