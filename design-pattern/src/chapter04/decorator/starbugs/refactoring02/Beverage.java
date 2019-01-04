package chapter04.decorator.starbugs.refactoring02;

public abstract class Beverage {

	protected String description;

	public String getDescription() {
		return description;
	}

	public abstract double cost();

}
