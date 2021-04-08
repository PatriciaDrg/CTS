package ro.ase.csie.cts.g1088.dp.facade;

public class APIJocFacade {
	
	//interfata simplificata pentru a obtine prf unui juc
	
	public static String getProfil(String username, String pass) {
		ConexiuneServerJoc conexiune=new ConexiuneServerJoc();
		conexiune.conectare();
		
		Player player=new Player();
		player.login(conexiune);
		ProfilPlayer profil=player.getProfil();
		String dateProfil=profil.getProfil();
		return dateProfil;
	}


}
