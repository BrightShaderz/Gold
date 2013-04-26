package evolve.gold.server.networking.packets;

import java.io.DataInputStream;
import java.io.DataOutputStream;

import evolve.gold.server.networking.Packet;
import evolve.gold.server.networking.PacketType;

public class ChatMessage extends Packet {

	public String message;
	
	public ChatMessage(String message) {
		this.message = message;
	}
	
	@Override
	public byte getID() {
		return PacketType.ChatMessage.getId();
	}

	@Override
	public void write(DataOutputStream dos) throws Exception {
		//TODO: write message.
	}

	@Override
	public void read(DataInputStream dis) throws Exception {
		//TODO: read message.
	}

}
