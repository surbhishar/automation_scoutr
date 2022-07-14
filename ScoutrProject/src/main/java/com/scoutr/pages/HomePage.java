package com.scoutr.pages;

import com.scoutr.base.TestBase;
import com.scoutr.util.BusinessComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@placeholder='Email']")
	@CacheLookup
	WebElement email_field;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password_field;

	@FindBy(xpath = "//button[contains(text(),'Sign In')]")
	WebElement btnLogin;


	/**
	 * function to login in the application
	 * @param email
	 * @param pwd
	 */
	public void login(String email, String pwd) {
		try {
			email_field.sendKeys(email);
			Thread.sleep(2000);
			password_field.sendKeys(pwd);
			Thread.sleep(2000);
			btnLogin.isEnabled();
			btnLogin.click();
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println("Error in login --- "+e.getMessage());
		}
	}



	public void enterEmail() {
		email_field.sendKeys("priya@scoutr.team");
	}
	public String geTCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public void enterPassword() {
		password_field.sendKeys("12345678");

	}
	public void clickSignButton() throws InterruptedException {
		btnLogin.click();
		Thread.sleep(2000);

	}

	public boolean isLoginEmailAvailable() {
		return email_field.isDisplayed();
	}

	public String getCurrentTitle() {
		return driver.getCurrentUrl();

	}
}
