package utility;

import org.apache.log4j.Logger;

public class Loggs
{
	
	public static void info(String text)
	{
		Logger log=Logger.getLogger(Class.class);
		log.info(text);
		
	}

}
