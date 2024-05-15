package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceLoginPage {
	
	WebDriver driver;
	
	public SauceLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "user-name")
	private WebElement userNameField;
	
	@FindBy(name = "password")
	private WebElement passwordField;
	
	@FindBy(name = "login-button")
	private WebElement loginButton;
	
	
	public void login(String user, String password) {
		userNameField.sendKeys(user);
		passwordField.sendKeys(password);
		loginButton.click();
	}

}