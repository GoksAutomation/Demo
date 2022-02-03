package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {
	
	@Test(groups={"Smoke"})
	public void test() {
		System.out.println("TestNg inprogress group execution");
	}
	
	@BeforeMethod
	public void befroeMethod() {
		System.out.println("Running before method from Demo class");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Running after method from Demo class");
	}

}
