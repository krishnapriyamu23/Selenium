package testNGBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssert_Example {
	WebDriver driver;
	SoftAssert softassert = new SoftAssert();

	@BeforeMethod
	public void launchingSite() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
	}

	@Test(invocationCount = 3) // int num
	public void verifyStatusOfRememberMeCb() {
		WebElement checkBx = driver.findElement(By.xpath("//input[@id='RememberMe']"));
		boolean verifycheckBx = checkBx.isEnabled();
		WebElement textBx = driver.findElement(By.xpath("//label[@for='RememberMe']"));
		String verifytextBx = textBx.getText();
		String expectedtextBx = "Remember ?";
		softassert.assertTrue(verifycheckBx);
		softassert.assertEquals(verifytextBx, expectedtextBx);
		softassert.assertAll();

	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
