package ro.ase.cts.g1088.dp.decorator;

public class DecoratorArmura extends DecoratorErouAbstract {
	public DecoratorArmura(SuperErou erou,int nivelArmura) {
		super(erou);
		this.nivelArmura=nivelArmura;
		
	}

	int nivelArmura;
	
	public void esteLovit(int puncte) {
		int puncteLovitura = puncte - nivelArmura;
		if(puncteLovitura > 0)
			super.erou.esteLovit(puncteLovitura);
	}
	

}
