package evolve.gold.server.nbt;

public class TagNotFoundException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public TagNotFoundException(String message) {
		super(message);
	}
	
	public TagNotFoundException(Throwable reason) {
		super(reason);
	}
	
	public TagNotFoundException(String message, Throwable reason) {
		super(message, reason);
	}
}
