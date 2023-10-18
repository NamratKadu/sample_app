package com.testingshastra.regression;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Dem.tringle.BaseClass;

public class SearchComponentTests  extends TestBase{
	@Test
	public void verifySearchResultsArePopulatingCorrectResultsMenSneakers() {
		RemoteWebDriver driver = BaseClass.OpenBrowser();
		
		driver.findElement(By.xpath("//input[@placeholder=\"Search for products, brands and more\"]"))
				.sendKeys(" Men Sneakers", Keys.RETURN);
		List<WebElement> productlist = driver
				.findElements(By.xpath("//div[@class=\"product-productMetaInfo\"]/h4[@class=\"product-product\"]"));
		Iterator<WebElement> itr = productlist.iterator();
		while (itr.hasNext()) {
		String productTitle =itr.next().getText();
		System.out.println("checking:-"+productTitle);
	          Assert.assertTrue(productTitle.contains("Sneakers"));
		}
		
	}

}
