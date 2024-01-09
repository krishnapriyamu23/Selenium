package tests;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseClass;
import pages.TablePage;

public class TableTest extends BaseClass {

	TablePage tablePage;

	@Test

	public void verifyHeadingOfTable() {

		tablePage = new TablePage(driver);

		tablePage.clickOnTableLink();

		String expectedHeading = "Table with Pagination Example";

		String actualHeading = tablePage.getTableHeading();

		Assert.assertEquals(actualHeading, expectedHeading);

	}

	@Test

	public void verifyTableHeading() {

		tablePage = new TablePage(driver);

		tablePage.clickOnTableLink();

		tablePage.getHeading();

	}

	@Test

	public void verifyOfficeOfPerson() {

		tablePage = new TablePage(driver);

		tablePage.clickOnTableLink();

		tablePage.getPersonOffice("Cedric Kelly");

	}

}
