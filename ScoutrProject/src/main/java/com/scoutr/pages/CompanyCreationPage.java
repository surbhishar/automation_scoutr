package com.scoutr.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyCreationPage {
	public static final String systemDir = System.getProperty("user.dir");
	WebDriver driver;

	public CompanyCreationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

}
	@FindBy(xpath = "//div/button[contains(text(),'Create a Company')]")
	WebElement create_new_company;
	
	@FindBy(xpath = "//div/input[@name='name']")
	WebElement company_name;
	
	@FindBy(xpath = "//div/textarea[@id='description']")
	WebElement company_description;
	
	@FindBy(xpath = "//div/input[@placeholder='https://']")
	WebElement company_website;
	
	@FindBy(xpath = "//button[contains(text(),'Create')]")
	WebElement company_create;
	
	@FindBy(xpath = "//div/a[contains(text(),'Companies')]")
	WebElement companies;
	
	@FindBy(xpath = "//div/input[@placeholder='Search']")
	WebElement company_search;
	
	@FindBy(xpath = "//button[@class='sc-jHkVzv ekzURv']")
	WebElement company_three_icon;
	
	@FindBy(xpath = "//div[contains(text(),'Edit')]")
	WebElement company_edit_button;
	
	@FindBy(xpath = "//div[contains(text(),'Delete')]")
	WebElement company_delete_button;   
	
	@FindBy(xpath = "//div/input[@name='name']")
	WebElement edit_company_name;   
	
	@FindBy(xpath = "//div/textarea[@id='description']")
	WebElement edit_description_details;   
	
	@FindBy(xpath = "//button[contains(text(),'Edit')]")
	WebElement edit_submit_details;  
	
	@FindBy(xpath = "//div[@class='MuiBox-root css-m7vjd']")
	WebElement delete_message_details;
	
	@FindBy(xpath = "//div/button[contains(text(),'Delete')]")
	WebElement Delete_popup_Button; 
	
	@FindBy(xpath = "//div[contains(text(),'No Data Found...')]")
	WebElement no_data_found;
	
	/**
	 * function to click on the view company details
	 */
	public void clickViewDetails() throws InterruptedException {
		Thread.sleep(5000);
		create_new_company.isDisplayed();
		create_new_company.click();
		Thread.sleep(3000);
	}
	/**
	 * function to create a new company
	 */
	public void enterCompanyDetails() throws InterruptedException {
		company_name.click();
		company_name.sendKeys("Automation New");
		Thread.sleep(1000);
		company_description.click();
		company_description.sendKeys("new automation script");
		Thread.sleep(1000);
		company_website.click();
		company_website.sendKeys("https://webkorps.greythr.com/uas/portal/auth/login?");
		Thread.sleep(1000);
		company_create.click();
		Thread.sleep(5000);
	}
	/**
	 * function to search a new company
	 */
	
	public void serchCompany() throws InterruptedException {
		companies.click();
		Thread.sleep(3000);
		company_search.click();
		company_search.sendKeys("Automation New");
		Thread.sleep(3000);
	}
	
	/**
	 * function to click on three tier icon of company
	 */
	
	public void editCompany() throws InterruptedException {
		company_three_icon.isDisplayed();
		company_three_icon.click();
		company_edit_button.click();
		Thread.sleep(3000);
	}
	/**
	 * function to edit company details
	 */
	public void editCompanyDetails() throws InterruptedException {
		Actions builder=new Actions(driver);
		edit_company_name.click();
		edit_company_name.clear();
		Thread.sleep(3000);
		edit_company_name.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		edit_company_name.sendKeys("Automation Edited company");
		Thread.sleep(3000);
		edit_description_details.click();
		edit_description_details.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		edit_description_details.sendKeys("Edited Automation script");
		Thread.sleep(3000);
		edit_submit_details.click();
		Thread.sleep(5000);
	}
	/**
	 * function to delete a company details
	 */
	public void deleteCompanyDetails() throws InterruptedException {
		companies.click();
		Thread.sleep(3000);
		company_search.click();
		company_search.sendKeys("Automation Edited company");
		Thread.sleep(2000);
		company_three_icon.click();
		company_delete_button.click();
		delete_message_details.isDisplayed();
		Delete_popup_Button.click();
		Thread.sleep(3000);
		no_data_found.isDisplayed();
		Thread.sleep(2000);
	}
}
