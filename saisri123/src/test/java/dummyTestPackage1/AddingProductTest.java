package dummyTestPackage1;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibrary.BaseConfiguration;

public class AddingProductTest extends BaseConfiguration {
	@Test
	public void AddingProductToTheCart() {
		Reporter.log("AddingProductToTheCart",true);
		driver.findElement(By.xpath("//a[@data-product-id='12']")).click();
		
	}
}