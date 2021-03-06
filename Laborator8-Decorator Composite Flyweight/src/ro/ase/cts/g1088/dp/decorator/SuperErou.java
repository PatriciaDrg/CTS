package ro.ase.cts.g1088.dp.decorator;

public abstract class SuperErou {
	String nume;
	int puncteViata;
	
	public SuperErou(String nume, int puncteViata) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
	}
	public String getNume() {
		return nume;
	}
	public int getPuncteViata() {
		return puncteViata;
	}
	public abstract void alearga();
	public abstract void esteLovit(int puncte);
	public abstract void seVindeca(int puncte);
}


