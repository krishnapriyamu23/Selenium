package testNGBasic;

import org.testng.annotations.DataProvider;

public class Data_Provider {
	@DataProvider(name = "Amazon Product Data")
	public Object[][] methodData1() // return type obj
	{
		return new Object[][] { { "shoe" }, { "watch" }, { "phone" }, { "Laptops" }, { "sugar" } }; // at a time 1pdt
																									// search
	}

	@DataProvider(name = "Facebook credentials")
	public Object[][] methodData2() {

		return new Object[][] { { "email1", "password1" }, { "email2", "pass2" }, { "email3", "pass3" } }; //2D datas
	}
}
