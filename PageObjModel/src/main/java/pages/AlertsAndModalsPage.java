package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertsAndModalsPage {
	WebDriver driver;
	By alert= By.xpath("//a[@id='alert-modal']");
	By alertHeading = By.xpath("//div[contains(text(),'Bootstrap')]");

	public AlertsAndModalsPage(WebDriver driver) {
		this.driver = driver;
	}
	public void clickOnAlertandModals() {
		WebElement alertElement = driver.findElement(alert);
		alertElement.click();
	}
	public String getHeader() {
		WebElement alertHead = driver.findElement(alertHeading);
		String Headtext = alertHead.getText();
		System.out.println(Headtext);
		return Headtext; //this is returned to test class to execute testing 
		
	}
	
}