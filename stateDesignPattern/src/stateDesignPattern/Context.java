package stateDesignPattern;

public class Context {
	private State s;
	
	public Context() {
		s = null;
	}
	public State getState() {
		return s;
	}
	public void setState(State s) {
		this.s = s;
	}


}
