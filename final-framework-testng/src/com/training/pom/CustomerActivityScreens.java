package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.trianing.waits.WaitTypes;

public class CustomerActivityScreens {
	private WebDriver driver; 
	private WaitTypes WaitTypes;
	
	public CustomerActivityScreens(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		WaitTypes = new WaitTypes(driver);
		
	}
	
	//--------LOCATORS---------//
	//Filter button locator
	@FindBy(id="button-filter")
	private WebElement Filterbutton;
	
	//Edit option for first customer
	@FindBy(xpath="//*[@id='form-customer']/div/table/tbody/tr[1]/td[8]/a/i")
	private WebElement Editicon;
	
	//FirstName Text Box
	@FindBy(id="input-firstname")
	private WebElement Firstnametextbox;
	
	//Address 1 Tab
	@FindBy(xpath =	"//*[@id='address']/li[2]/a[contains (text(), 'Address 1')]")
	
	private WebElement Address1tab;

	//Post Code text Box
	@FindBy(id="input-postcode1")
	private WebElement Postcodetextbox;
	
	//Rewards Point Tab
	@FindBy(xpath =	"//*[@id='form-customer']/ul/li[4]/a")
	private WebElement RewardsPointtab;

	//Description text box
	@FindBy(id="input-reward-description")
	private WebElement Descriptiontexbox;
	
	//Points text box
	@FindBy(id="input-points")
	private WebElement PointstextBox;
	
	//Add Rewards Points Button
	@FindBy(id="button-reward")
	private WebElement Addrewardspointbutton;
	
	//Save button
	@FindBy(xpath =	"//*[@id='content']/div[1]/div/div/button")
	private WebElement Savebutton;
	
	//Reports Tab locator
	@FindBy(id="reports")
	private WebElement ReportsTab;
	
	//Customers sub tab under Reports Tab locator
	@FindBy(xpath="//*[@id='reports']/ul/li[3]/a[contains (text(), 'Customers')]")
	private WebElement Customerssubtabunderreportstab;
		
	//RewardsPointTab on left panel
	@FindBy(xpath="//li[@id='reports']/ul/li[3]/ul[@class='collapse in']/li[4]/a[contains (text(), 'Reward Points')]")
	private WebElement RewardPointsLeftPanel;
		
	//Success message 1 and 2
	@FindBy(xpath="//div[contains(text(),'Success')]")
	private WebElement successmessage;
	
	
	
	
	
	
	
	//-----FUCTIONS-----//
	//Filter button click function
	public void Filterbuttonclick() {
		Filterbutton.click();
		WaitTypes.waitForElement((By.xpath("//td[contains(text(),'Total')]")),1000);
	}
	//Edit icon click function
	public void EditIconoption() {
		Editicon.click();
		WaitTypes.waitForElement((By.xpath("//*[@id='address']/li[1]/a")),1000);
	}
	//First Name entry function
	public void EnterFirstname(String name) {
		Firstnametextbox.clear();
		Firstnametextbox.sendKeys(name);
	}
	
	//Address1 Tab Click 
	public void Address1tabclick() {
		Address1tab.click();
		WaitTypes.waitForElement((By.xpath("//*[@id='input-company1']")),1000);
	}
		
	//postcode text box entry  
	public void EnterPostCode(String postcode) {
		Postcodetextbox.clear();
		Postcodetextbox.sendKeys(postcode);
	}
	//Rewardspoint tab click
	public void RewardsPointtab() {
		RewardsPointtab.click();
		WaitTypes.waitForElement((By.id("button-reward")),1000);		
	}
	
	//Description text box entry
	public void EnterDescriptionbox(String desc) {
		Descriptiontexbox.clear();
		Descriptiontexbox.sendKeys(desc);
	}
	
	//Points Text box entry
	public void Enterpointsbox(String points) {
		PointstextBox.clear();
		PointstextBox.sendKeys(points);
	}
	//Add Rewards Point button click
	public void ClickAddRewardsPointButton() {
		Addrewardspointbutton.click();
		WaitTypes.waitForElement((By.id("button-reward")),1000);		
	}
	
	//Save button click
	public void ClickSaveButton() {
		Savebutton.click();
		WaitTypes.waitForElement((By.id("button-filter")),1000);		
	}
	
	//Reports Tab function
	public void clickReportsTab() 
	{
		this.ReportsTab.click(); 
		WaitTypes.waitForElement((By.xpath("//a[contains(text(),'Sales')]")),30);
			
	}
		
	//Customers Subtab under reports tab click function
	public void ClickCustomersSubTabUnderReportsTab() 
	{
		this.Customerssubtabunderreportstab.click(); 
		WaitTypes.waitForElement((By.xpath("//li[@id='reports']/ul/li[3]/ul[@class='collapse in']/li[4]/a[contains (text(), 'Reward Points')]")),1000);	
	}
	
	//Reward Points Left Panel Click Function
	public void ClickRewardPointsLeftPanel() 
	{
		this.RewardPointsLeftPanel.click(); 
		WaitTypes.waitForElement((By.id("button-filter")),1000);	
	}
	
	//get the success text message and compare
	public void verifytext(String msg) 
	{
		
		//System.out.println("Success message is : " +this.successmessage.getText());
		String[] arrSplit = this.successmessage.getText().split("\\n");	
		//System.out.println("Splitted text is 1 : "+ arrSplit[0]);
		//System.out.println("Splitted text is 2 : "+ arrSplit[1]);
		
		if (arrSplit[0].equals(msg)) {
			System.out.println("Success Messages are matching");
		} 
		else 
		{
			System.out.println("Success Messages are not matching");
		}
		
	}
	
	
	
	
	
	//-------TRY AND CATCH FUNCTIONS-------//

	public boolean Filter ()
	{
	try
	{
		Filterbuttonclick();
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
		
	public boolean Edit ()
	{
	try
	{
		EditIconoption();
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	public boolean Firstname (String name)
	{
	try
	{
		EnterFirstname(name);
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	public boolean ClickAddressTab ()
	{
	try
	{
		Address1tabclick();
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	public boolean Postcodeentry (String postcode)
	{
	try
	{
		EnterPostCode(postcode);
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	public boolean ClickRewarsPointTab ()
	{
	try
	{
		RewardsPointtab();
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	public boolean Descentry (String desc)
	{
	try
	{
		EnterDescriptionbox(desc);
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}

	public boolean pointsboxentry (String points)
	{
	try
	{
		Enterpointsbox(points);
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	public boolean AddRewardPointsButtonclick ()
	{
	try
	{
		ClickAddRewardsPointButton();
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	public boolean SaveButtonClick()
	{
	try
	{
		ClickSaveButton();
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	public boolean ClickonReportsTab()
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
	
	
	public boolean CustomersSubTabClickUnderReportsTab()
	{
	try
	{
		ClickCustomersSubTabUnderReportsTab();
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	public boolean LeftPanelRewardPointsClick()
	{
	try
	{
		ClickRewardPointsLeftPanel();
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	public boolean SuccessmsgVerify(String msg)
	{
	try
	{
		verifytext(msg);
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	
	}

