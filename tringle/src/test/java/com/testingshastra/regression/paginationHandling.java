package com.testingshastra.regression;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import Dem.tringle.BaseClass;

public class paginationHandling {
	@Test
	public void veryFyHowManyPageArePresentPerticularResult() throws InterruptedException {
		RemoteWebDriver driver = BaseClass.OpenBrowser();

		// driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/kids?f=Brand%3AH%26M&plaEnabled=false");
		String displayCountS = driver.findElement(By.xpath("//span[@class=\"title-count\"]")).getText().split(" ")[1];
		WebElement nextButton = driver.findElement(By.className("pagination-arrowRight"));
		driver.executeScript("window.scrollBy(0,3000)");
		List<WebElement> productList = driver.findElements(By.xpath(
				"//li[@class=\"product-base\"]//child::div[@class=\"product-productMetaInfo\"]/h4[@class=\"product-product\"]"));
		List<String> productName = new ArrayList<String>();
		for (WebElement name : productList) {
			productName.add(name.getText());
			System.out.println(name.getText());

		}
		System.out.println("*****************");

		while (true) {
			Thread.sleep(3000);
			nextButton.click();
			Thread.sleep(3000);
			driver.executeScript("window.scrollBy(0,3800)");
			Thread.sleep(5000);
			productList = driver.findElements(By.xpath(
					"//li[@class=\"product-base\"]//child::div[@class=\"product-productMetaInfo\"]/h4[@class=\"product-product\"]"));
			for (WebElement name : productList) {
				productName.add(name.getText());
				System.out.println(name.getText());

			}
			try {
				nextButton = driver.findElement(By.className("pagination-arrowRight"));
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("No more element");
			}

		}
	}
}
