package com.scoutr.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CandidateloginPage {
	public static final String systemDir = System.getProperty("user.dir");
	WebDriver driver;

	public CandidateloginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath = "//button[contains(text(),'View Details')]")
	WebElement view_details;
	
	@FindBy(xpath = "//p/a[contains(text(),'Create Now!')]")
	WebElement create_new;
	
	@FindBy(xpath = "//input[@placeholder='First Name *']")
	WebElement first_name;
	
	@FindBy(xpath = "//input[@placeholder='Last Name *']")
	WebElement last_name;
	
	@FindBy(xpath = "//input[@placeholder='Email *']")
	WebElement candidate_email;
	
	@FindBy(xpath = "//input[@name='confirm_email']")
	WebElement confirm_email;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement candidate_password;
	
	@FindBy(xpath = "//input[@name='confirm_password']")
	WebElement confirm_password;
	
	@FindBy(xpath = "//button[contains (text(),'SIGN UP')]")
	WebElement singup_button;
	
	@FindBy(xpath = "//div[@class='sc-gsDKAQ fOusog details-header']/h3")
	WebElement candidate_title;
	
	@FindBy(xpath = "//div[@class='sc-eldieg dJGQQv']")
	WebElement file_upload;
	
	@FindBy(xpath = "//div/input[@name='phone_number']")
	WebElement phone_number;
	
	@FindBy(xpath = "//div/input[@name='location']")
	WebElement location_pageone;
	
	@FindBy(xpath = "//div/input[@name='social_profile']")
	WebElement linkedin_profile;
	
	@FindBy(xpath = "//div/input[@name='website']")
	WebElement personal_website;
	
	@FindBy(xpath = "//div/textarea[@id='motivation_to_market']")
	WebElement motivation_to_market;
	
	@FindBy(xpath = "//div/textarea[@id='summary']")
	WebElement personal_summary;
	
	@FindBy(xpath = "//button[@class='sc-dPiLbb eUGIpp btn btn-primary']")
	WebElement cancel_button;
	
	@FindBy(xpath = "//button[contains(text(),'Continue')]")
	WebElement submit_button;
	
	@FindBy(xpath = "//div/input[@id='first_job']")
	WebElement first_job_checkbox;
	
	@FindBy(xpath = "//div/input[@name='job_title']")
	WebElement job_title;
	
	@FindBy(xpath = "//div/input[@name='company']")
	WebElement company_expirence;
	
	@FindBy(xpath = "//div/input[@name='location']")
	WebElement location_expirence;
	
	@FindBy(xpath = "//div[@id='workStart']")
	WebElement work_start_date;
	
	@FindBy(xpath = "//div/ul/li[contains(text(),'Jul')]")
	WebElement work_start_month;
	
	@FindBy(xpath = "//div[@id='workStartYear']")
	WebElement work_start_year;
	
	@FindBy(xpath = "//div/ul/li[contains(text(),'2011')]")
	WebElement work_start_year_no;
	
	@FindBy(xpath = "//div[@id='workEndMonth']")
	WebElement work_end_month;
	
	@FindBy(xpath = "//div[@id='workEndYear']")
	WebElement work_end_year;
	
	@FindBy(xpath = "//div/ul/li[contains(text(),'2013')]")
	WebElement work_end_year_no ;
	
	@FindBy(xpath = "//div/input[@id='isCurrentlyWorking']")
	WebElement currently_working;
	
	@FindBy(xpath = "//div/button[contains(text(),'Save')]")
	WebElement save_button_expirence;
	
	@FindBy(xpath = "//div/button[contains(text(),'Continue')]")
	WebElement continue_button_expirence;
	
	@FindBy(xpath = "//input[@name='expected_job_title']")
	WebElement ideal_job_title;
	
	@FindBy(xpath = "//input[@name='expected_location']")
	WebElement ideal_job_loaction;
	
	@FindBy(xpath = "//input[@name='compensation']")
	WebElement ideal_compensastion;
	
	@FindBy(xpath = "//div[@id='compensation_type']")
	WebElement salary_hourly;
	
	@FindBy(xpath = "//ul/li[contains(text(),'Salary')]")
	WebElement salary_compensation;
	
	@FindBy(xpath = "//input[@id='willing_to_work_remote']")
	WebElement willing_towork_remote;
	
	@FindBy(xpath = "//input[@id='willing_to_relocate']")
	WebElement willing_to_relocate;
	
	@FindBy(xpath = "//div/button[contains(text(),'Cancel')]")
	WebElement cancel_button_ideal;
	
	@FindBy(xpath = "//div/button[contains(text(),'Continue')]")
	WebElement continue_button_ideal;
	
	@FindBy(xpath = "//div/button[contains(text(),'Continue')]")
	WebElement work_expirence_continue_button;
	
	@FindBy(xpath = "//div/label[@for='public-file']")
	WebElement public_file;
	
	@FindBy(xpath = "//div/label[@for='private-file']")
	WebElement private_file;
	
	@FindBy(xpath = "//div/button[contains(text(),'Continue')]")
	WebElement file_upload_continue;
	
	@FindBy(xpath = "//div[@class=' css-ackcql']/input")
	WebElement enter_skills;
	
	@FindBy(xpath = "//div[@class=' css-tlfecz-indicatorContainer']")
	WebElement add_button;
	
	@FindBy(xpath = "//div/button[contains(text(),'Cancel')]")
	WebElement cancel_button_skills;
	
	@FindBy(xpath = "//div/button[contains(text(),'Continue')]")
	WebElement continue_button_skills;
	
	@FindBy(xpath = "//div/input[@name='school']")
	WebElement school_eduction;
	
	@FindBy(xpath = "//div[@id=\"degree\"]")
	WebElement degree_education;
	
	@FindBy(xpath = "//div/ul/li[contains(text(),'Masters')]")
	WebElement master_degree;
	
	@FindBy(xpath = "//div/input[@name='major']")
	WebElement manjor_education;
	
	@FindBy(xpath = "//div/input[@name='concentration']")
	WebElement concentration_eduction;
	
	@FindBy(xpath = "//div/input[@name='minor']")
	WebElement minor_eduction;
	
	@FindBy(xpath = "//div[@id='eduStartMonth']")
	WebElement eduction_strat_month;
	
	@FindBy(xpath = "//div[@id='eduStartYear']")
	WebElement eduction_start_year;
	
	@FindBy(xpath = "//div[@id='eduEndMonth']")
	WebElement eduction_end_month;
	
	@FindBy(xpath = "//div[@id='eduEndYear']")//div[@id='eduEndMonth']
	WebElement eduction_end_year;
	
	@FindBy(xpath = "//div/input[@id='is_remote']")
	WebElement is_remote_eduction;
	
	@FindBy(xpath = "//div/button[contains(text(),'Save')]")
	WebElement save_eduction;
	
	@FindBy(xpath = "//div/button[contains(text(),'Continue')]")
	WebElement continue_eduction;
	
	@FindBy(xpath = "//div/input[@name='decision_making']")
	WebElement team_culture_dicision_making;
	
	@FindBy(xpath = "//div/input[@name='support']")
	WebElement team_culture_support;
	
	@FindBy(xpath = "//div/input[@name='risk']")
	WebElement team_culture_risk;
	
	@FindBy(xpath = "//div/input[@name='certainty']")
	WebElement team_culture_certainty;
	
	@FindBy(xpath = "//div/input[@name='individualism_vs_collectivism']")
	WebElement team_culture_individualism_vs_collectivism;
	
	@FindBy(xpath = "//div/input[@name='criticism']")
	WebElement team_culture_criticism;
	
	@FindBy(xpath = "//div/input[@name='time_orientation']")
	WebElement team_culture_time_orientation;
	
	@FindBy(xpath = "//div/input[@name='mission']")
	WebElement team_culture_mission;
	
	@FindBy(xpath = "//div/input[@name='influence']")
	WebElement team_culture_influence;
	
	@FindBy(xpath = "//div/input[@name='collaboration']")
	WebElement team_culture_collaborartion;
	
	@FindBy(xpath = "//div/input[@name='problem_solving")
	WebElement team_culture_problem_solving;
	
	@FindBy(xpath = "//div/input[@name='trajectory']")
	WebElement team_culture_trajectory;
	
	@FindBy(xpath = "//div/input[@name='task_behaviour']")
	WebElement team_culture_task_behaviour;
	
	@FindBy(xpath = "//div/input[@name='relationship_behaviour']")
	WebElement team_culture_relationship_behaviour;
	
	@FindBy(xpath = "//div/input[@name='resource_behaviour']")
	WebElement team_culture_resource_behaviour;
	
	@FindBy(xpath ="//div/input[@name='avoidance_vs_approach']")
	WebElement team_culture_avoidance_vs_approach;
	
	@FindBy(xpath = "//input[@name=\"first_name\"]")
	WebElement first_name_candidate_reference;
	
	@FindBy(xpath = "//input[@name='last_name']")
	WebElement last_name_candidate_reference;

	@FindBy(xpath = "//input[@name='email']")
	WebElement email_candidate_reference;
	
	@FindBy(xpath = "//input[@name='phone_number']")
	WebElement phonenumber_candidate_reference;
	
	@FindBy(xpath = "//input[@name='company']")
	WebElement company_candidate_reference;
	
	@FindBy(xpath = "//input[@name='position']")
	WebElement position_candidate_reference;
	
	@FindBy(xpath = "//div[@id='relationship']")
	WebElement relationship_candidate_reference;
	
	@FindBy(xpath = "//div/ul/li[contains(text(),'Peer/Coworker')]")
	WebElement peer_candidate_reference;
	
	
	public void clickViewDetails() {
		view_details.click();
	}
	public String getViewDetailsUrl() {
		return driver.getCurrentUrl();
	}
	public void clickCreateNew() throws InterruptedException {
	Thread.sleep(1000);
		create_new.click();
		Thread.sleep(2000);
	}
	/**
	 * function to create user account in the application
	 * @param fastname
	 * @param lastname
	 */
	public void signup(String fastName, String lastname ,String email, String confirmemail,String password, String Confirmpassword) {
		try {
			first_name.sendKeys(fastName);
			Thread.sleep(2000);
			last_name.sendKeys(lastname);
			Thread.sleep(2000);
			candidate_email.sendKeys(email);
			Thread.sleep(2000);
			confirm_email.sendKeys(confirmemail);
			Thread.sleep(2000);
			candidate_password.sendKeys(password);
			Thread.sleep(2000);
			confirm_password.sendKeys(Confirmpassword);
			Thread.sleep(2000);
			singup_button.isEnabled();
			singup_button.click();
			Thread.sleep(10000);
		}catch(Exception e) {
			System.out.println("Error in login --- "+e.getMessage());
		}
	}
	/**
	 * function to get current url
	 */
	public String verifycandidatetitle() throws InterruptedException {
		return driver.getCurrentUrl();
		}
	
	/**
	 * function to upload file and the other details
	 */
	public void uploadImage() throws InterruptedException, AWTException {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);",file_upload);
		file_upload.isDisplayed();
		Thread.sleep(1000);
		file_upload.click();
		Thread.sleep(2000);
		Robot rb = new Robot();
		System.out.println("button clicked");
		StringSelection str = new StringSelection("C:\\Users\\DELL\\eclipse-workspace\\Untitled.zip_expanded\\ScoutrProject\\Image\\flowerimage.jpg");
		System.out.println("hi i am uploaded");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	 
	     // press Contol+V for pasting
	     rb.keyPress(KeyEvent.VK_CONTROL);
	     rb.keyPress(KeyEvent.VK_V);
	 
	    // release Contol+V for pasting
	    rb.keyRelease(KeyEvent.VK_CONTROL);
	    rb.keyRelease(KeyEvent.VK_V);
	 
	    // for pressing and releasing Enter

	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(5000);
	    
		}
	/**
	 * function to file the other details
	 */
	public void fillDetails() throws InterruptedException {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);",phone_number);
		phone_number.sendKeys("9845678908");
		Thread.sleep(1000);
		location_pageone.sendKeys("uttarakhand");
		Thread.sleep(1000);
		linkedin_profile.sendKeys("https://www.linkedin.com/in/automation");
		Thread.sleep(1000);
		personal_website.sendKeys("www.automation.com");
		Thread.sleep(1000);
		motivation_to_market.sendKeys("this is an automation script");
		Thread.sleep(1000);
		je.executeScript("arguments[0].scrollIntoView(true);",personal_summary);
		personal_summary.sendKeys("automation script running");
		Thread.sleep(1000);
		cancel_button.isEnabled();
		Thread.sleep(1000);
		submit_button.click();
		Thread.sleep(2000);
		
		}
	/**
	 * function to file the work experience details
	 */
	public void workExpirence() throws InterruptedException {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		first_job_checkbox.isEnabled();
		Thread.sleep(2000);
		job_title.sendKeys("automation");
		Thread.sleep(2000);
		company_expirence.sendKeys("IT Company");
		Thread.sleep(2000);
		location_expirence.sendKeys("Banglore");
		Thread.sleep(2000);
		work_start_date.click();
		Thread.sleep(2000);
		work_start_month.click();
		Thread.sleep(2000);
		work_start_year.click();
		work_start_year_no.click();
		Thread.sleep(2000);
		work_end_month.click();
		Thread.sleep(2000);
		work_start_month.click();
		Thread.sleep(2000);
		work_end_year.click();
		Thread.sleep(2000);
		work_end_year_no.click();
		Thread.sleep(2000);
		je.executeScript("arguments[0].scrollIntoView(true);",currently_working);
		Thread.sleep(2000);
		currently_working.click();
		Thread.sleep(2000);
		save_button_expirence.click();
		Thread.sleep(5000);
		je.executeScript("arguments[0].scrollIntoView(true);",work_expirence_continue_button);
		work_expirence_continue_button.click();
		Thread.sleep(5000);
		
	}	
	/**
	 * function to file the idea job details
	 */
	public void idealJob() throws InterruptedException {
		ideal_job_title.sendKeys("automation");
		Thread.sleep(2000);
		ideal_job_loaction.sendKeys("Remote");
		Thread.sleep(2000);
		ideal_compensastion.sendKeys("200000");
		salary_hourly.click();
		salary_compensation.click();
//		Select select = new Select(salary_hourly); 
//		select.selectByVisibleText("15");
		willing_towork_remote.isDisplayed();
		willing_to_relocate.isDisplayed();
		cancel_button_ideal.isDisplayed();
		continue_button_ideal.click();
		Thread.sleep(2000); 
	}
	/**
	 * function to upload private and public file details
	 */
	public void uploadFiles() throws InterruptedException, AWTException {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		Robot rb = new Robot();
		public_file.click();
		Thread.sleep(2000); 
		StringSelection str = new StringSelection("C:\\Users\\DELL\\eclipse-workspace\\Untitled.zip_expanded\\ScoutrProject\\Files\\sampleupload");
		System.out.println("hi i am uploaded");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	 
	     // press Contol+V for pasting
	     rb.keyPress(KeyEvent.VK_CONTROL);
	     rb.keyPress(KeyEvent.VK_V);
	 
	    // release Contol+V for pasting
	    rb.keyRelease(KeyEvent.VK_CONTROL);
	    rb.keyRelease(KeyEvent.VK_V);
	 
	    // for pressing and releasing Enter

	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(5000);
	    private_file.click();
	    Thread.sleep(2000); 
	    StringSelection str1 = new StringSelection("C:\\Users\\DELL\\eclipse-workspace\\Untitled.zip_expanded\\ScoutrProject\\Files\\sampleupload");
		System.out.println("hi i am uploaded");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str1, null);
	    rb.keyPress(KeyEvent.VK_CONTROL);
	    rb.keyPress(KeyEvent.VK_V);
	 
	    // release Contol+V for pasting
	    rb.keyRelease(KeyEvent.VK_CONTROL);
	    rb.keyRelease(KeyEvent.VK_V);
	 
	    // for pressing and releasing Enter

	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(5000);
	    je.executeScript("arguments[0].scrollIntoView(true);",file_upload_continue);
	    file_upload_continue.click();
	    Thread.sleep(5000);
}
	/**
	 * function to update the skills details
	 */
	public void updateSkills() throws InterruptedException{
		//Select categories = new Select(categoriesDropDown);
		add_button.click();
		Thread.sleep(3000);
		enter_skills.click();
		enter_skills.sendKeys("java");
		Thread.sleep(5000);
		 Actions builder=new Actions(driver);
	     builder.moveToElement( driver.findElement(By.xpath("//div[@id='react-select-2-listbox']/div/div"))).click().build().perform();
		Thread.sleep(3000);
//		add_button.click();
		enter_skills.click();
		enter_skills.sendKeys("coding");
		Thread.sleep(5000);
		Actions builder1=new Actions(driver);
	    builder1.moveToElement( driver.findElement(By.xpath("//div[@id='react-select-2-listbox']/div/div"))).click().build().perform();
		Thread.sleep(3000);
//		add_button.click();
		enter_skills.click();
		enter_skills.sendKeys("manualtesting");
		Thread.sleep(5000);
		Actions builder2=new Actions(driver);
	    builder2.moveToElement( driver.findElement(By.xpath("//div[@id='react-select-2-listbox']/div/div"))).click().build().perform();
		Thread.sleep(3000);
//		add_button.click();
		enter_skills.click();
		enter_skills.sendKeys("automation");
		Thread.sleep(5000);
		Actions builder3=new Actions(driver);
	    builder3.moveToElement( driver.findElement(By.xpath("//div[@id='react-select-2-listbox']/div/div"))).click().build().perform();
		Thread.sleep(3000);
//		add_button.click();
		enter_skills.click();
		enter_skills.sendKeys("j2ee");
		Thread.sleep(5000);
		Actions builder4=new Actions(driver);
	    builder4.moveToElement( driver.findElement(By.xpath("//div[@id='react-select-2-listbox']/div/div"))).click().build().perform();
		Thread.sleep(3000);
		cancel_button_skills.isDisplayed();
		continue_button_skills.click();
		Thread.sleep(5000);
	}//
	/**
	 * function to update the education details
	 */
	public void educationDetails() throws InterruptedException{
		JavascriptExecutor je = (JavascriptExecutor) driver;
		school_eduction.click();
		Thread.sleep(1000);
		school_eduction.sendKeys("New Delhi School");
		Thread.sleep(1000);
		degree_education.click();
		Thread.sleep(1000);
		master_degree.click();
		Thread.sleep(1000);
		manjor_education.click();
		Thread.sleep(1000);
		manjor_education.sendKeys("high school");
		Thread.sleep(1000);
		concentration_eduction.click();
		Thread.sleep(1000);
		concentration_eduction.sendKeys("master llb");
		Thread.sleep(1000);
		minor_eduction.click();
		Thread.sleep(1000);
		minor_eduction.sendKeys("Testing");
		Thread.sleep(1000);
		eduction_strat_month.click();
		Thread.sleep(1000);
		work_start_month.click();
		Thread.sleep(1000);
		eduction_start_year.click();
		Thread.sleep(1000);
		work_start_year_no.click();
		Thread.sleep(1000);
		eduction_end_month.click();
		Thread.sleep(1000);
		work_start_month.click();
		Thread.sleep(1000);
		je.executeScript("arguments[0].scrollIntoView(true);",eduction_end_year);
		eduction_end_year.click();
		Thread.sleep(1000);
		work_end_year_no.click();
		Thread.sleep(1000);
//		work_start_month.click();
//		Thread.sleep(1000);
//		work_end_year_no.click();
//		Thread.sleep(1000);
		save_eduction.click();
		Thread.sleep(1000);
		continue_eduction.click();
		Thread.sleep(3000);
		
	}
	/**
	 * function to update the team culture details
	 */
	public void team_culture() throws InterruptedException{
		JavascriptExecutor je = (JavascriptExecutor) driver;
        Actions move = new Actions(driver);
        Action action = (Action) move.dragAndDropBy(team_culture_dicision_making, 60, 0).build();
        action.perform();
        Thread.sleep(2000);
        je.executeScript("arguments[0].scrollIntoView(true);",team_culture_support);
        Thread.sleep(2000);
        Actions move1 = new Actions(driver);
        Action action1 = (Action) move1.dragAndDropBy(team_culture_support, 60, 0).build();
        action1.perform();
        Thread.sleep(2000);
        je.executeScript("arguments[0].scrollIntoView(true);",team_culture_risk);
        Thread.sleep(2000);
        Actions move2 = new Actions(driver);
        Action action2 = (Action) move2.dragAndDropBy(team_culture_risk, 60, 0).build();
        action2.perform();
        Thread.sleep(2000);
        je.executeScript("arguments[0].scrollIntoView(true);",team_culture_certainty);
        Thread.sleep(2000);
      //  WebElement slider3 = driver.findElement(By.xpath("//div/input[@name='certainty']"));
        Actions move3 = new Actions(driver);
        Action action3 = (Action) move3.dragAndDropBy(team_culture_certainty, 60, 0).build();
        action3.perform();
        Thread.sleep(2000);
        je.executeScript("arguments[0].scrollIntoView(true);",team_culture_individualism_vs_collectivism);
        Thread.sleep(2000);
        //WebElement slider4 = driver.findElement(By.xpath("//div/input[@name='individualism_vs_collectivism']"));
        Actions move4 = new Actions(driver);
        Action action4 = (Action) move4.dragAndDropBy(team_culture_individualism_vs_collectivism, 60, 0).build();
        action4.perform();
        Thread.sleep(2000);
        je.executeScript("arguments[0].scrollIntoView(true);",team_culture_criticism);
        Thread.sleep(2000);
        //WebElement slider5 = driver.findElement(By.xpath("//div/input[@name='criticism']"));
        Actions move5 = new Actions(driver);
        Action action5 = (Action) move5.dragAndDropBy(team_culture_criticism, 60, 0).build();
        action5.perform();
        Thread.sleep(2000);
        je.executeScript("arguments[0].scrollIntoView(true);",team_culture_time_orientation);
        Thread.sleep(2000);
        //WebElement slider6 = driver.findElement(By.xpath("//div/input[@name='time_orientation']"));
        Actions move6 = new Actions(driver);
        Action action6 = (Action) move6.dragAndDropBy(team_culture_time_orientation, 60, 0).build();
        action6.perform();
        Thread.sleep(2000);
        je.executeScript("arguments[0].scrollIntoView(true);",team_culture_mission);
        Thread.sleep(2000);
        //WebElement slider7 = driver.findElement(By.xpath("//div/input[@name='mission']"));
        Actions move7 = new Actions(driver);
        Action action7 = (Action) move7.dragAndDropBy(team_culture_mission, 60, 0).build();
        action7.perform();
        Thread.sleep(2000);
        submit_button.click();
        Thread.sleep(3000);
        je.executeScript("arguments[0].scrollIntoView(true);",team_culture_influence);
        Thread.sleep(2000);
        //WebElement slider8 = driver.findElement(By.xpath("//div/input[@name='influence']"));
        Actions move8 = new Actions(driver);
        Action action8 = (Action) move8.dragAndDropBy(team_culture_influence, 60, 0).build();
        action8.perform();
        Thread.sleep(2000);
        je.executeScript("arguments[0].scrollIntoView(true);",team_culture_collaborartion);
        Thread.sleep(2000);
        //WebElement slider9 = driver.findElement(By.xpath("//div/input[@name='collaboration']"));
        Actions move9 = new Actions(driver);
        Action action9 = (Action) move9.dragAndDropBy(team_culture_collaborartion, 60, 0).build();
        action9.perform();
        Thread.sleep(2000);
        je.executeScript("arguments[0].scrollIntoView(true);",team_culture_problem_solving);
        Thread.sleep(2000);
        //WebElement slider10 = driver.findElement(By.xpath("//div/input[@name='problem_solving']"));
        Actions move10 = new Actions(driver);
        Action action10 = (Action) move10.dragAndDropBy(team_culture_problem_solving, 60, 0).build();
        action10.perform();
        Thread.sleep(2000);
        je.executeScript("arguments[0].scrollIntoView(true);",team_culture_trajectory);
        Thread.sleep(2000);
        //WebElement slider11 = driver.findElement(By.xpath("//div/input[@name='trajectory']"));
        Actions move11 = new Actions(driver);
        Action action11 = (Action) move11.dragAndDropBy(team_culture_trajectory, 60, 0).build();
        action11.perform();
        Thread.sleep(2000);
        je.executeScript("arguments[0].scrollIntoView(true);",team_culture_task_behaviour);
        Thread.sleep(2000);
        //WebElement slider12 = driver.findElement(By.xpath("//div/input[@name='task_behaviour']"));
        Actions move12 = new Actions(driver);
        Action action12 = (Action) move12.dragAndDropBy(team_culture_task_behaviour, 60, 0).build();
        action12.perform();
        Thread.sleep(2000);
        je.executeScript("arguments[0].scrollIntoView(true);",team_culture_relationship_behaviour);
        Thread.sleep(2000);
       // WebElement slider13 = driver.findElement(By.xpath("//div/input[@name='relationship_behaviour']"));
        Actions move13 = new Actions(driver);
        Action action13 = (Action) move13.dragAndDropBy(team_culture_relationship_behaviour, 60, 0).build();
        action13.perform();
        Thread.sleep(2000);
        je.executeScript("arguments[0].scrollIntoView(true);",team_culture_resource_behaviour);
        Thread.sleep(2000);
        //WebElement slider14 = driver.findElement(By.xpath("//div/input[@name='resource_behaviour']"));
        Actions move14 = new Actions(driver);
        Action action14 = (Action) move14.dragAndDropBy(team_culture_resource_behaviour, 60, 0).build();
        action14.perform();
        je.executeScript("arguments[0].scrollIntoView(true);",team_culture_avoidance_vs_approach);
        Thread.sleep(2000);
        //WebElement slider15 = driver.findElement(By.xpath("//div/input[@name='avoidance_vs_approach']"));
        Actions move15 = new Actions(driver);
        Action action15 = (Action) move15.dragAndDropBy(team_culture_avoidance_vs_approach, 60, 0).build();
        action15.perform();
        Thread.sleep(2000);
        submit_button.click();
        Thread.sleep(3000);
	}
	/**
	 * function to update the candidate reference details
	 */
	public void candidate_refrence() throws InterruptedException{
		first_name_candidate_reference.click();
		first_name_candidate_reference.sendKeys("Automation");
		Thread.sleep(1000);
		last_name_candidate_reference.click();
		last_name_candidate_reference.sendKeys("New");
		Thread.sleep(1000);
		email_candidate_reference.click();
		email_candidate_reference.sendKeys("ahasdhka@scotur.com");
		Thread.sleep(1000);
		phonenumber_candidate_reference.click();
		phonenumber_candidate_reference.sendKeys("9845678908");
		Thread.sleep(1000);
		company_candidate_reference.click();
		company_candidate_reference.sendKeys("yashtechnologies");
		Thread.sleep(1000);
		position_candidate_reference.click();
		position_candidate_reference.sendKeys("sr.automationtester");
		Thread.sleep(1000);
		relationship_candidate_reference.click();
		peer_candidate_reference.click();
		Thread.sleep(1000);
		submit_button.click();
        Thread.sleep(3000);
	}
	
}

