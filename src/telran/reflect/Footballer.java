package telran.reflect;

public class Footballer implements Sportsman {

	private static final String DEFAULT_TEAM = "Real Madrid";
	String team;
	public Footballer(String team) {
		this.team = team;
	}
	public Footballer() {
		this(DEFAULT_TEAM);
	}

	@Override
	public void action() {
		System.out.println("I'm playing football in the team " + team);

	}

}
