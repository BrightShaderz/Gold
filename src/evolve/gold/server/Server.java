package evolve.gold.server;

import java.net.InetSocketAddress;

import org.jboss.netty.bootstrap.ServerBootstrap;

import evolve.gold.system.props.ServerProperties;


public class Server {
 
	private transient ServerBootstrap bootstrap;
 
    public ServerBootstrap getBootstrap() {
        return this.bootstrap;
    }
    
    public void start() {
    	this.bootstrap.bind(new InetSocketAddress(ServerProperties.getPort()));
	}
	
	public void restart() {
		
	}
	
	public void stop() {
		
	}
}