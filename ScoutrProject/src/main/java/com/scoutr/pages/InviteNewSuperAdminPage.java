package com.scoutr.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InviteNewSuperAdminPage {
	public static final String systemDir = System.getProperty("user.dir");
	WebDriver driver;

	public InviteNewSuperAdminPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath = "//button[contains(text(),'Invite New Superadmin')]")
	WebElement invite_superadmin;
	
	@FindBy(xpath = "//button[contains(text(),'Admins')]")
	WebElement admin_button;
	
	@FindBy(xpath = "//input[@name='first_name']")
	WebElement first_name;
	
	@FindBy(xpath = "//input[@name='last_name']")
	WebElement last_name;
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement email_address;
	
	@FindBy(xpath = "//div/input[@id='react-select-2-input']")
	WebElement orgnization_dropdown;
	
	@FindBy(xpath = "//div[@id='react-select-2-option-0']")
	WebElement orgnization_name;
	
	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	WebElement cancel_button;
	
	@FindBy(xpath = "//div/input[@placeholder='Search']")
	WebElement new_superadmin_search;
	
	@FindBy(xpath = "//button[@type='submit'][contains(text(),'Invite')]")
	WebElement invite_button; 
	
	@FindBy(xpath = "//button[contains(text(),'Demote Superadmin')][1]")
	WebElement demote_super;
	  
	public void adminButtoncClick() throws InterruptedException{
		Thread.sleep(5000);
		admin_button.isDisplayed();
		admin_button.click();
		Thread.sleep(3000);
	}
	    
	public void inviteNewSuperAdmin() throws InterruptedException{
		JavascriptExecutor je = (JavascriptExecutor) driver;
		invite_superadmin.isDisplayed();
		invite_superadmin.click();
		Thread.sleep(3000);
		first_name.click();
		first_name.sendKeys("Automation new");
		Thread.sleep(1000);
		last_name.click();
		last_name.sendKeys("script");
		Thread.sleep(1000);
		email_address.click();
		email_address.sendKeys("Automationnewfive@scoutr.team");
		Thread.sleep(3000);
		je.executeScript("arguments[0].scrollIntoView(true);",orgnization_dropdown);
		Thread.sleep(1000);
		orgnization_dropdown.click();
		Thread.sleep(1000);
		orgnization_name.click();
		Thread.sleep(2000);
		cancel_button.isDisplayed();
		invite_button.click();
		Thread.sleep(2000);
	}
	public void searchNewSuperAdmin() throws InterruptedException{
		new_superadmin_search.click();
		new_superadmin_search.sendKeys("Automation new");
		Thread.sleep(2000);
	}
	public void cancelNewSuperAdmin() throws InterruptedException{
		invite_superadmin.isDisplayed();
		invite_superadmin.click();
		Thread.sleep(3000);
		first_name.click();
		first_name.sendKeys("Automation new1");
		Thread.sleep(1000);
		last_name.click();
		last_name.sendKeys("script2");
		Thread.sleep(1000);
		email_address.click();
		email_address.sendKeys("Automation@soctur.com");
//		orgnization_dropdown.click();
//		Thread.sleep(1000);
//		orgnization_name.click();
//		Thread.sleep(2000);
		cancel_button.click();
		Thread.sleep(2000);
	}
	public void demoteNewSuperAdmin() throws InterruptedException{
		new_superadmin_search.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		new_superadmin_search.click();
		new_superadmin_search.sendKeys("Automation new");
		Thread.sleep(2000);
		demote_super.isDisplayed();
		demote_super.click();
		Thread.sleep(2000);
	}
}
