package com.scoutr.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.scoutr.pages.CompanyCreationPage;
import com.scoutr.pages.HomePage;
import com.scoutr.pages.TeamCreationPage;
import com.scoutr.util.BusinessComponents;

public class TeamCreationTest extends BusinessComponents {
      WebDriver driver;
      TeamCreationPage teamcreationPage;
      HomePage homePage;
      public TeamCreationTest() {
  		super();
  	}
      @BeforeClass
  	public WebDriver verify_login_functionality() throws InterruptedException {
  		//System.out.println("testing");
  		driver=openBrowser("chrome");
  		navigatetoURL(applicationURL);
  		homePage = new HomePage(driver);
  		teamcreationPage= new TeamCreationPage (driver);
  		homePage.login(UserName, Password);
  		return driver;
  }
      @Test(priority = 1)
  	public void verifyTeamCreation() throws IOException, InterruptedException {
    	  teamcreationPage.clickViewDetails();
    	  teamcreationPage.enterTeamDetails();
    	  teamcreationPage.teamCulture();
      }
      @AfterClass
  	public void tearDown() {
  		driver.quit();
  	}
}
