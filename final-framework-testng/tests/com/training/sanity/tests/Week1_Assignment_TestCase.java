package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sun.jna.platform.win32.WTypes;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.SalesreportPOM;
import com.training.pom.dashboardPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Week1_Assignment_TestCase {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private dashboardPOM dashboardPOM;
	private SalesreportPOM SalesreportPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		dashboardPOM = new dashboardPOM(driver);
		SalesreportPOM = new SalesreportPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test (priority=1)	
	public void validLoginTest() throws InterruptedException 
	{
		
		//----------TEST-CASE-01-----------//
		
		//1. Giving Username
		loginPOM.sendUserName("admin");
		//2.Giving Password
		loginPOM.sendPassword("admin@123");
		//3. Clicking on Login Button
		loginPOM.clickLoginBtn(); 
		//4. Clicking on Expand Button
		dashboardPOM.clickexpandbutton();
		//5. Clicking on reports tab
		dashboardPOM.Reports();
		//6. Clicking on Sales tab
		dashboardPOM.Sales();
		//7. Clicking on Orders tab
		dashboardPOM.Orders();
		//8. Selecting from GroupBy Dropdown
		SalesreportPOM.GroupBy();
		//9. Clicking on Filter button to display the result
		SalesreportPOM.Filter();
		Thread.sleep(5000);
	}
	
	@Test (priority=2)	
	public void validLoginTest2() throws InterruptedException 
	{
		
		//----------TEST-CASE-02-----------//
		
		//1. Giving Username
		loginPOM.sendUserName("admin");
		//2.Giving Password
		loginPOM.sendPassword("admin@123");
		//3. Clicking on Login Button
		loginPOM.clickLoginBtn(); 
		//4. Clicking on Expand Button
		dashboardPOM.clickexpandbutton();
		//5. Clicking on reports tab
		dashboardPOM.Reports();
		//6. Clicking on Sales tab
		dashboardPOM.Sales();
		//7. Clicking on Orders tab
		dashboardPOM.Tax();
		//8. Selecting from GroupBy Dropdown
		SalesreportPOM.GroupBy();
		//9. Clicking on Filter button to display the result
		SalesreportPOM.Filter();
		Thread.sleep(5000);
	}
	
	@Test (priority=3)	
	public void validLoginTest3() throws InterruptedException 
	{
		
		//----------TEST-CASE-03-----------//
		
		//1. Giving Username
		loginPOM.sendUserName("admin");
		//2.Giving Password
		loginPOM.sendPassword("admin@123");
		//3. Clicking on Login Button
		loginPOM.clickLoginBtn(); 
		//4. Clicking on Expand Button
		dashboardPOM.clickexpandbutton();
		//5. Clicking on reports tab
		dashboardPOM.Reports();
		//6. Clicking on Sales tab
		dashboardPOM.Sales();
		//7. Clicking on Orders tab
		dashboardPOM.Shipping();
		//8. Selecting from GroupBy Dropdown
		SalesreportPOM.GroupBy();
		//9. Clicking on Filter button to display the result
		SalesreportPOM.Filter();
		Thread.sleep(5000);
	}
}
