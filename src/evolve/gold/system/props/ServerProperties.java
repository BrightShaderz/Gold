package evolve.gold.system.props;

public class ServerProperties {
	
	String mainPropertiesFile = "server.properties";
	String mainPropertiesTitle = "~~~Gold Server Properties File~~~";
	GoldProperties mainProperties = new GoldProperties(mainPropertiesFile, mainPropertiesTitle);
	
	static int port;
	
	/**
	 * @return the port
	 */
	public static int getPort() {
		return port;
	}

	void work(GoldProperties prop) {
		
		try {
			values(prop);
			prop.initiate();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	void values(GoldProperties prop) {
		port = prop.getInteger("Server-Port", 25565);
	}
}
