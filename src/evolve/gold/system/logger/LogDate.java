package evolve.gold.system.logger;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LogDate {
	private static SimpleDateFormat simpleFormatter = new SimpleDateFormat("dd-MM-yyyy");
	private static SimpleDateFormat enhancedFormatter = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss.S");
	
	public static String getSimpleLogDate(Date date) {
		return new String(simpleFormatter.format(new Date()));
	}
	
	public static String getEnhancedLogDate(Date date) {
		return new String(enhancedFormatter.format(new Date()));
	}
}
