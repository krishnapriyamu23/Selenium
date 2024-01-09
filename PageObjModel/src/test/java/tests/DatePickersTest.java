package tests;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.DatePickersPage;

public class DatePickersTest extends BaseClass {
	DatePickersPage datePickersPage;

	@Test
	public void verifyHeadingOfTable() {
		datePickersPage = new DatePickersPage(driver);
		datePickersPage.clickOnDatePickersLink();
		datePickersPage.chooseDate();
	}
}
