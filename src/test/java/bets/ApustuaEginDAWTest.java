package bets;
import static org.junit.Assert.*;
import java.util.Vector;
import org.junit.Test;
import dataAccess.DataAccess;
import domain.Quote;
import domain.Registered;
import test.dataAccess.TestDataAccess;

public class ApustuaEginDAWTest {
	static DataAccess sut = new DataAccess();
	static TestDataAccess testDA = new TestDataAccess();
	
	@Test
	public void test1() {
		try {
			// Preparar usuario
			Registered u = new Registered("Jon", "Iturrioz", 45162953);
			u.setDirukop(0.);
			if(testDA.existRegistered(u)) testDA.removeRegistered(u);
			testDA.addRegistered("Jon", "Iturrioz", 45162953, 0.);
			
			// Preparar evento de la quote
			// Preparar quote
			Vector<Quote> quotes = new Vector<Quote>();
			Quote quote = new Quote(20., "Forecast");
			quote.setQuoteNumber(5);
			if(testDA.existQuote(quote)) testDA.removeQuote(quote);
			testDA.addQuote(quote);
			quotes.add(quote);
			double balioa = 20.;
			int abg = 0;
			
			// Ejecutar
			boolean b = sut.ApustuaEgin(u, quotes, balioa, abg);
			assertTrue(!b);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
}