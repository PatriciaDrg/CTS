package ro.ase.csie.cts.g1088.testare.modele;

public class OperatiiMatematice {
	
	public static int aduna(int a, int b) {
		return a + b;
	}
	
	public static double impartire(int a, int b) throws ExceptieImpartireLa0 {
		if(b == 0)
			throw new ExceptieImpartireLa0();
		return (double)a/b;
	}
}
