package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.trianing.waits.WaitTypes;

public class LoginPOM {
	private WebDriver driver; 
	private WaitTypes WaitTypes;
	
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		WaitTypes = new WaitTypes(driver);
	}
	
	//username locator
	@FindBy(id="input-username")
	private WebElement userName; 
	
	//Password locator
	@FindBy(id="input-password")
	private WebElement password;
	
	//Login button locator
	@FindBy(xpath="//*[contains(text(),'Login')]")
	private WebElement loginBtn; 

	//Username entry function
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	//Password Entry function
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	//Click Login button function
	public void clickLoginBtn() {
		this.loginBtn.click(); 
		WaitTypes.waitForElement((By.id("button-menu")),30);
		
	}
}

