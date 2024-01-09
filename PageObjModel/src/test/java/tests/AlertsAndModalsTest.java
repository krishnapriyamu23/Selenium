package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.AlertsAndModalsPage;


public class AlertsAndModalsTest extends BaseClass{
	AlertsAndModalsPage alertAndModalsPage;
	@Test
	public void verifyAlertHeadings() {
		alertAndModalsPage = new AlertsAndModalsPage(driver);
		alertAndModalsPage.clickOnAlertandModals();
		String expectedHeading= "Bootstrap Alert";
		String actualHeading = alertAndModalsPage.getHeader();
		Assert.assertEquals(actualHeading, expectedHeading);
	}
}
