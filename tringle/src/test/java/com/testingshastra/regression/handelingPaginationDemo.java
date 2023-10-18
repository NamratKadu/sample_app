package com.testingshastra.regression;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Dem.tringle.BaseClass;

public class handelingPaginationDemo {
	@Test
	public void handlingPegination() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.manage().window().maximize();
		// FluentWait<WebDriver> wait =new FluentWait <WebDriver>(driver);
		driver.findElement(By.xpath("//input[@placeholder=\"Search for products, brands and more\"]"))
				.sendKeys(" Men Sneakers", Keys.RETURN);

		driver.executeScript("window.scrollBy(0,3600)");
		WebElement nextButton = driver.findElement(By.className("pagination-arrowRight"));

		List<WebElement> productList = driver.findElements(
				By.xpath("//li[@class=\"product-base\"]//child::div[@class=\"product-productMetaInfo\"]/h4[@class=\"product-sizes\"]"));
		List<String> productName = new ArrayList<String>();
		for (WebElement name : productList) {
			productName.add(name.getText());
			System.out.println(name.getText());

		}
		System.out.println("*****************");
		while (nextButton.isEnabled()) {

			nextButton.click();
			driver.executeScript("window.scrollBy(0,3600)");

			
			
			productList = driver.findElements(
					By.xpath("//li[@class=\"product-base\"]//child::div[@class=\"product-productMetaInfo\"]/h4[@class=\"product-sizes\"]"));
			for (WebElement name : productList) {
				productName.add(name.getText());
				System.out.println(name.getText());

			}
			try {
				nextButton = driver.findElement(By.className("pagination-arrowRight"));
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("no more element found");
			}
		}
	}
}
