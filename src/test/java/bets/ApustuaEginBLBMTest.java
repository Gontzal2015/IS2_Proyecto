package bets;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import businessLogic.BLFacade;
import businessLogic.BLFacadeImplementation;

import dataAccess.DataAccess;
import domain.Quote;
import domain.Registered;

@RunWith(MockitoJUnitRunner.class)
public class ApustuaEginBLBMTest {
     DataAccess dataAccess=Mockito.mock(DataAccess.class);
	@InjectMocks
	 BLFacade sut=new BLFacadeImplementation(dataAccess);
	
	@Test
	public void test5() {
		try {
			Registered u = new Registered("Jon", "Iturrioz", 45162953);
			Vector<Quote> quotes = new Vector<Quote>();
			double balioa = 20.;
			int abg = 0;
			boolean b = sut.ApustuaEgin(u, quotes, balioa, abg);
		} catch (Exception e) {

		}
	}
	
}