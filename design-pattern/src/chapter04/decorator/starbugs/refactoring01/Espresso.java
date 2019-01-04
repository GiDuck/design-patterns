package chapter04.decorator.starbugs.refactoring01;

public class Espresso extends Beverage {

	public Espresso() {
		description = "Espresso";
	}
	
	/**
	 * @return super.cost() 추가
	 */
	@Override
	public double cost() {
		return 1.99 + super.cost();
	}

}
