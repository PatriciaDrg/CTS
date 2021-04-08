package ro.ase.csie.cts.g1088.dp.factory.method;

public class TestFactory {
	
	public static void main(String[]args) {
		boolean isModJoc4Kids = true;
		
		if(isModJoc4Kids) {
			
		}else {
			//dezvoltare doar cu caractere normale
		}
		FactoryAbstractCaracter factoryCaracter = null;
		factoryCaracter=(isModJoc4Kids) ? new FcatoryMod4Kids(): new FactoryModNormal();
		
		Caracter superman =factoryCaracter.getCaracter(TipCaracter.MARVEL, "Superman");
	}
	

}
