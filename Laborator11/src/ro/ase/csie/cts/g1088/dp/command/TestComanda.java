package ro.ase.csie.cts.g1088.dp.command;

public class TestComanda {
	public static void main(String[]args) {
		ManagerTaskuri manager=new ManagerTaskuri();
		
		manager.adaugaTask(new TaskAsincron(new ModulUpdate(), "versiune 10.1", 5));
		System.out.println("Jocul continua..");
		manager.executaUrmatorulTask();
		System.out.println("jocul continua...");
		manager.executaUrmatorulTask();
	}

}
