package ro.ase.csie.g1088.dp.singletone.versiune.statica;


public class TestSingletone {
	
	public static void main(String[]args) {
		ConexiuneBD conexiune1= ConexiuneBD.conexiune;
		ConexiuneBD conexiune2= ConexiuneBD.conexiune;
		
		if(conexiune1 == conexiune2) {
			System.out.println("Cele doua ref sunt identice");
		}else {
			System.out.println("Cele doua ref sunt diferite");
		}
		
		
	}
		
	}


