package evolve.gold.server;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import evolve.gold.server.model.entity.living.Player;
import evolve.gold.system.logger.LogType;
import evolve.gold.system.logger.Logger;
import evolve.gold.system.props.ServerProperties;



public class Server {
	
	private static ServerSocket connection;
	public static List<Player> onlineUsers = new ArrayList<Player>();
	private static Logger logger;
	private final int minecraftVersion = 60;
	private static Boolean alive = false;
    
    public void start() {

    	this.alive = true;

    	while(alive) {
    		try{
    			connection = new ServerSocket(ServerProperties.getPort());
    			new Thread(){
					public void run() {
						connect();
					}
				}.start();
    		} catch(Exception e) {
    			logger.Log(e.toString(), LogType.ERROR);
    		}
    	}
    }
	
	public void restart() {
		
	}
	
	public void stop() {
		
	}
	
	public static void connect()
	{
		while (true)
		{
			try{
				Socket client = connection.accept();
				Player p = new Player(client);
			} catch (Exception e){
				logger.Log(e.toString(), LogType.ERROR);
			}
		}
	}
}