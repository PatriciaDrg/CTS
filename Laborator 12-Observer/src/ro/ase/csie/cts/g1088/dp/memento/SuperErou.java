package ro.ase.csie.cts.g1088.dp.memento;

public class SuperErou {
	
	String nume;
	int puncteViata;
	String magie;
	public SuperErou(String nume, int puncteViata, String magie) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
		this.magie = magie;
	}
	
	public void ataca(int puncte) {
		System.out.println("ataca");
	}
	public void esteRANIT(int puncte) {
		System.out.println("este ranit");
		this.puncteViata -=puncte;
	}
	
	public void seVINDECA(int puncte) {
		System.out.println("se vindeca");
		this.puncteViata +=puncte;
	}
	public MementoSuperErou salvare() {
		return new MementoSuperErou(nume, magie, puncteViata)
	}
	public void incarcaSalvare(MementoSuperErou memento) {
		this.nume=memento.nume;
		this.puncteViata=memento.puncteViata;
		this.magie=memento.magie;
	}

}
