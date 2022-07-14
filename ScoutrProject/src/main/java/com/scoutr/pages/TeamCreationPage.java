package com.scoutr.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeamCreationPage {
	public static final String systemDir = System.getProperty("user.dir");
	WebDriver driver;
	public TeamCreationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

}
	
	@FindBy(xpath = "//button[contains(text(),'Create a Team')]")
	WebElement create_new_Team;
	
	@FindBy(xpath = "//input[@name='name']")
	WebElement enter_team_name;
	
	@FindBy(xpath = "//input[@name='location']")
	WebElement enter_team_location;
	
	@FindBy(xpath = "//input[@name='size']")
	WebElement enter_team_size;
	
	@FindBy(xpath = "//div[@class=' css-tlfecz-indicatorContainer']")
	WebElement enter_team;
	
	@FindBy(xpath = "//button[contains(text(),'Continue')]")
	WebElement enter_team_continue;
	
	@FindBy(xpath = "//input[@name='decision_making']")
	WebElement decision_making_slider;
	
	@FindBy(xpath = "//input[@name='support']")
	WebElement support_slider;
	
	@FindBy(xpath = "//input[@name='risk']")
	WebElement risk_slider;
	
	@FindBy(xpath = "//input[@name='certainty']")
	WebElement certainty_slider;
	
	@FindBy(xpath = "//input[@name='individualism_vs_collectivism']")
	WebElement indiviualism_slider;
	
	@FindBy(xpath = "//input[@name='criticism']")
	WebElement criticism_slider;
	
	@FindBy(xpath = "//input[@name='time_orientation']")
	WebElement orientation_slider;
	
	@FindBy(xpath = "//input[@name='mission']")
	WebElement mission_slider;
	
	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	WebElement submit_button;
	
	@FindBy(xpath = "//div/a[contains(text(),'Teams')]")
	WebElement teams_pageheader;
	
	@FindBy(xpath = "//div/input[@placeholder='Search']")
	WebElement teams_search;
	
	@FindBy(xpath = "//button[@class='sc-jHkVzv ekzURv']")
	WebElement teams_three_icon;
	
	@FindBy(xpath = "//div[contains(text(),'Edit')]")
	WebElement teams_edit_button;
	
	@FindBy(xpath = "//div[contains(text(),'Delete')]")
	WebElement teams_delete_button;   
	
	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement save_button; 
	
	@FindBy(xpath = "//div[@class='MuiBox-root css-m7vjd']")
	WebElement delete_message_details;
	
	@FindBy(xpath = "//div/button[contains(text(),'Delete')]")
	WebElement Delete_popup_Button; 
	
	@FindBy(xpath = "//div[contains(text(),'No Data Found...')]")
	WebElement no_data_found;
	
	
	
	
	
	
	/**
	 * function to click on dashboard click view details 
	 */
	
	public void clickViewDetails() throws InterruptedException {
		Thread.sleep(5000);
		create_new_Team.isDisplayed();
		create_new_Team.click();
		Thread.sleep(3000);
	}
	
	/**
	 * function to enter team details 
	 */
	public void enterTeamDetails() throws InterruptedException {
		enter_team_name.click();
		enter_team_name.sendKeys("Automation New");
		Thread.sleep(1000);
		enter_team_location.click();
		enter_team_location.sendKeys("India");
		Thread.sleep(1000);
		enter_team_size.click();
		enter_team_size.sendKeys("2");
		Thread.sleep(1000);
		enter_team.click();
		Thread.sleep(5000);
		Actions builder4=new Actions(driver);
	    builder4.moveToElement( driver.findElement(By.xpath("//div[@id='react-select-2-listbox']/div/div"))).click().build().perform();
		Thread.sleep(3000);
		enter_team_continue.click();
		Thread.sleep(3000);
	}
	/**
	 * function to enter team culture details 
	 */
	public void teamCulture() throws InterruptedException{
		JavascriptExecutor je = (JavascriptExecutor) driver;
 		WebElement slider = driver.findElement(By.xpath("//div/input[@name='decision_making']"));
        Actions move = new Actions(driver);
        Action action = (Action) move.dragAndDropBy(slider, 60, 0).build();
        action.perform();
        Thread.sleep(2000);
        je.executeScript("arguments[0].scrollIntoView(true);",support_slider);
        Thread.sleep(2000);
        WebElement slider1 = driver.findElement(By.xpath("//div/input[@name='support']"));
        Actions move1 = new Actions(driver);
        Action action1 = (Action) move1.dragAndDropBy(slider1, 60, 0).build();
        action.perform();
        Thread.sleep(2000);
        je.executeScript("arguments[0].scrollIntoView(true);",risk_slider);
        Thread.sleep(2000);
        WebElement slider2 = driver.findElement(By.xpath("//div/input[@name='risk']"));
        Actions move2 = new Actions(driver);
        Action action2 = (Action) move2.dragAndDropBy(slider2, 60, 0).build();
        action.perform();
        Thread.sleep(2000);
        je.executeScript("arguments[0].scrollIntoView(true);",certainty_slider);
        Thread.sleep(2000);
        WebElement slider3 = driver.findElement(By.xpath("//div/input[@name='certainty']"));
        Actions move3 = new Actions(driver);
        Action action3 = (Action) move3.dragAndDropBy(slider3, 60, 0).build();
        action.perform();
        Thread.sleep(2000);
        je.executeScript("arguments[0].scrollIntoView(true);",indiviualism_slider);
        Thread.sleep(2000);
        WebElement slider4 = driver.findElement(By.xpath("//div/input[@name='individualism_vs_collectivism']"));
        Actions move4 = new Actions(driver);
        Action action4 = (Action) move4.dragAndDropBy(slider4, 60, 0).build();
        action.perform();
        Thread.sleep(2000);
        je.executeScript("arguments[0].scrollIntoView(true);",criticism_slider);
        Thread.sleep(2000);
        WebElement slider5 = driver.findElement(By.xpath("//div/input[@name='criticism']"));
        Actions move5 = new Actions(driver);
        Action action5 = (Action) move5.dragAndDropBy(slider5, 60, 0).build();
        action.perform();
        Thread.sleep(2000);
        je.executeScript("arguments[0].scrollIntoView(true);",orientation_slider);
        Thread.sleep(2000);
        WebElement slider6 = driver.findElement(By.xpath("//div/input[@name='time_orientation']"));
        Actions move6 = new Actions(driver);
        Action action6 = (Action) move6.dragAndDropBy(slider6, 60, 0).build();
        action.perform();
        Thread.sleep(2000);
        je.executeScript("arguments[0].scrollIntoView(true);",mission_slider);
        Thread.sleep(2000);
        WebElement slider7 = driver.findElement(By.xpath("//div/input[@name='mission']"));
        Actions move7 = new Actions(driver);
        Action action7 = (Action) move7.dragAndDropBy(slider7, 60, 0).build();
        action.perform();
        Thread.sleep(2000);
        je.executeScript("arguments[0].scrollIntoView(true);",submit_button);
        submit_button.click();
        Thread.sleep(5000);
        
	}
	/**
	 * function to search a create team
	 */
	public void serchTeams() throws InterruptedException {
		teams_pageheader.click();
		Thread.sleep(3000);
		teams_search.click();
		teams_search.sendKeys("Automation New");
		Thread.sleep(3000);
	}
	/**
	 * function to click the three tier icon of the search team
	 */
	public void editTeams() throws InterruptedException {
		teams_three_icon.isDisplayed();
		teams_three_icon.click();
		teams_edit_button.click();
		Thread.sleep(3000);
	}
	/**
	 * function to edit the search team
	 */
	public void editTeamDetails() throws InterruptedException {
		teams_pageheader.click();
		enter_team_name.click();
		enter_team_name.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		enter_team_name.sendKeys("New Edited Automation");
		Thread.sleep(1000);
		enter_team_location.click();
		enter_team_location.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		enter_team_location.sendKeys("Newyork");
		Thread.sleep(1000);
		enter_team_size.click();
		enter_team_size.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		enter_team_size.sendKeys("3");
		Thread.sleep(1000);
		save_button.click();
		Thread.sleep(2000);
	}
	/**
	 * function to delete the search team
	 */
	public void deleteTeamsDetails() throws InterruptedException {
		teams_pageheader.click();
		Thread.sleep(3000);
		teams_search.click();
		teams_search.sendKeys("Automation Edited company");
		Thread.sleep(2000);
		teams_three_icon.click();
		teams_delete_button.click();
		delete_message_details.isDisplayed();
		Delete_popup_Button.click();
		Thread.sleep(3000);
		no_data_found.isDisplayed();
		Thread.sleep(2000);
	}
	
}