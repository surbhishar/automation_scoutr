package com.scoutr.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.scoutr.base.TestBase;
import com.scoutr.pages.CandidateloginPage;
import com.scoutr.pages.HomePage;
import com.scoutr.util.BusinessComponents;
import com.scoutr.util.MyLogger;

public class CandidateLoginTest extends BusinessComponents {
	private static final Logger logger = LogManager.getLogger(MyLogger.class);
	WebDriver driver;
	CandidateloginPage candidatePage;

	public CandidateLoginTest() {
		super();
	}
	@BeforeMethod
	public void verify_candidate_signup() throws InterruptedException  {
		driver=openBrowser("chrome");
		navigatetoURL(applicationURL);
		candidatePage= new CandidateloginPage (driver);

//		candidatePage.clickCreateNew();
	
//		return driver; 
	

	}
	@Test(priority = 1)
	public void create_Candidate_Account() throws IOException, InterruptedException, AWTException {
		candidatePage.clickCreateNew();
        candidatePage.signup(CandidateFastName, CandidateLastName, CandidatEmail, CandidatConfirmEmail, CandidatePassword, CandidateConfirmPassword);
        candidatePage.verifycandidatetitle();
		Assert.assertEquals(candidatePage.verifycandidatetitle(), "https://stagingapi.scoutr.team/applicants/candidates/details");
		candidatePage.uploadImage();
    	candidatePage.fillDetails();
    	candidatePage.workExpirence();
    	candidatePage.idealJob();
    	candidatePage.uploadFiles();
    	candidatePage.updateSkills();
    	candidatePage.educationDetails();
    	candidatePage.team_culture();
    	candidatePage.candidate_refrence();
	}

//	@AfterClass
//	public void tearDown() {
//		driver.quit();
//	}

}

