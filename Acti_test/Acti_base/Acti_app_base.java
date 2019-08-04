package Acti_base;

import java.io.File;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utility.Urls;


public class Acti_app_base 
{
	public static WebDriver dr=null;
	@BeforeClass
	public void setUp() throws InterruptedException
	{
		
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	ChromeOptions option=new ChromeOptions();//FirefoxProfile
	option.addArguments("start-maximized");
	option.addArguments("disable-infobars");
	option.addArguments("--disable-notifications");
	
	File fi=new File("./drivers/extension_4_0_0_0.crx");
	option.addExtensions(fi);
	
	dr=new ChromeDriver(option);
	
	dr.get(Urls.acti_url);
	Thread.sleep(3000);
	
	}
	
	
	@AfterClass
	public void close()
	{
		dr.quit();
	}
	
}
