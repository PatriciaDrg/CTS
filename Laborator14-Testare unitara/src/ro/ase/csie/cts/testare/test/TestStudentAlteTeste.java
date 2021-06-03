package ro.ase.csie.cts.testare.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import ro.ase.csie.cts.testare.exceptii.ExceptieVarsta;
import ro.ase.csie.cts.testare.modele.Student;

class TestStudentAlteTeste {
	
	static Student student;
	static ArrayList<Integer>noteInitiale;
	static String numeInitial;
	static int varstaInitiala;
	static int nrNoteInitiale;
	
	for(int i=0; i<nrNoteInitiale; i++) {
		noteInitiale.add(Student.MAX_NOTA-i);
		}
	}
	public void setUp() throws Exception{
		student = new Student(numeInitial, varstaInitiala, noteInitiale);
	}
	public void tearDown() throws Exception{
		student=null;
	}
	
	@Test
	public void testSetVarstaRangeValoriNegative() throws ExceptieVarsta {
		int varstaNoua= Integer.MIN_VALUE;
		student.setVarsta(varstaNoua);
		
	}
	@Test
	public void testSetVarstaRangeValoarePozitiva() throws ExceptieVarsta {
		int varstaNoua=200;
		student.setVarsta(varstaNoua);
	}
	@Test
	public void testSetVarstaBounderyLimitaInferioara() throws ExceptieVarsta{
		int varstaNoua=Student.MIN_NOTA;
		student.setVarsta(varstaNoua);
		int varstaStudent=student.getVarsta();
		assertEquals("test pentru varsta maxima",varstaNoua,varstaStudent);
	}
	
	@Test
	public void testeSetNoteReferenceShallowCopy() {
		int[]noteStudent=new int[] {9,9,10};
		ArrayList<Integer>refNote=new ArrayList<>(Arrays.asList(9,9,10));
		student.setNote(refNote);
		refNote.set(0,5);
		int noteExistente[]=new int[student.getNrNote()];
		for(int i=0;i<student.getNrNote();i++) {
			noteExistente[i]=student.getNota(i);
		}
		assertArrayEquals("test shallow pe setNote",noteStudent,noteExistente);
}
