package chapter04.decorator.starbugs.refactoring01;

public class CafeTest {

	public static void main(String[] args) {
		HouseBlend hb = new HouseBlend();
		Espresso esp = new Espresso();
		
		System.out.println("HouseBlend 커피는 얼마인가요?");
		System.out.println(String.format("HouseBlend는 %.2f입니다.", hb.cost()));
		System.out.println("==============================");
		
		System.out.println("Espresso 커피는 얼마인가요?");
		System.out.println(String.format("Espresso %.2f입니다.", esp.cost()));
		System.out.println("==============================");
		
		System.out.println("HouseBlend 커피에 우유를 추가해 주세요.");
		hb.setMilk(true);
		System.out.println(String.format("우유 추가한 HouseBlend는 %.2f입니다.", hb.cost()));
		System.out.println("==============================");
		
		System.out.println("HouseBlend 커피에 우유를 한 번 더 추가하면 얼마인가요?");
		System.out.println("현재 클래스 구조로는 더 이상 추가할 수 없습니다.");
	}
	
}
