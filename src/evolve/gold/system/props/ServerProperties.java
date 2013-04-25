package evolve.gold.system.props;

public class ServerProperties {
	
	String mainPropertiesFile = "server.properties";
	String mainPropertiesTitle = "~~~Gold Server Properties File~~~";
	GoldProperties mainProperties = new GoldProperties(mainPropertiesFile, mainPropertiesTitle);
	
	static int port;
	static int maxPlayers;
	static String motd;
	
	/**
	 * @return the port
	 */
	public static int getPort() {
		return port;
	}

	/**
	 * @return the maxPlayers
	 */
	public static int getMaxPlayers() {
		return maxPlayers;
	}

	/**
	 * @return the motd
	 */
	public static String getMotd() {
		return motd;
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
		maxPlayers = prop.getInteger("Max-Players", 20);
		motd = prop.getString("MOTD", "Welcome to my server!");
		
		
	}
}
