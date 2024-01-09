package testNGBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxTC {
	WebDriver driver; // to set globally

	@BeforeMethod
	public void launchingSite() {
		WebDriverManager.chromedriver().setup(); // instead of system.setprop
		driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.manage().window().maximize();
	}

//	@Test
//	public void verifyLabelofCheckbox() {
//		String expectedTitle =  "Click on this check box";
//		WebElement checkBox1 = driver.findElement(By.xpath("//label[contains(text(),'Click')]"));
//		String actualTitle = checkBox1.getText();
//		Assert.assertEquals(actualTitle, expectedTitle);
//	}
//	@Test
//	public void verifyLabelofnextCheck() {
//		String expectedTitle = "Check Box One";
//		WebElement checkBox2 = driver.findElement(By.xpath("//label[contains(text(),'One')]"));
//		String actualTitle = checkBox2.getText();
//		Assert.assertEquals(actualTitle, expectedTitle);
//	}
	@Test
	public void verifyCheckBox1Displayed() {
//		boolean expectedResult = true;
		WebElement checkCheckBox = driver.findElement(By.xpath("//input[@class='form-check-input']"));
		checkCheckBox.isDisplayed();
		boolean actualResult = checkCheckBox.isDisplayed();
		Assert.assertEquals(actualResult, true);
//		Assert.assertEquals(actualResult, false,"This failed due to unexpected output");
//		Assert.assertTrue(actualResult);
//		System.out.println("CheckBox is displayed");
	}
//	public void verifyCheckBox1IsDisplayed() {
//		WebElement checkBox1=driver.findElement(By.xpath("//input[@id='gridCheck']"));
//		boolean checkBox1Displayed=checkBox1.isDisplayed();
//		Assert.assertEquals(checkBox1Displayed,true );
//	}

}
