package Swaglab_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import SwagLab_Test.BaseClass;

public class ProductsPage {

	WebDriver driver = BaseClass.driver;

	public void AddToCart(String ProductName) {

		//for dynamic xpath we can passing product name to xpath like this way
		String ProductXapth = "//div[text()='" + ProductName + "']//following::button[1]";

		WebElement AddToCart = driver.findElement(By.xpath(ProductXapth));
		AddToCart.click();
	}

}
