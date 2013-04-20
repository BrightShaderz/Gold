package evolve.gold.server.networking;

public abstract class Packet {
	private byte id;
	protected abstract void write();
	protected abstract void read();
}
