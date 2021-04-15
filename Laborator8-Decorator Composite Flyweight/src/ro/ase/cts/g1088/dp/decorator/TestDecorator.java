package ro.ase.cts.g1088.dp.decorator;

public class TestDecorator {
	
public static void main(String[] args) {
		
		SuperErou dragon = new Dragon("Dragon albastru", 1000);
		dragon.alearga();
		dragon.esteLovit(200);
		dragon.seVindeca(100);
		

		SuperErou dragon2 = new Dragon("Dragon albastru", 1000);
		dragon2.alearga();
		dragon2.esteLovit(200);
		dragon2.seVindeca(100);
		
		

		SuperErou dragonCuArmura = new DecoratorArmura(dragon, 200);
		dragon.esteLovit(300);

		SuperErou dragonEsteRanit = new DecoratorEsteRanit(dragon);
		dragon.esteLovit(550);
		dragon.alearga();


	}
}
