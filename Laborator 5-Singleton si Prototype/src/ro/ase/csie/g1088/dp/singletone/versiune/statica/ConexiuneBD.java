package ro.ase.csie.g1088.dp.singletone.versiune.statica;

public class ConexiuneBD {
	String ip;
	String denumire;
	
	public static final ConexiuneBD conexiune ;
	
	static {
		String ip ="127.0.0.1";
		String denumire="bdTest";
		conexiune= new ConexiuneBD(ip,denumire);
		
	}

	private ConexiuneBD(String ip, String denumire) {
		
		this.ip = ip;
		this.denumire = denumire;
	}
	
	

}
