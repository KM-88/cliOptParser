package framew.cmd;

import java.util.List;

public abstract class Command implements Cloneable, Runnable {

	protected List<String> args;

	protected String name;

	public Command(String name) {
		super();
		this.name = name;
	}

	public Command(String name, List<String> args) {
		super();
		this.args = args;
	}

	public List<String> getArgs() {
		return args;
	}

	public void setArgs(List<String> args) {
		this.args = args;
	}

}