package ro.ase.cts.g1088.laborator.modele;

import ro.ase.cts.g1088.laborator.exceptii.ExceptieFonduriInsuficiente;
import ro.ase.cts.g1088.laborator.exceptii.ExceptieTransferIlegal;

public class ContDepozit extends ContBancar {
  
	public static final int BALANTA_MINIMA=100;
	
	public ContDepozit(String iban) {
		super(BALANTA_MINIMA,iban );
	}

	@Override
	public void alimenteazaContul(Double valoare) {
		this.balanta += valoare;
	}

	@Override
	public void extrage(Double valoare) throws ExceptieFonduriInsuficiente {
		if(this.balanta <  valoare) {
			throw new ExceptieFonduriInsuficiente("nu am bani");
		}
		else {
			this.balanta -= valoare;
		}
		
	}

	@Override
	public void transfer(Cont destinatie, Double valoare) throws ExceptieFonduriInsuficiente , ExceptieTransferIlegal {
		
		if(this == destinatie) {
			 throw new ExceptieTransferIlegal();
			 }
		this.extrage(valoare);
		destinatie.alimenteazaContul(valoare);
		}
	}

