package ro.ase.csie.cts.g1088.dp.command;

public class TaskAsincron implements InterfataTaskAscincron {
	private InterfataModulJoc modul=null;
	private String detalii;
	int prioritate;
	
	
	

	public TaskAsincron(InterfataModulJoc modul, String detalii, int prioritate) {
		super();
		this.modul = modul;
		this.detalii = detalii;
		this.prioritate = prioritate;
	}




	public TaskAsincron(ModulUpdate modul2, String detalii2, int prioritate2) {
		// TODO Auto-generated constructor stub
	}




	@Override
	public void startTask() {
		// TODO Auto-generated method stub
		this.modul.executaTask(detalii);
		
	}

}
