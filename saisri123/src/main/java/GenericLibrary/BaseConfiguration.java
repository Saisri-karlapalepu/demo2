package GenericLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseConfiguration {
	public WebDriver driver;
	public static WebDriver static_driver;

	@BeforeClass
	public void browserSetup() {
		driver = new ChromeDriver();
		Reporter.log("Step1:Browser launched success...!!", true);

		driver.get("https://automationexercise.com/");
		Reporter.log("Step2:Navigated to the address  success...!!", true);
	}

	@BeforeMethod
	public void login() {
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("roshini123@gmail.com");
		driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("kught#%$156");
		driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();

		Reporter.log("Step3:login successful...!!", true);

	}

	@AfterMethod
	public void logout() {
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
		Reporter.log("Step4:logout Success", true);
	}

	@AfterClass
	public void close() {
		driver.quit();
		Reporter.log("Step5:Closed successfully", true);
	}

}
