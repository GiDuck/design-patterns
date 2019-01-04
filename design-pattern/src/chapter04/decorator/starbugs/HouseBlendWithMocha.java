package chapter04.decorator.starbugs;

public class HouseBlendWithMocha extends Beverage {

	public HouseBlendWithMocha() {
		description = "House Blend Coffee with Mocha";
	}
	
	/**
	 * 모카 추가한 하우스 블렌드 커피 가격
	 * 새로운 첨가물이 있을 때마다 새로운 클래스를 만들어야 함
	 * 
	 * @return 모카 값 0.2 추가
	 */
	@Override
	public double cost() {
		return .89 + .2;
	}

}
