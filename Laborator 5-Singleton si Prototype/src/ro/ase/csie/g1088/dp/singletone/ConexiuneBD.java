package ro.ase.csie.g1088.dp.singletone;

public class ConexiuneBD {
	String ip;
	String denumire;
	
	private static ConexiuneBD conexiune = null;
	

	private ConexiuneBD(String ip, String denumire) {
		
		
		System.out.println("apel constructor");
		this.ip = ip;
		this.denumire = denumire;
	}
	
	public static ConexiuneBD getConexiune() {
		if(conexiune == null) {
			conexiune=new ConexiuneBD("10.0.0.1","cts");
			
		}
		return conexiune;
	}

}
