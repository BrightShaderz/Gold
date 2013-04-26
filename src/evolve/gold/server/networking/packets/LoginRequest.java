package evolve.gold.server.networking.packets;

import java.io.DataInputStream;
import java.io.DataOutputStream;

import evolve.gold.server.networking.Packet;
import evolve.gold.server.networking.PacketType;

public class LoginRequest extends Packet {

	public Integer id;
	public String levelType;
	public byte gameMode;
	public byte dimension;
	public byte difficulty;
	public byte notUsed;
	public byte maxPlayers;
	
	@Override
	public byte getID() {
		return PacketType.LoginRequest.getId();
	}

	@Override
	public void write(DataOutputStream dos) throws Exception {
		dos.writeInt(this.id);
		//TODO: write levelType.
		dos.writeByte(this.gameMode);
		dos.writeByte(this.dimension);
		dos.writeByte(this.difficulty);
		dos.writeByte(this.notUsed);
		dos.writeByte(this.maxPlayers);
	}

	@Override
	public void read(DataInputStream dis) throws Exception {
		this.id = dis.readInt();
		//TODO: read levelType.
		this.gameMode = dis.readByte();
		this.dimension = dis.readByte();
		this.difficulty = dis.readByte();
		this.notUsed = dis.readByte();
		this.maxPlayers = dis.readByte();
	}

}
