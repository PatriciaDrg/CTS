package ro.ase.csie.cts.g1088.dp.memento;

import java.util.concurrent.ForkJoinPool.ManagedBlocker;

public class TestMemento {
	public static void main(String[]args) {
		MementoIstoric istoric=new MementoIstoric();
		
		SuperErou superman=new SuperErou("superman", 100, "zboara");
		superman.esteRANIT(50);
		superman.esteRANIT(20);
		System.out.println("puncte viata"+superman.puncteViata);
		superman.incarcaSalvare(istoric.getUltimaSalvare);
		System.out.println("puncte viata"+superman.puncteViata);
	}

}
