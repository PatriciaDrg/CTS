package ro.ase.csie.cts.g1088.laborator3.faza1;

import ro.ase.csie.cts.g1088.laborator3.exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.g1088.laborator3.exceptii.ExceptieVechimeClienti;

public class Produs {
	
	public static final int VECHIME_CLIENT_MAXIMA=10;
	public static final float DISCOUNT_CLIENT_MAXIM= 0.15f;
	public float getPretFinal(TipProdus tipProdus, float pretInitial, int vechimeClientInAni) throws ExceptiePretInvalid, ExceptieVechimeClienti
	  {
		if(pretInitial <= 0) {
			throw new ExceptiePretInvalid();
			
		}
		if(vechimeClientInAni <0) {
			throw new ExceptieVechimeClienti();
		}
	    float pretFinal = 0;
	    float discountFidelitate = (vechimeClientInAni > VECHIME_CLIENT_MAXIMA) ? DISCOUNT_CLIENT_MAXIM : (float)vechimeClientInAni/100; 
	    float discount=TipProdus.NOU.getDiscount();
	    
	    switch(tipProdus) {
	    case NOU:
	    	pretFinal = pretInitial;
	    	break;
	    case DISCOUNT:
	    	 discount=TipProdus.DISCOUNT.getDiscount();
		      pretFinal = (pretInitial - (discount* pretInitial)) - discountFidelitate * (pretInitial - (0.1f * pretInitial));
		      break;
	    case STOC_LIMITAT:
	          discount=TipProdus.STOC_LIMITAT.getDiscount();
		      pretFinal = (pretInitial - (discount* pretInitial)) - discountFidelitate * (pretInitial - (0.25f * pretInitial));
		      break;
	    case VECHI:
	    	  discount=TipProdus.VECHI.getDiscount();
		      pretFinal = (pretInitial - (discount * pretInitial)) - discountFidelitate * (pretInitial - (0.35f * pretInitial));
		      break;
	   default:
		     throw new UnsupportedOperationException("un simbol din enumerare nu este procesat");
	    }
	    return pretFinal;
	  }
}
	  
		    	  
	    	
	    	
	    	
	   

	  