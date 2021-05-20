package ro.ase.csie.cts.g1088.dp.observer;

import java.util.ArrayList;
import java.util.List;

public class ModulStareConexiuneServer {
	List<IterfataStatusConexiuneServer>module=new ArrayList<>();
	public void register(IterfataStatusConexiuneServer modul) {
		this.module.add(modul);
	}
	
		public void unregister(IterfataStatusConexiuneServer modul) {
			this.module.add(modul);
		}

}
