package evolve.gold.server.networking.packets;

import java.io.DataInputStream;
import java.io.DataOutputStream;

import evolve.gold.server.networking.Packet;
import evolve.gold.server.networking.PacketType;

public class TimeUpdate extends Packet {

	public long worldAge;
	public long dayTime;
	@Override
	public byte getID() {
		return PacketType.TimeUpdate.getId();
	}

	@Override
	public void write(DataOutputStream dos) throws Exception {
		dos.writeLong(this.worldAge);
		dos.writeLong(this.dayTime);
	}

	@Override
	public void read(DataInputStream dis) throws Exception {
		this.worldAge = dis.readLong();
		this.dayTime = dis.readLong();
	}

}
