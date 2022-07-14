package com.scoutr.testcases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.scoutr.base.TestBase;
import com.scoutr.pages.DashBoardPage;

public class DashBoardTest extends TestBase {

	DashBoardPage dashboard;

	public DashBoardTest() {
		super();
	}

//	@BeforeMethod
//	public void setUp() {
//		initialization();
//		dashboard = new DashBoardPage();
//	}
	@Test(priority=1)
	public void basePageNavigation() throws InterruptedException  {
	
		driver.get("https://stagingapi.scoutr.team/sign-in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("priya@scoutr.team");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@class='sc-eDtABA cMlFCK']")).click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//highLighterMethod(driver,ele);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='sc-gWXbKe bPZHhd']")));
		Thread.sleep(3000);
}
	@Test(priority = 2)
	public void VerifyDashBoardURL() {
		dashboard.getDashBoardURL();
		Assert.assertEquals("https://stagingapi.scoutr.team/employer/dashboard", dashboard.getDashBoardURL());
	}
}