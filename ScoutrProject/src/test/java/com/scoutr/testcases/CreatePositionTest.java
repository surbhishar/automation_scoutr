package com.scoutr.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.scoutr.pages.CandidateloginPage;
import com.scoutr.pages.CreatePositionPage;
import com.scoutr.pages.HomePage;
import com.scoutr.pages.TeamCreationPage;
import com.scoutr.util.BusinessComponents;

public class CreatePositionTest extends BusinessComponents{
	  WebDriver driver;
      CreatePositionPage createpositionPage;
      HomePage homePage;
      public CreatePositionTest() {
  		super();
  	}
      @BeforeClass
  	public WebDriver verify_login_functionality() {
  		//System.out.println("testing");
  		driver=openBrowser("chrome");
  		navigatetoURL(applicationURL);
  		homePage = new HomePage(driver);
  		createpositionPage =new CreatePositionPage(driver);
  		homePage.login(UserName, Password);
  		return driver;

  	}
      @Test(priority = 1)
    	public void verifyPositionCreationEditDelete() throws IOException, InterruptedException {
    	  createpositionPage.clickViewDetails();
    	  createpositionPage.enterPositionDetails();
    	  createpositionPage.updateSkills();
    	  createpositionPage.searchPositionDetails();
    	  createpositionPage.editPosition();
    	  createpositionPage.editPositionDetails();
//    	  createpositionPage.deletePositionDetails();
    	  
      }
    
//      @AfterClass
//  	public void tearDown() {
//  		driver.quit();
//  	}

}
