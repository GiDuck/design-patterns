package chapter04.decorator.starbugs;

public class HouseBlendWithSteamedMilk extends Beverage {

	public HouseBlendWithSteamedMilk() {
		description = "House Blend Coffee with Steamed Milk";
	}
	
	/**
	 * 우유를 추가한 하우스 블렌드 커피 가격
	 * 새로운 첨가물이 있을 때마다 새로운 클래스를 만들어야 함
	 * 
	 * @return 우유 값 0.1 추가
	 */
	@Override
	public double cost() {
		return .89 + .1;
	}
	
}
