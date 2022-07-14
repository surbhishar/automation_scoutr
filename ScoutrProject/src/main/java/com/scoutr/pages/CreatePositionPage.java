package com.scoutr.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreatePositionPage {
	public static final String systemDir = System.getProperty("user.dir");
	WebDriver driver;
	public CreatePositionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

}
	 @FindBy(xpath = "//button[contains(text(),'Create a Position')]")
	  	WebElement create_new_position;
	 
	 @FindBy(xpath = "//div/input[@name='title']")
	  	WebElement enter_new_title;
	 
	 @FindBy(xpath = "//div/textarea[@id='description']")
	  	WebElement enter_discription;
	 
	 @FindBy(xpath = "//div/input[@name='location']")
	  	WebElement new_location;
	 
	 @FindBy(xpath = "//div/input[@id='is_remote']")
	  	WebElement remote_checkbox;
	 
	 @FindBy(xpath = "//div/input[@name='minComp']")
	  	WebElement compensation_min;
	 
	 @FindBy(xpath = "//div/input[@name='maxComp']")
		WebElement compensation_max;
	 
	 @FindBy(xpath = "//div/div[contains (text(),'Hourly')]")
	 WebElement compensation_hourly;
	 
	 @FindBy(css = "div.css-tlfecz-indicatorContainer:nth-child(2)")
	 WebElement compensation_dropdwon;
	 
	 
	 @FindBy(xpath = "//div[@class=' css-qc6sy-singleValue']")
	   WebElement compeny_dropdown;
	 
	 @FindBy(xpath = "//div/input[@id='react-select-4-input']")
	  	WebElement manager_field;
	 
	 @FindBy(xpath = "//div/input[@id='react-select-5-input']")
	  	WebElement team_field;
	 
	 @FindBy(xpath = "//div/input[@id='react-select-3-input']")
	  	WebElement company_dropdown;
	 
	 @FindBy(xpath = "//div/textarea[@id='interviewExpectationsPhone']")
	  	WebElement interview_phone_number;
	 
	 @FindBy(xpath = "//div/textarea[@id='interviewExpectationsOnsite']")
	  	WebElement interview_onsite;
	 
	 @FindBy(xpath = "//div/textarea[@id='interviewExpectationsVirtual']")
	  	WebElement interview_virtual;
	 
	 @FindBy(xpath = "//button[contains(text(),'Save')]")
		WebElement save_button;
	 
	 @FindBy(xpath = "//div/a[contains(text(),'Positions')]")
		WebElement position_pageheader;
	 
	 @FindBy(xpath = "//div/input[@placeholder='Search']")
		WebElement position_search;
		
	@FindBy(xpath = "//button[@class='sc-lkgTHX eVieDc']")
		WebElement position_three_icon;
		
	@FindBy(xpath = "//div[contains(text(),'Edit')]")
		WebElement position_edit_button;
		
	@FindBy(xpath = "//div[contains(text(),'Delete')]")
		WebElement position_delete_button;   
	
	@FindBy(xpath = "//div[@class='MuiBox-root css-m7vjd']")
	 WebElement delete_message_details;
	
	@FindBy(xpath = "//div/button[contains(text(),'Delete')]")
	 WebElement Delete_popup_Button; 
	
	@FindBy(xpath = "//div[contains(text(),'No Data Found...')]")
	 WebElement no_data_found;
	
	@FindBy(xpath = "//div/input[@id='react-select-3-input']")
	 WebElement salary_comp;
	
	@FindBy(xpath = "//div[@class=' css-tlfecz-indicatorContainer']")
	WebElement add_button;
	
	@FindBy(xpath = "//div[@class=' css-ackcql']/input")
	WebElement enter_skills;
	
	@FindBy(xpath = "//div/button[contains(text(),'Cancel')]")
	WebElement cancel_button_skills;
	
	@FindBy(xpath = "//div/button[contains(text(),'Continue')]")
	WebElement continue_button_skills;
	
	@FindBy(xpath = "//button[contains(text(),'Create')]")
	WebElement create_button;
	
	@FindBy(xpath = "//div/div[contains(text(),'Automation New Edited')]")
	WebElement new_created_position;
	
	
	
	
	/**
	 * function to click on view position details
	 */
	public void clickViewDetails() throws InterruptedException {
		Thread.sleep(5000);
		create_new_position.isDisplayed();
		create_new_position.click();
		Thread.sleep(3000);
	}
	
	/**
	 * function to create a new position details
	 */
	public void enterPositionDetails() throws InterruptedException {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		enter_new_title.click();
		enter_new_title.sendKeys("Automation New");
		Thread.sleep(1000);
		enter_discription.click();
		enter_discription.sendKeys("Automation scripts running");
		Thread.sleep(1000);
		new_location.click();
		new_location.sendKeys("India");
		Thread.sleep(1000);
		remote_checkbox.click();
		Thread.sleep(1000);
		compensation_min.click();
		Thread.sleep(1000);
		compensation_min.sendKeys("786");
		Thread.sleep(1000);
		compensation_max.sendKeys("123");
		compensation_max.click();
		Thread.sleep(2000);
		compensation_dropdwon.click();
		Thread.sleep(2000);
		compensation_hourly.click();
		Thread.sleep(2000);
		company_dropdown.click();
		Thread.sleep(2000);
		Actions builder1=new Actions(driver);
	    builder1.moveToElement( driver.findElement(By.xpath("//div[@id='react-select-3-option-0']"))).click().build().perform();
		Thread.sleep(3000);
		je.executeScript("arguments[0].scrollIntoView(true);",manager_field);
		manager_field.click();
		Actions builder2=new Actions(driver);
	    builder2.moveToElement( driver.findElement(By.xpath("//div[7]/div/div/div/div/div[2]"))).click().build().perform();
	    team_field.click();
	    Actions builder3=new Actions(driver);
	    builder3.moveToElement( driver.findElement(By.xpath("//div[@id='react-select-5-option-3']"))).click().build().perform();
		Thread.sleep(3000);
		je.executeScript("arguments[0].scrollIntoView(true);",interview_phone_number);
		interview_phone_number.click();
		interview_phone_number.sendKeys("2345567891");
		Thread.sleep(2000);
		interview_onsite.click();
		interview_onsite.sendKeys("Hello Automation world");
		Thread.sleep(2000);
		interview_virtual.click();
		interview_virtual.sendKeys("Hello Automation done");
		Thread.sleep(2000);
		save_button.click();
		Thread.sleep(3000);
	}
	public void updateSkills() throws InterruptedException{
		JavascriptExecutor je = (JavascriptExecutor) driver;
		//Select categories = new Select(categoriesDropDown);
		add_button.click();
		Thread.sleep(3000);
		enter_skills.click();
		enter_skills.sendKeys("java");
		Thread.sleep(5000);
		 Actions builder=new Actions(driver);//div[@id='react-select-2-listbox']/div/div
	     builder.moveToElement( driver.findElement(By.xpath("//div[4]/div/div/div[2]/div/div"))).click().build().perform();
		Thread.sleep(3000);
//		add_button.click();
		enter_skills.click();
		enter_skills.sendKeys("coding");
		Thread.sleep(5000);
		Actions builder1=new Actions(driver);
	    builder1.moveToElement( driver.findElement(By.xpath("//div[4]/div/div/div[2]/div/div"))).click().build().perform();
		Thread.sleep(3000);
//		add_button.click();
		enter_skills.click();
		enter_skills.sendKeys("manualtesting");
		Thread.sleep(5000);
		Actions builder2=new Actions(driver);
	    builder2.moveToElement( driver.findElement(By.xpath("//div[4]/div/div/div[2]/div/div"))).click().build().perform();
		Thread.sleep(3000);
//		add_button.click();
		enter_skills.click();
		enter_skills.sendKeys("automation");
		Thread.sleep(5000);
		Actions builder3=new Actions(driver);
	    builder3.moveToElement( driver.findElement(By.xpath("//div[4]/div/div/div[2]/div/div"))).click().build().perform();
		Thread.sleep(3000);
//		add_button.click();
		enter_skills.click();
		enter_skills.sendKeys("j2ee");
		Thread.sleep(5000);
		Actions builder4=new Actions(driver);
	    builder4.moveToElement( driver.findElement(By.xpath("//div[4]/div/div/div[2]/div/div"))).click().build().perform();
		Thread.sleep(3000);
		cancel_button_skills.isDisplayed();
		continue_button_skills.click();
		Thread.sleep(5000);
		je.executeScript("arguments[0].scrollIntoView(true);",create_button);
		create_button.isDisplayed();
		create_button.click();
		Thread.sleep(8000);
		
		
	}//
	
	/**
	 * function to search a new position details
	 */
	
	public void searchPositionDetails() throws InterruptedException {
		    position_pageheader.click();
			Thread.sleep(3000);
			position_search.click();
			position_search.sendKeys("Automation New");
			Thread.sleep(5000);
		}
	/**
	 * function to click on three tier icon of search position details
	 */
	public void editPosition() throws InterruptedException {
		position_three_icon.isDisplayed();
		position_three_icon.click();
		Thread.sleep(2000);
		position_edit_button.click();
		Thread.sleep(3000);
	}
	/**
	 * function to edit search position details
	 */
	public void editPositionDetails() throws InterruptedException {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		enter_new_title.click();
		enter_new_title.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		enter_new_title.sendKeys("Automation New Edited");
		save_button.click();
		cancel_button_skills.isDisplayed();
		continue_button_skills.click();
		Thread.sleep(5000);
		je.executeScript("arguments[0].scrollIntoView(true);",save_button);
		Thread.sleep(3000);
		save_button.isDisplayed();
		save_button.click();
		Thread.sleep(3000);
		 position_pageheader.click();
		 Thread.sleep(3000);
		 position_search.click();
		 position_search.sendKeys("Automation New");
	}
	
	
	
	
	
	/**
	 * function to delete search position details
	 */
	public void deletePositionDetails() throws InterruptedException {
		position_pageheader.click();
		Thread.sleep(3000);
		position_search.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		position_search.click();
		position_search.sendKeys("Automation Edited");
		Thread.sleep(2000);
		position_three_icon.click();
		position_delete_button.click();
		delete_message_details.isDisplayed();
		Delete_popup_Button.click();
		Thread.sleep(3000);
		no_data_found.isDisplayed();
		Thread.sleep(2000);
		
	}
	
	}
	
	

