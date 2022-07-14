package com.scoutr.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCompanyAdminPage {
	public static final String systemDir = System.getProperty("user.dir");
	WebDriver driver;
	public NewCompanyAdminPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
}
	 @FindBy(xpath = "//div/a[contains(text(),'Company Admins')]")
	 WebElement company_admin;
	 
	 @FindBy(xpath = "//button[contains(text(),'Invite New Company Admin')]")
	 WebElement invitenew_companyadmin;
	 
	 @FindBy(xpath = "//input[@name='firstname']")
	 WebElement first_name;
	 
	 @FindBy(xpath = "//input[@name='lastname']")
	 WebElement last_name;
	 
	 @FindBy(xpath = "//input[@name='email']")
	 WebElement email_address;
	 
	 @FindBy(xpath = "//input[@id='phone_number']")
	 WebElement phone_number;
	 
	 @FindBy(xpath = "//div[@class=' css-wa0srw-container']")
	 WebElement company_dropdown;
	 
	 @FindBy(xpath = "//button[contains(text(),'Cancel')]")
	 WebElement cancel_button;
	 
	 @FindBy(xpath = "//button[@type='submit'][contains(text(),'Invite')]")
	 WebElement invite_button; 
	 
	 @FindBy(xpath = "//div/input[@placeholder='Search']")
	 WebElement new_companyadmin_search;
	 
	 @FindBy(xpath = "//button[@class='sc-lkgTHX eVieDc']")
	 WebElement teams_three_icon;
	 
	 @FindBy(xpath = "//div[contains(text(),'Edit')]")
	 WebElement new_companyadmin_edit;
	 
	 @FindBy(xpath = "//div[contains(text(),'Deactivate')]")
	 WebElement new_companyadmin_deactive;
	 
	 @FindBy(xpath = "//div[contains(text(),'Activate')]")
	 WebElement new_companyadmin_active;
	 
	 @FindBy(xpath = "//div[contains(text(),'Change to Manager')]")
	 WebElement change_to_manager;
	 
	 @FindBy(xpath = "//div[contains(text(),'Delete')]")
	 WebElement new_companyadmin_delete;
	 
	 @FindBy(xpath = "//button[contains(text(),'Cancel')]")
	 WebElement new_companyadmin_cancel;
	 
	 @FindBy(xpath = "//button[contains(text(),'Save')]")
	 WebElement new_companyadmin_save;
	 
	 @FindBy(xpath = "//button[contains(text(),'Confirm')]")
	 WebElement new_chane_to_manager_confirm;
	 
	 @FindBy(xpath = "//div/a[contains(text(),'Managers')]")
	 WebElement header_manager;
	 
	 @FindBy(xpath = "//div[contains(text(),'Change to Company Admin')]")
	 WebElement change_to_company_admin;
	 
	 @FindBy(xpath = "//div[contains(text(),'No Data Found...')]")
	 WebElement no_data_found;
	 
	 @FindBy(xpath = "//div[@id='react-select-2-listbox']/div/div")
		WebElement companies_name;
	 
	 @FindBy(xpath = "//button[contains(text(),'Delete')]")
	 WebElement companies_delete_button;

	 public static String DataName="demotwo";
	 public static String DataMail="demotwo@gmail.com";
	 
	 
	 
	 public void companyAdminButtonClick() throws InterruptedException{
		 Thread.sleep(5000);
		 company_admin.isDisplayed();
		 company_admin.click();
		 Thread.sleep(3000);
		}
	 
	 public void inviteNewCompanyAdmin() throws InterruptedException{
		   invitenew_companyadmin.isDisplayed();
		   invitenew_companyadmin.click();
			Thread.sleep(3000);
			first_name.click();
			first_name.sendKeys(DataName);
			Thread.sleep(1000);
			last_name.click();
			last_name.sendKeys("script");
			Thread.sleep(1000);
			email_address.click();
			email_address.sendKeys(DataMail);
			phone_number.click();
			phone_number.sendKeys("9876543218");
			Thread.sleep(2000);
			company_dropdown.click();
			Thread.sleep(2000);
			companies_name.click();
			Thread.sleep(1000);
			cancel_button.isDisplayed();
			invite_button.click();
			Thread.sleep(2000);
		}
	 public void searchNewCompanyAdmin() throws InterruptedException{
		 new_companyadmin_search.click();
		 new_companyadmin_search.sendKeys(DataName);
		 Thread.sleep(2000);
		}
	 public void cancelNewCompanyAdmin() throws InterruptedException{
		    invitenew_companyadmin.isDisplayed();
		    invitenew_companyadmin.click();
			Thread.sleep(3000);
			first_name.click();
			first_name.sendKeys("Automation new3");
			Thread.sleep(1000);
			last_name.click();
			last_name.sendKeys("script2");
			Thread.sleep(1000);
			email_address.click();
			email_address.sendKeys("Automationone@gmail.com");
			phone_number.click();
			phone_number.sendKeys("9876543218");
			Thread.sleep(2000);
			cancel_button.click();
			Thread.sleep(2000);
		}
	 
	 public void editNewCompanyAdmin() throws InterruptedException{
		 new_companyadmin_search.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 Thread.sleep(1000);
		 new_companyadmin_search.click();
		 new_companyadmin_search.sendKeys(DataName);
		 Thread.sleep(2000);
		 teams_three_icon.click();
		 Thread.sleep(2000);
		 new_companyadmin_edit.click();
		 Thread.sleep(2000);
		 first_name.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 Thread.sleep(1000);
		 first_name.sendKeys("Automation new edit3");
		 last_name.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 Thread.sleep(1000);
		 last_name.sendKeys("edited");
		 new_companyadmin_cancel.isDisplayed();
		 new_companyadmin_save.click();
		 Thread.sleep(2000);
		}
	  
	 public void deactiveNewCompanyAdmin() throws InterruptedException{
		 new_companyadmin_search.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 new_companyadmin_search.click();
		 new_companyadmin_search.sendKeys("Automation new edit3");
		 Thread.sleep(2000);
		 teams_three_icon.click();
		 Thread.sleep(1000);
		 new_companyadmin_deactive.click();
		 Thread.sleep(2000);
	 }
	 
	 public void activeNewCompanyAdmin() throws InterruptedException{
		 new_companyadmin_search.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 new_companyadmin_search.click();
		 new_companyadmin_search.sendKeys("Automation new edit3");
		 Thread.sleep(2000);
		 teams_three_icon.click();
		 Thread.sleep(1000);
		 new_companyadmin_active.click();
		 Thread.sleep(2000);
	 }
	 public void changeToManager() throws InterruptedException{
		 new_companyadmin_search.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 new_companyadmin_search.click();
		 new_companyadmin_search.sendKeys("Automation new edit3");
		 Thread.sleep(2000);
		 teams_three_icon.click(); 
		 Thread.sleep(1000);
		 change_to_manager.isDisplayed();
		 change_to_manager.click();
		 Thread.sleep(2000);
		 new_chane_to_manager_confirm.click();
		 Thread.sleep(10000);
	 }
	 
	 public void verifyManager() throws InterruptedException{
		 header_manager.click();
		 Thread.sleep(3000);
		 new_companyadmin_search.click();
		 new_companyadmin_search.sendKeys("Automation new edit3");
		 Thread.sleep(2000);
		 teams_three_icon.click(); 
		 change_to_company_admin.click();
		 Thread.sleep(2000);
		 new_chane_to_manager_confirm.click();
		 Thread.sleep(10000);
	 }
	 
	 public void deleteCreateCompanyAdmin() throws InterruptedException{
		 company_admin.isDisplayed();
		 company_admin.click();
		 Thread.sleep(2000);
		 new_companyadmin_search.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 new_companyadmin_search.click();
		 new_companyadmin_search.sendKeys("Automation new edit3");
		 Thread.sleep(2000);
		 teams_three_icon.click();
		 Thread.sleep(2000);
		 new_companyadmin_delete.click();
		 Thread.sleep(2000);
		 companies_delete_button.click();
		 Thread.sleep(2000);
		 no_data_found.isDisplayed();
	 }
}
