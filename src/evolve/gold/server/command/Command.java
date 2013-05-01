package evolve.gold.server.command;


public abstract class Command {
	public abstract String name();
	public abstract String alias();
	public abstract String help();
}
