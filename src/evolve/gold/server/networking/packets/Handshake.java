package evolve.gold.server.networking.packets;

import java.io.DataInputStream;
import java.io.DataOutputStream;

import evolve.gold.server.Server;
import evolve.gold.server.networking.Packet;
import evolve.gold.server.networking.PacketType;

public class Handshake extends Packet {

	public int protocol;
	public String username;
	public String serverHost;
	public int serverPort;
	
	public Handshake(String username, String serverHost) {
		this.protocol = Server.minecraftVersion;
		this.username = username;
		this.serverHost = serverHost;
		this.serverPort = Server.port;
	}
	
	@Override
	public byte getID() {
		return PacketType.Handshake.getId();
	}

	@Override
	public void write(DataOutputStream dos) throws Exception {
		dos.writeInt(this.protocol);
		//TODO: write username.
		//TODO: write serverHost.
		dos.writeInt(this.serverPort);
	}

	@Override
	public void read(DataInputStream dis) throws Exception {
		this.protocol = dis.readInt();
		//TODO: read username.
		//TODO: read serverHost.
		this.serverPort = dis.readInt();
	}
}
