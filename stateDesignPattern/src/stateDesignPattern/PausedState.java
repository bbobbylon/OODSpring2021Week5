package stateDesignPattern;

public class PausedState implements State{

	
	public void doSomething(Context c) {
		// TODO Auto-generated method stub
		System.out.println("You are now in the Paused State. (Did you press pause by accident?)");
		c.setState(this);
	}
	
	public String toString() {
		return "This is the Paused State";
	}

}
