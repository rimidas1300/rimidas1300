package com.training.pom;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.trianing.waits.WaitTypes;

public class dashboardPOM {
	private WebDriver driver; 
	private WaitTypes WaitTypes;
	
	public dashboardPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		WaitTypes = new WaitTypes(driver);
	}
	
	//----------LOCATORS---------//
	
	//expand locator
	@FindBy(id="button-menu")
	private WebElement expand;
	
	//Reports Tab locator
	@FindBy(id="reports")
	private WebElement ReportsTab;
	
	//Sales sub tab under Reports main tab - locator
	@FindBy(xpath="//a[contains(text(),'Sales')]")
	private WebElement SalesTab;

	//Orders tab locator
	@FindBy(xpath="//li[@id='reports']/ul/li/ul[@class='collapse in']/li/a[contains (text(), 'Orders')]")
	private WebElement OrdersTab;
	
	//Tax tab locator
	@FindBy(xpath="//li[@id='reports']/ul/li/ul[@class='collapse in']/li/a[contains (text(), 'Tax')]")
	private WebElement TaxTab;
	
	//Shipping tab locator
		@FindBy(xpath="//li[@id='reports']/ul/li/ul[@class='collapse in']/li/a[contains (text(), 'Shipping')]")
		private WebElement ShippingTab;
	
	//Customers tab locator
		@FindBy(id="customer")
		private WebElement CustomersTab;
	
	//Customers sub tab locator 
		@FindBy(xpath="//*[@id='customer']/ul/li[1]/a[contains (text(), 'Customers')]")
		private WebElement Customerssubtab;
		
		
	//Dashboard locator
		@FindBy(id="dashboard")
		private WebElement dashboard;
		
	// view con
		@FindBy(xpath="//a[@data-original-title='View']")
		private WebElement viewicon;
		
	//Print Invoice
		@FindBy(xpath="//a[@data-original-title='Print Invoice']")
		private WebElement printinvoice;
		
	//Invoice Number
		@FindBy(xpath="//h1[contains(text(),'Invoice')]")
		private WebElement invoicenumber;
		
	//Select Order Status
		@FindBy(id="input-order-status")
		private WebElement orderstatusdropdown;
		
		
	//Add History Buton
		@FindBy(id="button-history")
		private WebElement addhistorybutton;
		
	//Sales main tab locator
		@FindBy(xpath="//span[contains(text(),'Sales')]")
		private WebElement Sales2Tab;	
		
	//Orders Tab under Sales main tab
		@FindBy(xpath="//a[contains(text(),'Orders')]")
		private WebElement Orders2Tab;
	
	//Add New Button for Orders to add
		@FindBy(xpath="//a[@data-original-title='Add New']")
		private WebElement Addnew;
	//First Name in Add Orders Page
		@FindBy(id="input-firstname")
		private WebElement firstname_1;
	//Last Name in Add Orders Page
		@FindBy(id="input-lastname")
		private WebElement Lastname_1;
	//Email in Add Orders Page
		@FindBy(id="input-email")
		private WebElement Email;
	//Telephone in Add Orders Page
		@FindBy(id="input-telephone")
		private WebElement Telephone;
	//Continue Button in Add Orders Page
		@FindBy(id="button-customer")
		private WebElement Continue_Orders;
	//Choose Product in Products Screen
		@FindBy(id="input-product")
		private WebElement ChooseProduct;
	//Quantity text box in Products Screen
		@FindBy(id="input-quantity")
		private WebElement Quantity;
	//Add Product Button 
		@FindBy(xpath="//*[contains(text(),' Add Product')]")
		private WebElement AddProduct;
	//Continue Button in Add Products Page
		@FindBy(id="button-cart")
		private WebElement Continue_Product;
	//First Name in Payment Details Page
		@FindBy(id="input-payment-firstname")
		private WebElement payment_firstname;
	//Last Name in Payment Details Page
		@FindBy(id="input-payment-lastname")
		private WebElement payment_Lastname;
	//Address 1 in Payment Page
		@FindBy(id="input-payment-address-1")
		private WebElement Address1_payment;
	//Address 2 in Payment Page
		@FindBy(id="input-payment-address-2")
		private WebElement Address2_payment;
	//City in Payment Page
		@FindBy(id="input-payment-city")
		private WebElement City_payment;
	//PostCode in Payment Page
		@FindBy(id="input-payment-postcode")
		private WebElement PostCode_payment;
	//Country Dropdown in Payment Page
		@FindBy(id="input-payment-country")
		private WebElement Country_payment;
	//Region Dropdown in Payment Page
		@FindBy(id="input-payment-zone")
		private WebElement Region_payment;
	//Continue button at Payment page
		@FindBy(id="button-payment-address")
		private WebElement Continue_Payment;	
	//First Name in Shipping Details Page
		@FindBy(id="input-shipping-firstname")
		private WebElement shipping_firstname;
	//Last Name in Shipping Details Page
		@FindBy(id="input-shipping-lastname")
		private WebElement shipping_Lastname;
	//Address 1 in Shipping Details Page
		@FindBy(id="input-shipping-address-1")
		private WebElement Address1_shipping;
	//Address 2 in Shipping Details Page
		@FindBy(id="input-shipping-address-2")
		private WebElement Address2_shipping;
	//City in Shipping Details Page
		@FindBy(id="input-shipping-city")
		private WebElement City_shipping;
	//PostCode in Shipping Details Page
		@FindBy(id="input-shipping-postcode")
		private WebElement PostCode_shipping;
	//Country Dropdown in Shipping Details Page
		@FindBy(id="input-shipping-country")
		private WebElement Country_shipping;
	//Region Dropdown in Shipping Details Page
		@FindBy(id="input-shipping-zone")
		private WebElement Region_shipping;
	//Continue button in Shipping Details Page
		@FindBy(id="button-shipping-address")
		private WebElement Continue_shipping;	
	//Shipping method dropdown
		@FindBy(id="input-shipping-method")
		private WebElement shipping_method;		
	//Payment method dropdown
		@FindBy(id="input-payment-method")
		private WebElement payment_method;	
	//Save button
		@FindBy(id="button-save")
		private WebElement Savebuton;
		
		
		
		
		
	//--------FUNCTIONS---------//
	//Expand function
	public void clickexpand() 
	{
		this.expand.click(); 
		WaitTypes.waitForElement((By.id("reports")),30);
	}
	
	//Reports Tab function
	public void clickReportsTab() 
	{
		this.ReportsTab.click(); 
		WaitTypes.waitForElement((By.xpath("//a[contains(text(),'Sales')]")),30);
		
	}
	
	//Sales Tab Function
	public void clickSalesTab() 
	{
		this.SalesTab.click(); 
		WaitTypes.waitForElement((By.xpath("//li[@id='reports']/ul/li/ul[@class='collapse in']/li/a[contains (text(), 'Orders')]")),30);
	}
	
	//Orders Tab function 
	public void clickOrdersTab() 
	{
		this.OrdersTab.click(); 
		WaitTypes.waitForElement((By.id("button-filter")),30);
	}
	
	//Tax tab function 
	public void clickTaxTab() 
	{
		this.TaxTab.click(); 
		WaitTypes.waitForElement((By.id("button-filter")),30);
	}
	
	//Shipping tab function
	public void clickShippingTab() 
	{
		this.ShippingTab.click(); 
		WaitTypes.waitForElement((By.id("button-filter")),30);
	}
	//Customers tab function
		public void clickCustomersTab() 
		{
			this.CustomersTab.click(); 
			WaitTypes.waitForElement((By.xpath("//*[@id='customer']/ul/li[1]/a[contains (text(), 'Customers')]")),100);
		}
	//Customers sub tab function
			public void clickCustomersSubTab() 
			{
			 this.Customerssubtab.click(); 
			 WaitTypes.waitForElement((By.id("button-filter")),100);
			}
	
	//Dashboard icon click
			public void clickDashboardicon() 
			{
			 this.dashboard.click(); 
			 WaitTypes.waitForElement((By.xpath("//h1[contains(text(),'Dashboard')]")),100);
			}
	//View icon click 
			public void clickviewicon() 
			{
			 this.viewicon.click(); 
			 WaitTypes.waitForElement((By.xpath("//h1[contains(text(),'Orders')]")),100);
			}
			
	//Print Invoice Click
			public void clickprintinvoice() 
			{
			 this.printinvoice.click(); 
			 WaitTypes.waitForElement((By.xpath("//h1[contains(text(),'Orders')]")),100);
			}
			
	//get Invoice Number
			public void getinvoicenumber() 
			{
			 ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));
			//driver.getCurrentUrl();
			String msg = this.invoicenumber.getText();
			 System.out.println("The Invoice Number is :" + msg);
			}
			
	// Select Complete option from Order Status Dropdown
			public void SelectCompletefromdropdown() 
			{
				Select dropdown= new Select(orderstatusdropdown);
				dropdown.selectByVisibleText("Complete");
			}
			
	// Click on Add History Button
			public void Clickaddhistorybutton() 
			{
			 this.addhistorybutton.click(); 
			 WaitTypes.waitForElement((By.id("button-history")),100);
			}
			
			
	// Switching between tabs
			public void switchToTab()
			{
				//driver.switchTo().defaultContent(); 
				ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
			    driver.switchTo().window(tabs2.get(1));
			    driver.close();
			    driver.switchTo().window(tabs2.get(0));
			}
			
	//Clicking on Sales Main Tab
			public void SalesMainTab() 
			{
			 this.Sales2Tab.click(); 
			 WaitTypes.waitForElement((By.xpath("//a[contains(text(),'Orders')]")),100);
			} 
	//Clicking on Order Subtab under Sales main tab
			public void OrdersSubTab() 
			{
			 this.Orders2Tab.click(); 
			 WaitTypes.waitForElement((By.xpath("//a[@data-original-title='Add New']")),100);
			}
    //Clicking on Add New icon
			public void AddNewOrder() 
			{
			 this.Addnew.click(); 
			 WaitTypes.waitForElement((By.id("input-firstname")),100);
			}
	//Enter First Name in Add Orders Page
			public void sendF_Name(String userName) 
			{
				this.firstname_1.clear();
				this.firstname_1.sendKeys(userName);
			}
	//Enter Last Name in Add Orders Page
			public void sendL_Name(String userName) 
			{
				this.Lastname_1.clear();
				this.Lastname_1.sendKeys(userName);
			}
	//Enter Email in Add Orders Page
			public void send_Email(String userName) 
			{
				this.Email.clear();
				this.Email.sendKeys(userName);
			}
	//Enter Telephone in Add Orders Page
			public void send_Telephone(String userName) 
			{
				this.Telephone.clear();
				this.Telephone.sendKeys(userName);
			}
			
	//Click on Continue button in Add Orders Page
			public void Order_Continue() 
			{
			 this.Continue_Orders.click(); 
			 WaitTypes.waitForElement((By.id("input-product")),100);
			}
	//Enter Choose Product in Products Screen
			public void ChooseProduct(String userName) 
			{
				this.ChooseProduct.click();
				this.ChooseProduct.clear();
				this.ChooseProduct.sendKeys(userName);
				WaitTypes.waitForElement((By.xpath("//*[contains(text(),'Blazer Girls(7-8)')]")),100);
				driver.findElement(By.xpath("//*[contains(text(),'Blazer Girls(7-8)')]")).click();
				
			}
			
	//Enter Quantity in Products Screen
			public void Qty(String userName) 
			{
				this.Quantity.clear();
				this.Quantity.sendKeys(userName);
			}
	//Click on Add Product Button
			
			public void AddProduct() 
			{
			 this.AddProduct.click(); 
			 WaitTypes.waitForElement((By.xpath("//input[@name='product[0][quantity]']")),100);
			}
    // Click on Continue button in Add Product page
			public void Product_Continue() 
			{
			 this.Continue_Product.click(); 
			 WaitTypes.waitForElement((By.id("input-payment-firstname")),100);
			}
	//Enter First Name in Payment Details Page	
			public void send_FirstName(String userName) 
			{
				this.payment_firstname.clear();
				this.payment_firstname.sendKeys(userName);
			}
	//Enter Last Name in Payment Details Page	
			public void send_LastName(String userName) 
			{
				this.payment_Lastname.clear();
				this.payment_Lastname.sendKeys(userName);
			}
	//Enter Address1 in Payment Details Page	
			public void send_Address1(String userName) 
			{
				this.Address1_payment.clear();
				this.Address1_payment.sendKeys(userName);
			}
	//Enter Address2 in Payment Details Page	
			public void send_Address2(String userName) 
			{
				this.Address2_payment.clear();
				this.Address2_payment.sendKeys(userName);
			}	
	//Enter City in Payment Page	
			public void send_City_Payment(String userName) 
			{
				this.City_payment.clear();
				this.City_payment.sendKeys(userName);
			}	
	//Enter PostCode in Payment Page	
			public void send_postcode_Payment(String userName) 
			{
				this.PostCode_payment.clear();
				this.PostCode_payment.sendKeys(userName);
			}	

	//select Country Dropdown in Payment Page	
			public void selectcountryinpayment() 
			{
				Select dropdown= new Select(Country_payment);
				dropdown.selectByVisibleText("India");
			}
	//select Region Dropdown in Payment Page	
			public void selectregioninpayment() 
			{
				Select dropdown= new Select(Region_payment);
				dropdown.selectByVisibleText("Karnataka");
			}
	//Clcik on Continue button at Payment page
			public void ClickContinuePayment() 
			{
			 this.Continue_Payment.click(); 
			 WaitTypes.waitForElement((By.id("input-shipping-firstname")),100);
			}
	//Enter FirstName in the Shipping Details Page
			public void send_shipping_fname(String userName) 
			{
				this.shipping_firstname.clear();
				this.shipping_firstname.sendKeys(userName);
			}	
	//Enter LastName in the Shipping Details Page
			public void send_shipping_lname(String userName) 
			{
				this.shipping_Lastname.clear();
				this.shipping_Lastname.sendKeys(userName);
			}		
	//Enter Address1 in Shipping Details Page	
			public void send_Address1_shipping(String userName) 
			{
				this.Address1_shipping.clear();
				this.Address1_shipping.sendKeys(userName);
			}
	//Enter Address2 in Shipping Details Page	
			public void send_Address2_shipping(String userName) 
			{
				this.Address2_shipping.clear();
				this.Address2_shipping.sendKeys(userName);
			}	
	//Enter City in shipping details Page	
			public void send_City_Shipping(String userName) 
			{
				this.City_shipping.clear();
				this.City_shipping.sendKeys(userName);
			}	
	//Enter PostCode in shipping details Page	
			public void send_postcode_Shipping(String userName) 
			{
				this.PostCode_shipping.clear();
				this.PostCode_shipping.sendKeys(userName);
			}	

	//select Country Dropdown in shipping details  Page	
			public void selectcountryinshipping() 
			{
				Select dropdown= new Select(Country_shipping);
				dropdown.selectByVisibleText("India");
			}
	//select Region Dropdown in shipping details  Page	
			public void selectregioninshipping() 
			{
				Select dropdown= new Select(Region_shipping);
				dropdown.selectByVisibleText("Kerala");
			}
	//Click on Continue button at shipping details page
			public void ClickContinueShipping() 
			{
			 this.Continue_shipping.click(); 
			 WaitTypes.waitForElement((By.id("input-shipping-method")),100);
			}
	//Select from Shipping method dropdown
			public void shippingmethoddropdown() 
			{
				Select dropdown= new Select(shipping_method);
				dropdown.selectByVisibleText("Free Shipping - ₹0");
			}
	//Select from Shipping method dropdown
			public void paymentmethoddropdown() 
			{
				Select dropdown= new Select(payment_method);
				dropdown.selectByVisibleText("Cash On Delivery");
			}
	//Click on Save button
			public void Savebutton() 
			{
			 this.Savebuton.click(); 
			 WaitTypes.waitForElement((By.id("input-shipping-method")),100);
			}
			
			
			
	
	//-------TRY CATCH FUNCTIONS------//
	
	//Expand function
	public boolean clickexpandbutton ()
	{
	try
	{
		clickexpand();
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	//Reports Tab function
	public boolean Reports ()
	{
	try
	{
		clickReportsTab();
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	//Sales tab function
	public boolean Sales ()
	{
	try
	{
		clickSalesTab();
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	//Orders Tab function
	public boolean Orders ()
	{
	try
	{
		clickOrdersTab();
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	//Tax tab function
	public boolean Tax ()
	{
	try
	{
		clickTaxTab();
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	//Shipping Tab Function
	public boolean Shipping ()
	{
	try
	{
		clickShippingTab();
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	//Customers Tab Function
	public boolean Customers ()
	{
	try
	{
		clickCustomersTab();
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	//Customers Sub Tab Function
	public boolean CustomersSub ()
	{
	try
	{
		clickCustomersSubTab();
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	//Dashboard icon click
	public boolean Dashboardiconclick ()
	{
	try
	{
		clickDashboardicon();
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	//View Icon Click
	public boolean ViewIconClick ()
	{
	try
	{
		clickviewicon();
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	//Print Invoice Click
	public boolean PrintInvoiceClick ()
	{
	try
	{
		clickprintinvoice();
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	//Get Invoice Number
	public boolean GetInvoiceNumber ()
	{
	try
	{
		getinvoicenumber();
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	//Select Complete from Order Status Dropdown
	public boolean CompleteOptionfromDropdown ()
	{
	try
	{
		SelectCompletefromdropdown();
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	//Click on Add History Button
	public boolean ClickOnAddHitoryButton ()
	{
	try
	{
		Clickaddhistorybutton();
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	// Switching to previous tab
	public boolean Switchtotab ()
	{
	try
	{
		switchToTab();
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	public boolean ClickSalesMaintab ()
	{
	try
	{
		SalesMainTab();
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	public boolean ClickOrdersSubtab ()
	{
	try
	{
		OrdersSubTab();
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	public boolean AddNewOrderclick ()
	{
	try
	{
		AddNewOrder();
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	public boolean Enter_Fname_Orders (String msg)
	{
	try
	{
		sendF_Name(msg);
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	public boolean Enter_Lname_Orders (String msg)
	{
	try
	{
		sendL_Name(msg);
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	public boolean Enter_Email_Orders (String msg)
	{
	try
	{
		send_Email(msg);
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	public boolean Continue_Click_Orders ()
	{
	try
	{
		Order_Continue();
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	public boolean ChooseProduct_Enter (String msg)
	{
	try
	{
		ChooseProduct(msg);
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	public boolean Enter_Qty_Orders (String msg)
	{
	try
	{
		Qty(msg);
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	public boolean ClickAddProduct()
	{
	try
	{
		AddProduct();
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	public boolean ClickContinue_inProduct ()
	{
	try
	{
		Product_Continue();
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	public boolean Enter_Fname_Payment (String msg)
	{
	try
	{
		send_FirstName(msg);
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	public boolean Enter_Lname_Payment (String msg)
	{
	try
	{
		send_LastName(msg);
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	public boolean Enter_Address1_Payment (String msg)
	{
	try
	{
		send_Address1(msg);
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	public boolean Enter_Address2_Payment (String msg)
	{
	try
	{
		send_Address2(msg);
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	public boolean Enter_City_Payment (String msg)
	{
	try
	{
		send_City_Payment(msg);
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	public boolean Enter_postcode_Payment (String msg)
	{
	try
	{
		send_postcode_Payment(msg);
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	public boolean SelectCountryInPayment ()
	{
	try
	{
		selectcountryinpayment();
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	public boolean SelectRegionInPayment ()
	{
	try
	{
		selectregioninpayment();
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	public boolean ClickContinueinPayment ()
	{
	try
	{
		ClickContinuePayment();
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	
	
	
	
	
	
	
	public boolean Enter_Fname_Shipping (String msg)
	{
	try
	{
		send_shipping_fname(msg);
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	public boolean Enter_Lname_Shipping (String msg)
	{
	try
	{
		send_shipping_lname(msg);
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	public boolean Enter_Address1_Shipping (String msg)
	{
	try
	{
		send_Address1_shipping(msg);
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	public boolean Enter_Address2_Shipping (String msg)
	{
	try
	{
		send_Address2_shipping(msg);
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	public boolean Enter_City_Shipping (String msg)
	{
	try
	{
		send_City_Shipping(msg);
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	public boolean Enter_postcode_Shipping (String msg)
	{
	try
	{
		send_postcode_Shipping(msg);
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	public boolean SelectCountryInShipping ()
	{
	try
	{
		selectcountryinshipping();
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	public boolean SelectRegionInShipping ()
	{
	try
	{
		selectregioninshipping();
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	public boolean ClickContinueinShipping ()
	{
	try
	{
		ClickContinueShipping();
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	public boolean SelectPaymentMethodDropdown ()
	{
	try
	{
		paymentmethoddropdown();
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	public boolean SelectShippingMethodDropdown ()
	{
	try
	{
		shippingmethoddropdown();
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	public boolean ClickSaveButton ()
	{
	try
	{
		Savebutton();
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	public boolean EnterTelephoneNumber (String msg)
	{
	try
	{
		send_Telephone(msg);
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	

}

