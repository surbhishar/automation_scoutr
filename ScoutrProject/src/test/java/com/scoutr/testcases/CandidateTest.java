package com.scoutr.testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.scoutr.pages.CandidateloginPage;
import com.scoutr.pages.HomePage;
import com.scoutr.util.BusinessComponents;
import com.scoutr.util.MyLogger;

public class CandidateTest extends BusinessComponents {
	private static final Logger logger = LogManager.getLogger(MyLogger.class);
	WebDriver driver;
	CandidateloginPage candidatePage;
    HomePage homepage;
	public CandidateTest() {
		super();
	}
	@BeforeClass
	public WebDriver verify_login_functionality() {
		//System.out.println("testing");
		driver=openBrowser("chrome");
		navigatetoURL(applicationURL);
		homepage = new HomePage(driver);
		candidatePage= new CandidateloginPage (driver);
		homepage.login(UserName, Password);
		return driver;

	}

	@Test(priority = 1)
	public void verifyCandidateUrl() throws IOException, InterruptedException {
		Thread.sleep(1000);
		candidatePage.clickViewDetails();
		candidatePage.getViewDetailsUrl();
		Thread.sleep(1000);
		Assert.assertEquals(candidatePage.getViewDetailsUrl(), "https://stagingapi.scoutr.team/employer/candidates");
		driver.navigate().back();
		Thread.sleep(1000);
//		driver.close();
	}
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}

