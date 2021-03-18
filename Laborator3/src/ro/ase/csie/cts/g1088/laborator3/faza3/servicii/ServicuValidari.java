package ro.ase.csie.cts.g1088.laborator3.faza3.servicii;

import ro.ase.csie.cts.g1088.laborator3.exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.g1088.laborator3.exceptii.ExceptieVechimeClienti;

public class ServicuValidari implements InterfataValidare {

	@Override
	public void validarePret(float pretInitial) throws ExceptiePretInvalid {
		if(pretInitial <=0) {
			throw new ExceptiePretInvalid();
		}
		
	}

	@Override
	public void validareVechimeAniClienti(int vechimeClientInAni) throws ExceptieVechimeClienti {
		if(vechimeClientInAni <=0) {
			throw new ExceptieVechimeClienti();
		}
		
	}

	

	
}
