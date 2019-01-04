package chapter04.decorator.starbugs.refactoring02;

public class CafeTest {

	public static void main(String[] args) {
		Beverage b1 = new HouseBlend();
		System.out.println(b1.getDescription() + " $" + b1.cost());
		
		b1 = new Milk(b1);
		System.out.println(b1.getDescription() + " $" + b1.cost());

		b1 = new Mocha(b1);
		System.out.println(b1.getDescription() + " $" + b1.cost());
		
		b1 = new Mocha(b1);
		System.out.println(b1.getDescription() + " $" + b1.cost());
		
		Beverage b2 = new Mocha(
						new Mocha(
							new Milk(
								new HouseBlend())));
		System.out.println(b2.getDescription());
	}
	
}
