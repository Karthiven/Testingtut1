package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage_elements {
	
	@FindBy(xpath="//input[@name='username']")
	public static WebElement un;
	
	@FindBy(xpath="//input[@name='pwd']")
	public static WebElement pw;
	
	@FindBy(xpath="//div[text()='Login ']")
	public static WebElement login;
	
	@FindBy(xpath="//a[text()='Logout']")
	public static WebElement logout;
	
	
	

}
