package evolve.gold.system.logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Logger {
	
	File logFile = new File("logs/" + LogDate.getSimpleLogDate(new Date()) + ".txt");
	
	public void Log(String message) {
		Log(message, LogType.INFO);
	}
	
	public void Log(String message, LogType type) {
		String prefix = "[" + LogDate.getEnhancedLogDate(new Date()) + "|" + type.getPrefix() + "]";
		try {
			if(!logFile.exists()) {
				logFile.createNewFile();
			}
			FileWriter logWriter = new FileWriter(this.logFile);
			logWriter.write(prefix + message + System.getProperty("line.separator"));
			logWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
