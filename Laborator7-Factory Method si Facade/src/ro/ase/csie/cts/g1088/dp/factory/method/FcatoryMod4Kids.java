package ro.ase.csie.cts.g1088.dp.factory.method;

public class FcatoryMod4Kids extends FactoryAbstractCaracter {
	
	public CaracterJoc getCaracter(TipCaracter tip, String nume) {
		CaracterJoc caracter = null;
		
         switch(tip) {
         case DISNAY:
        	 caracter = new CaracterDisnay("nume");
        	 break;
         case MARVEL:
        	 caracter = new CaracterMarvel(nume,300);
        	 break;
         case DC:
        	 caracter= new CaracterDCComics(nume);
        	 break;
        default:
        	throw new UnsupportedOperationException();
         }
         return caracter;
		
         
	}
	
	
}
