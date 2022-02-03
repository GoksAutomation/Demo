package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo1 {
	//enabled false then case will not execute
	//@Test(enabled=true)
	@Test(dataProvider="getData")
	public void test(String fname, String pwd) {
		System.out.println("testNg exec in progress group exe");
		System.out.println(fname+"  "+pwd);
	}
	
	@Test(timeOut = 4000)
	@Parameters({"url"})
	public void test2(String tradingurl) {
		System.out.println("testNg exec going good");
		System.out.println(tradingurl);
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("this tc will execute after all");
	}

	@Test
	@BeforeTest
	public void test3() {
		System.out.println("testNg exec going well");
	}
	

	@Test(dependsOnMethods = "test3")
	public void depends() {
		System.out.println("testNg exec depends on another");
	}
	
	@DataProvider
	public Object[][] getData() {
		//3 scenarios- Username password
		Object[][] data=new Object[3][2];
		data[0][0]="firstUsername";
		data[0][1]="firstPassword";
		
		data[1][0]="secondUsername";
		data[1][1]="secondPassword";
		
		data[2][0]="thirdUsername";
		data[2][1]="thirdPassword";
		return data;
	}
	
}
