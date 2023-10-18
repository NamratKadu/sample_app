package com.testingshastra.regression.framework;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import DemoTestBaseClass.TestBaseClass;

public class MyntraTesF  extends TestBaseClass{
	@Test
	public void verifySearchResultsForSneakers() {
		getdriver().get("https://www.myntra.com");
		getdriver().findElement(By.xpath("//input[@placeholder=\"Search for products, brands and more\"]")).sendKeys("Sneakers"+Keys.RETURN);
		getdriver().findElement(By.xpath("//a[@class=\"desktop-submit\"]")).click();
       List<WebElement> productList=getdriver().findElements(By.xpath("//div[@class=\"product-productMetaInfo\"]/h4[@class=\"product-product\"]"));
       if(productList.isEmpty()) {System.out.println("No matching products found");
       }
       Iterator<WebElement> itr= productList.iterator();
		while (itr.hasNext()) {
			String productTitle=itr.next().getText();
			Assert.assertTrue(productTitle.contains("Sneakers"),"Product Title does not contains sneakers"+productTitle);

	}

}
}
