package com.scoutr.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

import com.scoutr.base.TestBase;

public class DashBoardPage extends TestBase {
	public DashBoardPage() {
		PageFactory.initElements(driver, this);
	}
	


	public String getDashBoardURL() {
		return driver.getCurrentUrl();

	}

}
