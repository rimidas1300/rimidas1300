package com.training.sanity.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
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
import com.training.pom.dashboardPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;
import com.training.pom.CustomerActivityScreens;

public class Week2_Assignment_TestCase {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private dashboardPOM dashboardPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private CustomerActivityScreens CustomerActivityScreens;

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
		CustomerActivityScreens = new CustomerActivityScreens(driver);
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
		//5. Clicking on Customers tab
		dashboardPOM.clickCustomersTab();
		//6. Click on Customers Sub Tab
		dashboardPOM.CustomersSub();
		//7. Click on edit option for first customer
		CustomerActivityScreens.Edit();
		//8. Enter FirstName
		CustomerActivityScreens.Firstname("Deepa");
		//9. Click on Address1 Tab
		CustomerActivityScreens.ClickAddressTab();
		//10. Enter post code
		CustomerActivityScreens.Postcodeentry("8796545");
		//11. Rewards point tab click
		CustomerActivityScreens.ClickRewarsPointTab();
		//12. Enter text in description text box
		CustomerActivityScreens.Descentry("Festival bonanza");
		//13.Enter in the points box
		CustomerActivityScreens.pointsboxentry("30");
		//14. Click on Add Rewards point button
		CustomerActivityScreens.AddRewardPointsButtonclick();
		//... Verify success message
		CustomerActivityScreens.SuccessmsgVerify("Success: You have modified customers!");
		//15. Click on Save button
		CustomerActivityScreens.SaveButtonClick();
		//...Verify success message
		CustomerActivityScreens.SuccessmsgVerify("Success: You have modified customers!");
		//16. Click on reports icon on the left
		CustomerActivityScreens.ClickonReportsTab();
		//17.Click on Customers link under Reports Tab
		CustomerActivityScreens.ClickCustomersSubTabUnderReportsTab();
		//18. Click on Reward Points link
		CustomerActivityScreens.LeftPanelRewardPointsClick();
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
		//5. Clicking on Dashboard tab
		dashboardPOM.Dashboardiconclick();
		//6. Click on View Icon
		dashboardPOM.ViewIconClick();
		//7. Click on Print Invoice
		dashboardPOM.PrintInvoiceClick();
		//8. Record the Invoice Number
		dashboardPOM.GetInvoiceNumber();
		 //...Navigating to previous tab
		dashboardPOM.Switchtotab();
		//9. Select Complete from Order Status Dropdown
		dashboardPOM.CompleteOptionfromDropdown();
		//10. Click on Add History Button
		dashboardPOM.ClickOnAddHitoryButton();
		//11. Verify success message
		CustomerActivityScreens.SuccessmsgVerify("Success: You have modified orders!");
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
		//5. Clicking on Sales tab
		dashboardPOM.ClickSalesMaintab();
		//6. Click on Orders Subtab
		dashboardPOM.OrdersSubTab();
		//7. Click on Add new Button
		dashboardPOM.AddNewOrderclick();
		//8. Enter the details to add the order
		dashboardPOM.Enter_Fname_Orders("Hema");
		dashboardPOM.Enter_Lname_Orders("Chandra");
		dashboardPOM.Enter_Email_Orders("hema.chandra@gmail.com");
		dashboardPOM.EnterTelephoneNumber("9654321678");
		dashboardPOM.Continue_Click_Orders();
		dashboardPOM.ChooseProduct_Enter("Blazer Girls");
		dashboardPOM.Enter_Qty_Orders("1");
		dashboardPOM.ClickAddProduct();
		dashboardPOM.ClickContinue_inProduct();
		dashboardPOM.Enter_Fname_Payment("Hema");
		dashboardPOM.Enter_Lname_Payment("Chandra");
		dashboardPOM.Enter_Address1_Payment("6th Phase");
		dashboardPOM.Enter_Address2_Payment("J P Nagar");
		dashboardPOM.Enter_City_Payment("bangalore");
		dashboardPOM.Enter_postcode_Payment("560078");
		dashboardPOM.selectcountryinpayment();
		dashboardPOM.selectregioninpayment();
		dashboardPOM.ClickContinueinPayment();
		dashboardPOM.Enter_Fname_Shipping("Hema");
		dashboardPOM.Enter_Lname_Shipping("Chandra");
		dashboardPOM.Enter_Address1_Shipping("8th Phase");
		dashboardPOM.Enter_Fname_Shipping("P J Nagar");
		dashboardPOM.Enter_City_Shipping("Thrichur");
		dashboardPOM.Enter_postcode_Shipping("569876");
		dashboardPOM.SelectCountryInShipping();
		dashboardPOM.SelectRegionInShipping();
		dashboardPOM.ClickContinueinShipping();
		dashboardPOM.shippingmethoddropdown();
		dashboardPOM.paymentmethoddropdown();
		//9. Click on Save button to generate the order
		dashboardPOM.ClickSaveButton();
		CustomerActivityScreens.SuccessmsgVerify("Success: You have modified orders!");
		
		Thread.sleep(5000);
	}

}
