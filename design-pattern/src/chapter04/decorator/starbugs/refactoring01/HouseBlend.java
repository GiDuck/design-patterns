package chapter04.decorator.starbugs.refactoring01;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		description = "House Blend Coffee";
	}

	/**
	 * @return super.cost() 추가
	 */
	@Override
	public double cost() {
		return .89 + super.cost();
	}

}
