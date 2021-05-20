
package ro.ase.csie.cts.g1088.dp.memento;

import java.util.ArrayList;
import java.util.List;

public class MementoIstoric {
List<MementoSuperErou> salvari=new ArrayList<>();
public void adaugaSalvare(MementoSuperErou memento) {
	this.salvari.add(memento);
}
public void getUIUltimaSalvare() {
	if(this.salvari.size()>0) {
		MementoSuperErou ultimaSalvare=this.salvari.get(index);
		this.salvari.remove(ultimaSalvare);
		
	}
}
}
