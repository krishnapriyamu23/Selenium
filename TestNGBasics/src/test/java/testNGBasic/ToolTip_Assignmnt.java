package testNGBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTip_Assignmnt {

	WebDriver driver;
	
  @BeforeMethod
  public void launchingSite() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://selenium.obsqurazone.com/window-popup.php");
	  driver.manage().window().maximize();
  }
  @Test
  public void verifyToolTip() {
	  WebElement tooltip = driver.findElement(By.xpath("//a[@class='btn btn-primary windowSingle']"));
	  String actualToolTip = tooltip.getAttribute("title");
	  String expectedToolTip = "Follow @obsqurazone on Facebook";
	  Assert.assertEquals(actualToolTip, expectedToolTip);
  }
  @Test
  public void verifyTextOfBtn() {
	  WebElement btnText = driver.findElement(By.xpath("//a[@id='windowMulti']"));
	  String actualTextOfBtn = btnText.getText();
	  String expectedTextOfBtn = "Follow All";
	  Assert.assertEquals(actualTextOfBtn, expectedTextOfBtn);
  }
  @Test
  public void verifyBg() {
	  WebElement bg = driver.findElement(By.xpath("//a[@id='windowMulti']"));
	  String actualbgBtn = bg.getCssValue("background-color");
	  String expectedbgBtn = "#28a745";
	  Assert.assertEquals(actualbgBtn, expectedbgBtn);
	  
  }
  @AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
