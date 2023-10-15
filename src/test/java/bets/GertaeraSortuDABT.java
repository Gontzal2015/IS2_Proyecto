package bets;

import org.junit.*;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.Vector;
import org.junit.Test;
import dataAccess.DataAccess;
import domain.Registered;
import domain.Sport;
import test.dataAccess.TestDataAccess;
import domain.Event;
import domain.Question;
import domain.Quote;
import dataAccess.DataAccess;

public class GertaeraSortuDABT {

	static DataAccess sut= new DataAccess();
	static TestDataAccess testDA= new TestDataAccess();
	Date fecha= new Date(103,8,10);
	
	@Test
	public void test1() { 
		try {
			boolean b;
			b=sut.gertaerakSortu("Atletico-Getafe", fecha, "balonpie");
			assertFalse(b);
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	public void test3() { 
		try {
			boolean b;
			b=sut.gertaerakSortu("Atletico-Athletic", fecha, "futbol");
			assertFalse(b);
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
		}
		
		@Test
		public void test2() { 
			try {
				boolean b;
				b=sut.gertaerakSortu("Atletico-Getafe", fecha, "futbol");
				assertTrue(b);
			}
			catch(Exception e){
				e.printStackTrace();
				fail();
			}
		}
}
