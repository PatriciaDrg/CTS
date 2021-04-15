package ro.ase.cts.g1088.dp.decorator;

public class DecoratorEsteRanit extends DecoratorErouAbstract {

	public static final int NIVEL_CRITIC=200;
	public DecoratorEsteRanit(SuperErou erou) {
		super(erou);
		
	}
	
	@Override
	public void alearga() {
		if(this.erou.puncteViata < NIVEL_CRITIC) {
			System.out.println("Nu se mai poate deplasa. Este ranit critic");
		}
		else
			this.erou.alearga();
	}
}
