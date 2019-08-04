package utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Acti_base.Acti_app_base;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Takescreenpics extends Acti_app_base 
{
	static Date d1=new Date();
	
	public static void normal_Screenshot(String name) throws IOException
	{
		
		TakesScreenshot var=(TakesScreenshot) dr;
		File src = var.getScreenshotAs(OutputType.FILE);
		File dst = new File("./CustScreenshots/"+name+"_"+d1.toGMTString().replaceAll(":", "-").replaceAll("GMT", "")+".png");
		FileUtils.copyFile(src, dst);
	}
	
	
	public static void scrolled_Screenshot(String name) throws IOException
	{
		
		Screenshot scrollshot= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(dr);
		
		
	    ImageIO.write(scrollshot.getImage(), "PNG", new File("./CustScreenshots/"+name+"_"+d1.toGMTString().replaceAll(":", "-").replaceAll("GMT", "")+".png"));
		
	}

}
