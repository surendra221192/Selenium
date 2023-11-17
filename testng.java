package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testng {
	private static final boolean False = false;

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("before suite");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class");
		
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("before test");
	}
	@Test(enabled=False)

	public void test()
	{
		System.out.println("test");
		
	}
	@Test(dependsOnMethods="test2")
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(description="test2 testcase" , invocationCount=3)
	public void test2()
	{
		System.out.println("test2");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("after test");
	}
	@AfterMethod
	public void afterMethods()
	{
		System.out.println("after methods");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class");
	}

	@AfterSuite
	public void afterSuite()
	{
		System.out.println("after suite");
}
}