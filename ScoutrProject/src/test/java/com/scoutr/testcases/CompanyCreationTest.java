package com.scoutr.testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.scoutr.pages.CandidateloginPage;
import com.scoutr.pages.CompanyCreationPage;
import com.scoutr.pages.HomePage;
import com.scoutr.util.BusinessComponents;
import com.scoutr.util.MyLogger;

public class CompanyCreationTest extends BusinessComponents{
	WebDriver driver;
	CompanyCreationPage companycreationpage;
	HomePage homePage;
	public CompanyCreationTest() {
		super();
	}
	
	@BeforeClass
	public WebDriver verify_login_functionality() throws InterruptedException {
		//System.out.println("testing");
		driver=openBrowser("chrome");
		navigatetoURL(applicationURL);
		homePage = new HomePage(driver);
		companycreationpage= new CompanyCreationPage (driver);
		homePage.login(UserName, Password);
		return driver;
}
	@Test(priority = 1)
	public void verifyComapanyCreationEditDelete() throws IOException, InterruptedException {
		companycreationpage.clickViewDetails();
		companycreationpage.enterCompanyDetails();
		companycreationpage.serchCompany();
		companycreationpage.editCompany();
		companycreationpage.editCompanyDetails(); 
		companycreationpage.deleteCompanyDetails();
	}
	
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}


