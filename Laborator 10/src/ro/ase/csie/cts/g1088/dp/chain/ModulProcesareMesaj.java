package ro.ase.csie.cts.g1088.dp.chain;

public abstract class ModulProcesareMesaj {
	
	public ModulProcesareMesaj next=null;
	public  abstract void procesareMesaj(MesajChat mesaj);

}
