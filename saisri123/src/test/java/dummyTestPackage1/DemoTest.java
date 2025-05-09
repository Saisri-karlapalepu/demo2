package dummyTestPackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {
	    @Test
    public void m1() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	
	
	
	System.out.println(driver.getTitle());
	try {
		Thread.sleep(5000);
	}catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	driver.close();
	 }

}
