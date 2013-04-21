package evolve.gold.server.networking;

public abstract class Packet {
	private byte id;
	protected abstract void write(DataOutputStream out);
	protected abstract void read(DataOutputStream in);
}
