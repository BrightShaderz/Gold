package evolve.gold.server.networking.packets;

public class KeepAlive extends Packet {
    
    @Overide private byte id = 0x00;
    
	@Overide protected abstract void write(DataOutputStream out) {
	       
	}
    
	@Overide protected abstract void read(DataOutputStream in) {
	       
	}
}