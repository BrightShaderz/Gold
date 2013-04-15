package evolve.gold.server.networking;

import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ExceptionEvent;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelUpstreamHandler;

import evolve.gold.server.Server;
import evolve.gold.system.logger.LogType;
import evolve.gold.system.logger.Logger;

public class GoldServerHandler extends SimpleChannelUpstreamHandler {
	
	private final Server server;
	
	Logger l = new Logger();

	public GoldServerHandler(Server server) {
		this.server = server;
	}
	
	@Override
    public void exceptionCaught(final ChannelHandlerContext con, final ExceptionEvent event) {
		try {
            event.getChannel().close();     
            if (event.getCause().getMessage().contains("forcibly closed by the remote host")) {
                return;
            }
            l.Log("Exception caught: " + event.getCause(), LogType.ERROR);
            event.getCause().printStackTrace();
        } catch (Exception e) {
            event.getCause().printStackTrace();
        }
	}
	
	@Override
    public void messageReceived(final ChannelHandlerContext context, final MessageEvent event) {
		
	}
}
