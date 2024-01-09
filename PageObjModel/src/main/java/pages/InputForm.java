package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.UtilityClass;

public class InputForm{
	WebDriver driver;
	UtilityClass utility;
	By inputFormButton = By.xpath("//a[contains(text(),'Input')]");
	By inputButton = By.xpath("//button[@id='button-one']");

	public InputForm(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnInputForm() {
		WebElement element = driver.findElement(inputFormButton);
		element.click();
	}
	public String getButton() {
		WebElement inputBtn = driver.findElement(inputButton);
		String Buttontext = inputBtn.getText();
		System.out.println(Buttontext);
		return Buttontext;
		utility=new UtilityClass();
		String idAttributeValue = utility.get_Attribute(element, "id");
		System.out.println("Id Attribute of ShowMessage Button:"+idAttributeValue);
		return element.getText();
		
	}
}
