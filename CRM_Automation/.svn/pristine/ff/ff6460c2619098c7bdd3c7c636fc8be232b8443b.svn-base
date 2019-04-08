package TestScripts;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ex2 {
	@BeforeClass
	public void method1()
	{
		System.out.println("Method1");
	}
	@AfterClass
	public void method2()
	{
		System.out.println("Method2");
	}
	@Test(priority=2)
	public void method3()
	{
		System.out.println("Method3");
		Reporter.log("TestNG Framework");
	}
	@Test(priority=1)
	public void method4()
	{
		System.out.println("Method4");
		Reporter.log("TestNG Framework");
	}
	@BeforeMethod
	public void method5()
	{
		System.out.println("Method5");
	}
	@AfterMethod
	public void method6()
	{
		System.out.println("Method6");
	}
}
