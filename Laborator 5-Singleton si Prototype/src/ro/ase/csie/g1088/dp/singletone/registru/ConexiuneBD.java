package ro.ase.csie.g1088.dp.singletone.registru;

import java.util.Hashtable;

public class ConexiuneBD {
	
	String ip;
	String denumire;
	
 private static 	Hashtable<String,ConexiuneBD> conexiuni = new Hashtable<>();

	public ConexiuneBD(String ip, String denumire) {
		super();
		this.ip = ip;
		this.denumire = denumire;
	}
	public static ConexiuneBD getConexiune(String ip,String denumire) {
		ConexiuneBD conexiune= conexiuni.get(ip);
		if(conexiune== null) {
			conexiune= new ConexiuneBD(ip, denumire);
			conexiuni.put(ip, conexiune);
		}
		return conexiune;
	}
}
