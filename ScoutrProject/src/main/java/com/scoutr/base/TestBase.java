package com.scoutr.base;
import com.scoutr.pages.HomePage;
import com.scoutr.util.TestUtil;
import com.scoutr.util.Utilities;
import com.scoutr.util.WebEventListener;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.annotations.BeforeClass;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	public static WebDriverEventListener eventListener;
	public static final String systemDir = System.getProperty("user.dir");
	
	public static String applicationURL=Utilities.getProperty("URL");
	public static String UserName=Utilities.getProperty("username");
	public static String Password=Utilities.getProperty("password");
	public static String CandidateFastName=Utilities.getProperty("candidatefirstname");
	public static String CandidateLastName=Utilities.getProperty("candidatelastname");
	public static String CandidatEmail=Utilities.getProperty("candidatemail");
	public static String CandidatConfirmEmail=Utilities.getProperty("confirmemail");
	public static String CandidatePassword=Utilities.getProperty("password");
	public static String CandidateConfirmPassword=Utilities.getProperty("password");
	
	
	

	public TestBase(){
//		try {
//			prop = new Properties();
//			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "\\src\\main\\java\\com\\scoutr\\config\\config.");
//			prop.load(ip);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}

	
	/**
	 * function to open browser
	 * @param browser
	 * @return
	 */
	public static WebDriver openBrowser(String browser) {
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				ChromeOptions options = new ChromeOptions();
				//WebDriverManager.chromedriver().driverVersion("101.0.4951.67 ").setup();
				WebDriverManager.chromedriver().setup();
				System.out.println(systemDir);
				//System.setProperty("webdriver.chrome.driver", systemDir+"\\Drivers\\chromedriver.exe");	
				driver= new ChromeDriver(options);
			}
			else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", systemDir+"/SeleniumServer/geckodriver");	
				driver = new FirefoxDriver(); 
			}
			
			if(driver!=null) {
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
			}
		}catch(Exception e) {
			System.out.println("Error in openBrowser class -- "+e.getMessage());
		}
		return driver;
	}




	
	
	
	public static void initialization(){
		String browserName = prop.getProperty("browser");

		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");	
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "/SeleniumServer/geckodriver");	
			driver = new FirefoxDriver(); 
		}


		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));

	}









}
