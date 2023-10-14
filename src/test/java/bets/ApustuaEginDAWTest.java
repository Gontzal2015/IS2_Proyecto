package bets;
import static org.junit.Assert.*;
import java.util.Vector;
import org.junit.Test;
import dataAccess.DataAccess;
import domain.Quote;
import domain.Registered;

public class ApustuaEginDAWTest {
	static DataAccess sut = new DataAccess();
	
	@Test
	public void test1() {
		try {
			Registered u = new Registered("Jon", "Iturrioz", 45162953);
			Vector<Quote> quotes = new Vector<Quote>();
			Quote quote = new Quote(20., "Forecast");
			quotes.add(quote);
			double balioa = 20.;
			int abg = 0;
			boolean b = sut.ApustuaEgin(u, quotes, balioa, abg);
			assertTrue(b);
		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public void test2() {
		try {
			Registered u = new Registered("Jon", "Iturrioz", 45162953);
			Vector<Quote> quotes = new Vector<Quote>();
			Quote quote = new Quote(20., "Forecast");
			quotes.add(quote);
			double balioa = 20.;
			int abg = 0;
			boolean b = sut.ApustuaEgin(u, quotes, balioa, abg);
			assertTrue(b);
		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public void test3() {
		try {
			Registered u = new Registered("Jon", "Iturrioz", 45162953);
			Vector<Quote> quotes = new Vector<Quote>();
			Quote quote = new Quote(20., "Forecast");
			quotes.add(quote);
			double balioa = 20.;
			int abg = 0;
			boolean b = sut.ApustuaEgin(u, quotes, balioa, abg);
			assertTrue(b);
		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public void test4() {
		try {
			Registered u = new Registered("Jon", "Iturrioz", 45162953);
			Vector<Quote> quotes = new Vector<Quote>();
			Quote quote = new Quote(20., "Forecast");
			quotes.add(quote);
			double balioa = 20.;
			int abg = 0;
			boolean b = sut.ApustuaEgin(u, quotes, balioa, abg);
			assertTrue(b);
		} catch (Exception e) {
			fail();
		}
	}
}