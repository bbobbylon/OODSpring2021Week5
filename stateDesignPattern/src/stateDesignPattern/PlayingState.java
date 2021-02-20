package stateDesignPattern;

public class PlayingState implements State {

	
	public void doSomething(Context c) {
		// TODO Auto-generated method stub
		System.out.println("You are now playing in the imaginary game...");
		c.setState(this);
	}
	
	public String toString() {
		return "This is the Playing State";
	}

}
