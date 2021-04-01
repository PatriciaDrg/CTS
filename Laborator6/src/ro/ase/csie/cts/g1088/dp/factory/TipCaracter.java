package ro.ase.csie.cts.g1088.dp.factory;

public enum TipCaracter {
	MARVEL,DISNAY;
	
	public static CracterAbstract getCaracter(TipCaracter tip, String nume) {
		CracterAbstract caracter=null;
		
		switch(tip) {
		case DISNAY:
			caracter=new CaracterDisney("alb",nume,true);
			break;
		case MARVEL:
			caracter=new CaracterMarvel(nume,50);
			break;
			default:
				throw new UnsupportOperationException();
		}
		return caracter;
	}

}
