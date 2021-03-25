package ro.ase.csie.g1088.dp.singletone;

public class TestSingeltone {

	public static void main(String[]args) {
		ConexiuneBD conexiune1= ConexiuneBD.getConexiune();
		ConexiuneBD conexiune2= ConexiuneBD.getConexiune();
		
		if(conexiune1 == conexiune2) {
			System.out.println("Cele doua ref sunt identice");
		}else {
			System.out.println("Cele doua ref sunt diferite");
		}
		
		ModulProfil modulProfil=new ModulProfil();
		ModulUI modulUI = new ModulUI();
		
	}
}
