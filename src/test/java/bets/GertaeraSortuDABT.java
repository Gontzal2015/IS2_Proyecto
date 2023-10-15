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
	Date fecha= new Date(103,8,10);
	
	@Test
	public void test1() { 
		//intentar añadir un evento con un deporte que no esta registrado
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
		//intentar aadir un evento existente
		try {
			boolean b;
			b=sut.gertaerakSortu("Atletico-Athletic", new Date(123, 9,17), "futbol");
			assertFalse(b);
		}
		catch(Exception e){
			e.printStackTrace();
			fail();
		}
		}
		
		@Test
		public void test2() { 
			//añadir un nuevo evento
			try {
				boolean b;
				b=sut.gertaerakSortu("Madrid-Barcelona", new Date(150, 9,12), "futbol");
				assertTrue(b);
			}
			catch(Exception e){
				e.printStackTrace();
				fail();
			}
		}
}
