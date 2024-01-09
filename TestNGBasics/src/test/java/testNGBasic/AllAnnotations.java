package testNGBasic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {
@BeforeSuite
public void beforeSuite(){
  System.out.println("Inside before suite/ executing before suite");
} 
@BeforeTest
public void beforeTest() {
	System.out.println("Inside before test/ executing before test");
}
@BeforeClass
public void beforeClass() {
	System.out.println("Inside before class/ executing before class");
}
@BeforeMethod
public void beforeMethod() {
	System.out.println("Inside before method/ executing before method");
}
@AfterMethod
public void afterMethod() {
	System.out.println("Inside after method/ executing after method");
}
@AfterClass
public void afterClass() {
	System.out.println("Inside after class/ executing after class");
}
@AfterTest
public void afterTest() {
	System.out.println("Inside after Test/ executing after test");
}
@AfterSuite
public void afterSuite() {
	System.out.println("Inside after suite/ executing after suite");
}
@Test
public void testCase1() {
	System.out.println("Executing TestCase 1");
}
@Test
public void testCase2() {
	System.out.println("Executing TestCase 2");
}
}
