package ro.ase.csie.cts.g1088.dp.facade;

public class TestFacade {

	public static void main(String[] args) {
		ConexiuneServerJoc conexiune = new ConexiuneServerJoc();
		conexiune.conectare();

		Player player= new Player();
		player.login(conexiune);
		
		ProfilPlayer profil = player.getProfil();
		String dateProfil=profil.getProfil();
		
		String dateProfil2= APIJocFacade.getProfil("player1","1234");
		
	}

}