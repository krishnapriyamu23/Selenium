package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.InputForm;

public class InputFormTest extends BaseClass{
	InputForm inputform;
	@Test
	public void verifyButton() {
		inputform = new InputForm(driver);
		inputform.clickOnInputForm();
	}
	@Test
	public void verifyInputButton() {
		inputform = new InputForm(driver);
		inputform.clickOnInputForm();
		String expectedInputBtn= "Show Message";
		String actualInputBtn = inputform.getButton();
		Assert.assertEquals(actualInputBtn, expectedInputBtn);
	}
}
