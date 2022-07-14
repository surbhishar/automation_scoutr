package com.scoutr.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.scoutr.pages.HomePage;
import com.scoutr.pages.InviteNewSuperAdminPage;
import com.scoutr.pages.NewCompanyAdminPage;
import com.scoutr.util.BusinessComponents;

public class NewCompanyAdminTest  extends BusinessComponents{
	WebDriver driver;
	NewCompanyAdminPage newCompanyAdminPage;
	HomePage homePage;
	public NewCompanyAdminTest() {
		super(); 
	    }
	@BeforeMethod
	public WebDriver verify_candidate_signup() throws InterruptedException  {
		driver=openBrowser("chrome");
		navigatetoURL(applicationURL);
		homePage = new HomePage(driver);
		newCompanyAdminPage= new NewCompanyAdminPage (driver);
		homePage.login(UserName, Password);
  		return driver;
	}
	 @Test(priority = 1)
 	public void verifyPositionCreationEditDelete() throws IOException, InterruptedException {
		 newCompanyAdminPage.companyAdminButtonClick();
		 newCompanyAdminPage.inviteNewCompanyAdmin();
		 newCompanyAdminPage.searchNewCompanyAdmin();
		 newCompanyAdminPage.cancelNewCompanyAdmin();
		 newCompanyAdminPage.editNewCompanyAdmin();
		 newCompanyAdminPage.deactiveNewCompanyAdmin();
		 newCompanyAdminPage.activeNewCompanyAdmin();
		 newCompanyAdminPage.changeToManager();
		 newCompanyAdminPage.verifyManager();
		 newCompanyAdminPage.deleteCreateCompanyAdmin();
	 }
	 @AfterClass
		public void tearDown() {
			driver.quit();
		}
}
