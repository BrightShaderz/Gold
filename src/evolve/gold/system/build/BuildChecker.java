package evolve.gold.system.build;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class BuildChecker {
	
	public BuildChecker() {
		getBuildInfo(new Build());
		getCurrentBuild();
	}
	
	private int build;
	private int revision;
	private BuildType type;
	private String[] buildArray;
	
	void getBuildInfo(Build b) {
		this.build = b.getBuild();
		this.revision = b.getRevision();
		this.type = b.getType();
	}
	
	
	void getCurrentBuild() {
		try {
		    URL url = new URL("http://evolve.x10.mx/goldbuild.txt");
		    BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
		    String build = in.readLine();
		    this.buildArray = build.split(":|\\.");
		    in.close();
		} catch (MalformedURLException e) {
		} catch (IOException e) {
		}
	}
	
	public boolean isUpToDate() {
		String currentBuild = this.buildArray[2];
		String currentRevision = this.buildArray[3];
		String currentType = this.buildArray[1];
		
		if(this.type.getName() == currentType && this.build >= Integer.parseInt(currentBuild) && this.revision >= Integer.parseInt(currentRevision)) {
			return true;
		} else {
			return false;
		}
	}
}
