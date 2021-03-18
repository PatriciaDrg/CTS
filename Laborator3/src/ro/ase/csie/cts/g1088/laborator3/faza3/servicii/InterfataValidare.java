package ro.ase.csie.cts.g1088.laborator3.faza3.servicii;

import ro.ase.csie.cts.g1088.laborator3.exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.g1088.laborator3.exceptii.ExceptieVechimeClienti;

public interface InterfataValidare {
	public  void validarePret(float pretInitial) throws ExceptiePretInvalid;
	public  void validareVechimeAniClienti(int vechimeClientInAni) throws ExceptieVechimeClienti;
		

}
