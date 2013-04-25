package evolve.gold.server;

import java.net.ServerSocket;
import java.net.Socket;

import evolve.gold.system.logger.LogType;
import evolve.gold.system.logger.Logger;
import evolve.gold.system.props.ServerProperties;



public class Server {
	
	private static ServerSocket connection;
	private static Logger logger;
	private final int minecraftVersion = 60;
	private static Boolean alive = false;
    
    public void start() {
    	this.alive = true;
    	
    	while(alive) {
    		try{
    			connection = new ServerSocket(ServerProperties.getPort());
    			new Thread(){
					public void run()
					{
						Connect();
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
	
	public static void Connect()
	{
		while (true)
		{
			try{
				Socket client = connection.accept();
				//TODO add new player & send packets.
			} catch (Exception e){
				logger.Log(e.toString(), LogType.ERROR);
			}
		}
	}
}