package ro.ase.csie.cts.g1088.dp.strategy;

public class Jucator {
     int totalOreJucate;
     String nume;
     static int clasaJucator;
     
     InterfataStrategieMarketing strategieMk= null;
     
     public void acordaPuncteBonus() {
    	 if(this.strategieMk != null) {
    		 this.strategieMk.aplicaStrategieBonus(this);
    	 }else {
    		 throw new UnsupportedOperationException();
    	 }
    	 
     }

	public int getTotalOreJucate() {
		return totalOreJucate;
	}

	public void setTotalOreJucate(int totalOreJucate) {
		this.totalOreJucate = totalOreJucate;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getClasaJucator() {
		return clasaJucator;
	}

	public void setClasaJucator(int clasaJucator) {
		this.clasaJucator = clasaJucator;
	}

	public InterfataStrategieMarketing getStrategieMk() {
		return strategieMk;
	}

	public void setStrategieMk(InterfataStrategieMarketing strategieMk) {
		this.strategieMk = strategieMk;
	}

	public Jucator(int totalOreJucate, String nume, int i) {
		super();
		this.totalOreJucate = totalOreJucate;
		this.nume = nume;
		this.strategieMk = i;
	}
	
 
}
