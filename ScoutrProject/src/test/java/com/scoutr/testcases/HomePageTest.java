package com.scoutr.testcases;

import com.scoutr.base.*;
import com.scoutr.pages.CandidateloginPage;
import com.scoutr.pages.DashBoardPage;
import com.scoutr.pages.HomePage;
import com.scoutr.util.BusinessComponents;
import com.scoutr.util.MyLogger;
import com.scoutr.util.Utilities;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class HomePageTest extends BusinessComponents {
	private static final Logger logger = LogManager.getLogger(MyLogger.class);
	WebDriver driver;
	CandidateloginPage candidatePage;
	HomePage homePage;
	public HomePageTest() {
		super();
	}

	@BeforeClass
	public WebDriver verify_login_functionality() {
		//System.out.println("testing");
		driver=openBrowser("chrome");
		navigatetoURL(applicationURL);
		homePage = new HomePage(driver);
		candidatePage= new CandidateloginPage (driver);
		homePage.login(UserName, Password);
		return driver;

	}
	
	@Test(priority = 1)
	public void verifyLogoutButton() throws IOException, InterruptedException {
		Thread.sleep(2000);
		homePage.getCurrentTitle();
		//homePage.isLoginEmailAvailable();
		logger.info("Element is present");
		homePage.geTCurrentUrl();
		logger.info("URL is present");
		Assert.assertEquals(homePage.geTCurrentUrl(), "https://stagingapi.scoutr.team/employer/dashboard");
		Thread.sleep(2000);
	}

	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
