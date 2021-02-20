package stateDesignPattern;

public class TryItOut {
	public static void main(String[] args) {
		Context c = new Context();
		StoppedState stState = new StoppedState();
		StartingState sState = new StartingState();
		PausedState pState = new PausedState();
		PlayingState pyState = new PlayingState();
		
		//starting
		sState.doSomething(c);
		System.out.println(c.getState().toString());
		System.out.println();
		
		//playing
		
		pyState.doSomething(c);
		System.out.println(c.getState().toString());
		System.out.println();
		
		//pausing
		pState.doSomething(c);
		System.out.println(c.getState().toString());
		System.out.println();
		
		//back to playing
		pyState.doSomething(c);
		System.out.println(c.getState());
		System.out.println();
		
		//stopping
		stState.doSomething(c);
		System.out.println(c.getState().toString());
		System.out.println();
		
		
		
	}

}
