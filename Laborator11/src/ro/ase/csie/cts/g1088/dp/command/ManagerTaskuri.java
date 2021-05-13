package ro.ase.csie.cts.g1088.dp.command;

import java.util.ArrayList;
import java.util.List;

public class ManagerTaskuri {
	
	List<InterfataTaskAscincron> taskuri =new ArrayList<>();
	public void adaugaTask(InterfataTaskAscincron task) {
		taskuri.add(task);
	}
	public void executaUrmatorulTask() {
	if(taskuri.size()>0) {
		InterfataTaskAscincron task=taskuri.get(0);
		task.startTask();
		
	}
	}
}
