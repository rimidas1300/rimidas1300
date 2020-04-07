package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.trianing.waits.WaitTypes;

public class SalesreportPOM {
	private WebDriver driver; 
	private WaitTypes WaitTypes;
	
	public SalesreportPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		WaitTypes = new WaitTypes(driver);
		
	}
	
	//Group By Dropdown locator
	@FindBy(xpath="//*[@id='input-group']")
	private WebElement SelectGroupBy;
	
	//Filter button locator
	@FindBy(id="button-filter")
	private WebElement Filterbutton;
	
	//Selecting from Groupby Dropdown function
	public void sendSelectGroupBy() {
		Select dropdown= new Select(SelectGroupBy);
		dropdown.selectByVisibleText("Days");
	}
	
	//Filter button click function
	public void Filterbuttonclick() {
		Filterbutton.click();
		WaitTypes.waitForElement((By.xpath("//td[contains(text(),'Total')]")),1000);
	}
	
	//try and Catch for Groupby dropdown
	public boolean GroupBy ()
	{
	try
	{
	sendSelectGroupBy();
	return true;
	}
	catch(Exception ex)
	{
	return false;
	}
	}
	//try and Catch for Filter button
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
		
	}

