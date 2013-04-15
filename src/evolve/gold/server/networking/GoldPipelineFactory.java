package evolve.gold.server.networking;

import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineFactory;

import evolve.gold.server.Server;

public class GoldPipelineFactory implements ChannelPipelineFactory {
	
	private final Server server;

	public GoldPipelineFactory(Server server) {
		this.server = server;
	}
	
	@Override
	public ChannelPipeline getPipeline() throws Exception {
		return null;
	}
}
