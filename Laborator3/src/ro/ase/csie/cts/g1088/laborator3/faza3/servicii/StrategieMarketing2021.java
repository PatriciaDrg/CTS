package ro.ase.csie.cts.g1088.laborator3.faza3.servicii;

import ro.ase.csie.cts.g1088.laborator3.exceptii.ExceptiePretInvalid;

public class StrategieMarketing2021 implements InterfataMarketing {

	@Override
	public float getDisountFidelitate(int vechimeClientInAni) {
		return (vechimeClientInAni > VECHIME_CLIENT_MAXIMA) ? 
				DISCOUNT_CLIENT_MAXIM : (float)vechimeClientInAni/100;
	}

	
	


}
