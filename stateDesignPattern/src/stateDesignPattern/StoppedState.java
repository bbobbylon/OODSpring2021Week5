package stateDesignPattern;

public class StoppedState implements State {

	
	public void doSomething(Context c) {
		// TODO Auto-generated method stub
		System.out.println("You are in the stopped state now, most likely because you LOST THE GAME :(");
		c.setState(this);
	}
	
	public String toString() {
		return "This is the Stopped State";
	}

}
