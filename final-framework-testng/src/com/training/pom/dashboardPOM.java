package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trianing.waits.WaitTypes;

public class dashboardPOM {
	private WebDriver driver; 
	private WaitTypes WaitTypes;
	
	public dashboardPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		WaitTypes = new WaitTypes(driver);
	}
	
	//expand locator
	@FindBy(id="button-menu")
	private WebElement expand;
	
	//Reports Tab locator
	@FindBy(id="reports")
	private WebElement ReportsTab;
	
	//Sales tab locator
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
	
	//Try-catch Functions
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
}

