package ro.ase.csie.cts.g1088.dp.adapter;

import java.util.ArrayList;

import ro.ase.csie.cts.g1088.dp.factory.method.CaracterDisnay;
import ro.ase.csie.cts.g1088.dp.factory.method.CaracterJoc;

public class TestAdapter {
 public static void main(String[]args) {
	 ArrayList<CaracterJoc>caractere = new ArrayList<>();
	 caractere.add(new CaracterDisnay("donald"));
	 
	 ArrayList<InterfataCaracterEA>caractereEA = new ArrayList<>();
	 caractereEA.add(new CaracterGenericEA());
	 
	 InterfataCaracterEA caracterEA= new CaracterGenericEA();
	 AdapterEA2CaracterJoc adapt= new AdapterEA2CaracterJoc(caracterEA);
	 caractere.add(adapt);
	 
 }
 
}
