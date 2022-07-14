package com.scoutr.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.scoutr.pages.HomePage;
import com.scoutr.pages.InviteNewSuperAdminPage;
import com.scoutr.pages.TeamCreationPage;
import com.scoutr.util.BusinessComponents;

public class InviteNewSuperAdminTest  extends BusinessComponents {
	WebDriver driver;
	InviteNewSuperAdminPage inviteNewSuperAdminPage;
	HomePage homePage;
    public InviteNewSuperAdminTest() {
	super(); 
    }
	@BeforeMethod
	public WebDriver verify_candidate_signup() throws InterruptedException  {
		driver=openBrowser("chrome");
		navigatetoURL(applicationURL);
		inviteNewSuperAdminPage= new InviteNewSuperAdminPage (driver);
		homePage = new HomePage(driver);
  		homePage.login(UserName, Password);
  		return driver;
	}

    @Test(priority = 1)
	public void verifyInviteNewSuperAdmin() throws IOException, InterruptedException {
    	inviteNewSuperAdminPage.adminButtoncClick();
    	inviteNewSuperAdminPage.inviteNewSuperAdmin();
    	inviteNewSuperAdminPage.searchNewSuperAdmin();
    	inviteNewSuperAdminPage.cancelNewSuperAdmin();
    	inviteNewSuperAdminPage.demoteNewSuperAdmin();
    }
}