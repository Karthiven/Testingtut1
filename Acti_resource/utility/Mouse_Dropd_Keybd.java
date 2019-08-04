package utility;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Acti_base.Acti_app_base;

public class Mouse_Dropd_Keybd extends Acti_app_base
{
	static Actions act=null;
	static Select sl= null;
	
	
	public static void moveto_Element(WebElement ele)     //moves mouse control to the element 'ele'
	{
		act= new Actions(dr);
		act.moveToElement(ele).perform();
		
	}
	
	
	public static void selectByvisibletext(WebElement ele, String text )  // select the text from drop down; applicable only for select class in html
	{
	sl=new Select(ele);
	sl.selectByVisibleText(text);
	}
	
	
	public static void clickon_Element(WebElement ele) throws InterruptedException   //left click on element ele
	{
		act= new Actions(dr);
		act.moveToElement(ele).perform();
		Thread.sleep(2000);
        act.click().perform();
		
		
	}
	
	
	public static void double_clickon_Element(WebElement ele) throws InterruptedException   // double click on element ele
	{
		act= new Actions(dr);
		act.moveToElement(ele).perform();
		Thread.sleep(2000);
        act.doubleClick().perform();
	}
	
	
	public static void rightclick_Element(WebElement ele) throws InterruptedException     // right click on element ele
	{
		act= new Actions(dr);
		act.moveToElement(ele).perform();
		Thread.sleep(2000);
        act.contextClick().perform();
	}
	
	

}
