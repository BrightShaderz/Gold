package evolve.gold.server.networking.packets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import evolve.gold.server.networking.Packet;
import evolve.gold.server.networking.PacketType;

public class KeepAlive extends Packet {
	
	public Integer id;
	
	public KeepAlive(int id) {
		this.id = id;
	}
	
	@Override
	public byte getID() {
		return PacketType.KeepAlive.getId();
	}

	@Override
	public void write(DataOutputStream dos) throws IOException {
		dos.writeInt(this.id);
	}

	@Override
	public void read(DataInputStream dis) throws IOException {
		this.id = dis.readInt();
	}
}
