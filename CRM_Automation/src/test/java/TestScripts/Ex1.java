package TestScripts;
import org.testng.Reporter;
import org.testng.annotations.*;
public class Ex1 
{
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
}
