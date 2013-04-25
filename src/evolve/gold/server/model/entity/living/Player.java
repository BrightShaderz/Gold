package evolve.gold.server.model.entity.living;

import java.net.Socket;

import evolve.gold.server.model.entity.LivingEntity;
import evolve.gold.system.logger.LogType;
import evolve.gold.system.logger.Logger;

public class Player extends LivingEntity {

	private Socket s;
	private Logger logger;
	private String loginName;
	private String displayName;
	private boolean isConnected = false;
	
	public Player(Socket socket) {
		try {
			this.s = socket;
		} catch (Exception e) {
			logger.Log(e.toString(), LogType.ERROR);
		}
	}

}
