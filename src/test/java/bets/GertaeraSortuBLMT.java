package bets;

import org.junit.*;
import static org.junit.Assert.*;
import java.sql.Date;
import java.util.Vector;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;

import businessLogic.BLFacade;
import businessLogic.BLFacadeImplementation;
import dataAccess.DataAccess;
import domain.Registered;
import domain.Sport;
import exceptions.EventFinished;
import test.dataAccess.TestDataAccess;
import domain.Event;
import domain.Question;
import domain.Quote;
import dataAccess.DataAccess;

public class GertaeraSortuBLMT {
    DataAccess dataAccess=Mockito.mock(DataAccess.class);
	@InjectMocks
	 BLFacade sut=new BLFacadeImplementation(dataAccess);
	
	@Test
	public void test1() {
		//añadir evento con deporte no registrado
		
		String sport= "league of legends";
		String description = "G2-Fnatic";
		Date date = new Date(100,3,2);
		
		Mockito.doReturn(false).when(dataAccess).gertaerakSortu(description,date, sport);
		try {
			assertEquals(false, sut.gertaerakSortu(description, date, sport));
		}
		catch(EventFinished e) {
			fail();
		}
	}
	
	@Test
	public void test2() {
		String sport = "Futbol";
	   	String description = "Madrid-Barcelona";
	   	Date date = new Date(150,9,12);
	   	Mockito.doReturn(false).when(dataAccess).gertaerakSortu(description, date, sport);
	    boolean expected = false;
	  	boolean actual;
	   	try {
	   	 actual = sut.gertaerakSortu(description, date, sport);
	   	 assertEquals(expected,actual);
	   	} catch (EventFinished e) {
	   		 fail();
	   	}
	}
	
	@Test
    public void test4() {
   	 // Todo bien, insertamos evento que no esta en db y con deporte existente
   	 
   	 String sport = "Futbol";
   	 String description = "Madrid-Barcelona";
   	 Date date = new Date(150,9,12);
   	 Mockito.doReturn(true).when(dataAccess).gertaerakSortu(description, date, sport);
   	 boolean expected = true;
   	 boolean actual;
   	 try {
   		 actual = sut.gertaerakSortu(description, date, sport);
   		 assertEquals(expected,actual);

   	 } catch (EventFinished e) {
   		 fail();
   	 }

   	 }


	
}
