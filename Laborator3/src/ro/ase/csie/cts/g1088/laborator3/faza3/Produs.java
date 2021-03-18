package ro.ase.csie.cts.g1088.laborator3.faza3;

import ro.ase.csie.cts.g1088.laborator3.exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.g1088.laborator3.exceptii.ExceptieVechimeClienti;
import ro.ase.csie.cts.g1088.laborator3.faza3.servicii.InterfataMarketing;
import ro.ase.csie.cts.g1088.laborator3.faza3.servicii.InterfataValidare;

public class Produs {
	
	InterfataMarketing serviciuMK=null;
	
	InterfataValidare serviciuValidare =null;
	
	
	
	public static float getPretCuDisount(float pretInitial,float discount) {
		return pretInitial - (discount * pretInitial);
	}
	public float getPretFinal(TipProdus tipProdus, float pretInitial, int vechimeClientInAni) throws ExceptiePretInvalid, ExceptieVechimeClienti
	  {
		serviciuValidare.validarePret(pretInitial);
		serviciuValidare.validareVechimeAniClienti(vechimeClientInAni);
		
		
	    float discountFidelitate =(tipProdus == TipProdus.NOU) ? 0: serviciuMK.getDisountFidelitate(vechimeClientInAni);
	   
	    
	    
	    float discount=tipProdus.getDiscount();
	    float  valoareDiscountTipProdus =getPretCuDisount(pretInitial, discount);
	    float  pretFinal= valoareDiscountTipProdus * (1- discountFidelitate);
	    
	   
	   
	    return pretFinal;
	  }
}
	  
		    	  
	    	
	    	
	    	
	   

	  