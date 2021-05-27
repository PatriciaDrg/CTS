package ro.ase.csie.cts.testare.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.testare.modele.Student;

public class TestStudent {

@BeforeClass
public static void setUpBeforeClass()  throws Exception{
		
	}
@AfterClass
public static void tearDownAfterClass() throws Exception{
	
}
@Before
public void setUp() throws Exception {
	
}
@After
public void tearDown() throws Exception{

}
@Test
@Ignore
public void test() {
	fail("Not yet implemented");
}

private void fail(String string) {
	// TODO Auto-generated method stub
	
}
@Test
public void testSetVarstaConformanceRight() {
	ArrayList<Integer>note=new ArrayList<>();
	note.add(9);
	note.add(10);
	Student student = new Student("Gigel",21,note);
	int varstaNoua=23;
	student.setVarsta(varstaNoua);
	assertEquals("test cu valori corecte",varstaNoua,student.getVarsta());
			
}
@Test
public void testSetNumeRight() {
	
}

}
