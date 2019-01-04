package chapter04.decorator.starbugs.refactoring01;

public abstract class Beverage {

	protected String description;
	
	/**
	 * 첫 번째 개선
	 * soy, whip 등 필요 항목 더 추가 가능
	 */
	private boolean milk = false;
	private boolean mocha = false;

	public String getDescription() {
		return description;
	}

	/**
	 * <b>추가된 항목의 가격만 계산함.</b>
	 * 서브 클래스에서 cost() 메서드를 오버라이드할 때는
	 * 그 기능을 확장하여 특정 음료 형식의 가격을 더함.
	 * 
	 * @return 추가된 항목의 가격
	 */
	public double cost() {
		double cost = 0.0;
		
		if (hasMilk()) {
			cost += 0.1;
		}
		if (hasMocha()) {
			cost += 0.2;
		}
		return cost;
	}

	public boolean hasMilk() {
		return milk;
	}
	
	public void setMilk(boolean milk) {
		this.milk = milk;
	}

	public boolean hasMocha() {
		return mocha;
	}
	
	public void setMocha(boolean mocha) {
		this.mocha = mocha;
	}

}
