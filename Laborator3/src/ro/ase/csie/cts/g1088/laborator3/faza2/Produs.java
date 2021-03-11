package ro.ase.csie.cts.g1088.laborator3.faza2;

import ro.ase.csie.cts.g1088.laborator3.exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.g1088.laborator3.exceptii.ExceptieVechimeClienti;

public class Produs {
	
	public static final int VECHIME_CLIENT_MAXIMA=10;
	public static final float DISCOUNT_CLIENT_MAXIM= 0.15f;
	
	public static void validarePret(float pretInitial) throws ExceptiePretInvalid {
		if(pretInitial <= 0) {
			throw new ExceptiePretInvalid();
			
		}
	}
	
	public static void validareVechimeAniClienti(int vechimeClientInAni) throws ExceptieVechimeClienti {
		if(vechimeClientInAni <0) {
			throw new ExceptieVechimeClienti();
		}
	}
	
	public static float getDisountFidelitate(int vechimeClientInAni) {
		return (vechimeClientInAni > VECHIME_CLIENT_MAXIMA) ? DISCOUNT_CLIENT_MAXIM : (float)vechimeClientInAni/100; 
	}
	
	public static float getPretCuDisount(float pretInitial,float discount) {
		return pretInitial - (discount * pretInitial);
	}
	public float getPretFinal(TipProdus tipProdus, float pretInitial, int vechimeClientInAni) throws ExceptiePretInvalid, ExceptieVechimeClienti
	  {
		validarePret(pretInitial);
		validareVechimeAniClienti(vechimeClientInAni);
		
		
	    float pretFinal = 0;
	    float discountFidelitate = getDisountFidelitate(vechimeClientInAni);
	    float discount=TipProdus.NOU.getDiscount();
	    float valoareDiscountTipProdus=0;
	    
	    switch(tipProdus) {
	    case NOU:
	    	pretFinal = pretInitial;
	    	break;
	    case DISCOUNT:
	    	 discount=TipProdus.DISCOUNT.getDiscount();
		      valoareDiscountTipProdus =getPretCuDisount(pretInitial, discount);
		      pretFinal= valoareDiscountTipProdus * (1- discountFidelitate);
		      break;
	    case STOC_LIMITAT:
	          discount=TipProdus.STOC_LIMITAT.getDiscount();
	          valoareDiscountTipProdus =getPretCuDisount(pretInitial, discount);
		      pretFinal= valoareDiscountTipProdus * (1- discountFidelitate);
		      break;
	    case VECHI:
	    	  discount=TipProdus.VECHI.getDiscount();
	    	  valoareDiscountTipProdus =getPretCuDisount(pretInitial, discount);
		      pretFinal= valoareDiscountTipProdus * (1- discountFidelitate);
		      break;
	   default:
		     throw new UnsupportedOperationException("un simbol din enumerare nu este procesat");
	    }
	    return pretFinal;
	  }
}
	  
		    	  
	    	
	    	
	    	
	   

	  