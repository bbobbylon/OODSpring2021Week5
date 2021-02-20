package stateDesignPattern;

public class StartingState implements State{
	public void doSomething(Context c) {
		System.out.println("You are in the starting state now, since you pressed 'Start' ");
		c.setState(this);
	}
	
	public String toString() {
		return "This is the Starting State";
	}

}
