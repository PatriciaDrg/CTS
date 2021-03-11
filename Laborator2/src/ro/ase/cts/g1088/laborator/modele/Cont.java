package ro.ase.cts.g1088.laborator.modele;

import ro.ase.cts.g1088.laborator.exceptii.ExceptieFonduriInsuficiente;
import ro.ase.cts.g1088.laborator.exceptii.ExceptieTransferIlegal;

public abstract class Cont {
	public abstract double getBalanta();
	public abstract void alimenteazaContul(Double valoare);
	public abstract void extrage(Double valoare) throws ExceptieFonduriInsuficiente , ExceptieTransferIlegal;
	public abstract void transfer(Cont destinatie, Double valoare);

}
