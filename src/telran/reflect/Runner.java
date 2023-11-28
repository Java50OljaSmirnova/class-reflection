package telran.reflect;

public class Runner implements Sportsman {
	private static final String DEFAULT_DISTANCE = "1000";
	String distance;
	
	public Runner(String distance) {
		this.distance = distance;
	}
	public Runner() {
		this(DEFAULT_DISTANCE);
	}

	@Override
	public void action() {
		System.out.println("I'm runner on " + distance);
		
	}

}
