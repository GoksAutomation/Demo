package Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicIntro {

	@Test(groups={"Smoke"})
	public void Demobasics() {
		System.out.println("TestNg started group execution");
	}
	
	@BeforeSuite
	public void beforeTest() {
		System.out.println("This TC run 1st from beforeTest");
	}
	
	@Test
	@AfterTest
	public void Demo1() {
		System.out.println("TestNg started long back");
	}

}
