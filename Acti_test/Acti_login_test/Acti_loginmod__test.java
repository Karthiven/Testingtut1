package Acti_login_test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Acti_login_base.Acti_loginmod_base;
import data.Acti_data_para;
import pages.Loginpage_elements;
import utility.Loggs;
import utility.Mouse_Dropd_Keybd;
import utility.Takescreenpics;
import utility.Urls;

public class Acti_loginmod__test extends Acti_loginmod_base 
{
	
	
	@Test(priority=0)
	@Parameters({"username","password"})
	public void val_unpw(String unp,String pwp) throws InterruptedException, IOException
	{
		
		System.out.println(unp);
		System.out.println(pwp);
		Thread.sleep(2000);
		
		// WebElement un=dr.findElement(By.xpath("//input[@name='username']"));
		// WebElement pw= dr.findElement(By.xpath("//input[@name='pwd']"));
		// WebElement login=dr.findElement(By.xpath("//div[text()='Login ']"));
		
		PageFactory.initElements(dr, new Loginpage_elements());
		
		
		
		Loginpage_elements.un.sendKeys(unp);
		Thread.sleep(2000);
		Loginpage_elements.pw.sendKeys(pwp);
		Thread.sleep(2000);
		Loginpage_elements.login.click();
		Thread.sleep(5000);
		
		//Loggs.info("sample task verified");
		
		//WebElement logout=dr.findElement(By.xpath("//a[text()='Logout']"));
		Loginpage_elements.logout.click();
		Thread.sleep(2000);
		
		Takescreenpics.normal_Screenshot("sample");
		
	}
	
	 @Test(priority=1,dataProvider="Login_UNPW",dataProviderClass=data.Acti_data_para.class)
	public void insval_unpw(String und,String pwdd) throws InterruptedException
	{
		//WebElement un=dr.findElement(By.xpath("//input[@name='username']"));
	   // WebElement pw= dr.findElement(By.xpath("//input[@name='pwd']"));
		//WebElement login=dr.findElement(By.xpath("//div[text()='Login ']"));
		 
		 PageFactory.initElements(dr, new Loginpage_elements());
		
		Loginpage_elements.un.sendKeys(und);
		Thread.sleep(2000);
		Loginpage_elements.pw.sendKeys(pwdd);
		Thread.sleep(2000);
	    Loginpage_elements.login.click();
		Thread.sleep(2000);
	}
	
	@Test(priority=2)
	public void ivalpw_valun() throws InterruptedException
	{
		//WebElement un=dr.findElement(By.xpath("//input[@name='username']"));
	  //  WebElement pw= dr.findElement(By.xpath("//input[@name='pwd']"));
		//WebElement login=dr.findElement(By.xpath("//div[text()='Login ']"));
		
		PageFactory.initElements(dr, new Loginpage_elements());
		
		Loginpage_elements.un.sendKeys(Urls.val_un);
		Thread.sleep(2000);
		Loginpage_elements.pw.sendKeys(Urls.inv_pw);
		Thread.sleep(2000);
		Loginpage_elements.login.click();
		Thread.sleep(2000);
	}
	
	@Test(priority=3)
	public void ivalun_valpw() throws InterruptedException
	{
		//WebElement un=dr.findElement(By.xpath("//input[@name='username']"));
	   // WebElement pw= dr.findElement(By.xpath("//input[@name='pwd']"));
		//WebElement login=dr.findElement(By.xpath("//div[text()='Login ']"));
		
		PageFactory.initElements(dr, new Loginpage_elements());
		
		Loginpage_elements.un.sendKeys(Urls.inv_un);
		Thread.sleep(2000);
		Loginpage_elements.pw.sendKeys(Urls.val_pw);
		Thread.sleep(2000);
		Loginpage_elements.login.click();
		Thread.sleep(2000);
		

		//WebElement logout=dr.findElement(By.xpath("//a[text()='Logout']"));
		Loginpage_elements.logout.click();
	}
	
	@Test(priority=4)
	public void fvalun_fvalpw() throws InterruptedException, IOException
	{
		//WebElement un=dr.findElement(By.xpath("//input[@name='username']"));
	    //WebElement pw= dr.findElement(By.xpath("//input[@name='pwd']"));
		//WebElement login=dr.findElement(By.xpath("//div[text()='Login ']"));
		
		
		PageFactory.initElements(dr, new Loginpage_elements());
		
		Loginpage_elements.un.sendKeys(Urls.val_un);
		Thread.sleep(2000);
		Loginpage_elements.pw.sendKeys(Urls.val_pw);
		Thread.sleep(2000);
		Loginpage_elements.login.click();
		Thread.sleep(3000);
		
		WebElement tasklink=dr.findElement(By.xpath("//div[text()='TASKS']"));
		Thread.sleep(2000);
		Mouse_Dropd_Keybd.moveto_Element(tasklink);
		Thread.sleep(2000);
		Mouse_Dropd_Keybd.clickon_Element(tasklink);
		Thread.sleep(2000);
		
		Takescreenpics.scrolled_Screenshot("Homepage");
		
		
	}
	@Test(priority=5)
	public static void mforlist()
	{
		
		Assert.assertTrue(false);
		
	}
	

	


}
