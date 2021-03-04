package ro.ase.cts.g1088.laborator.modele;

public abstract class Cont {
	public abstract double getBalanta();
	public abstract void alimenteazaContul(Double valoare);
	public abstract void extrage(Double valoare);
	public abstract void transfer(Cont destinatie, Double valoare);

}
