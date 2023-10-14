package bets;
import static org.junit.Assert.*;
import java.util.Vector;
import org.junit.Test;
import dataAccess.DataAccess;
import domain.Registered;
import domain.Quote;

public class ApustuaEginDABTest {
	static DataAccess sut = new DataAccess();

	@Test
	public void test1() {
		try {
			Vector<Quote> quotes = new Vector<Quote>();
			Quote quote = new Quote(20., "Forecast");
			quotes.add(quote);
			double balioa = 20.;
			int abg = 0;
			sut.ApustuaEgin(null, quotes, balioa, abg);
			fail();
		} catch (Exception e) {
		}
	}
	
	@Test
	public void test2() {
		try {
			Registered u = new Registered("Jon", "Iturrioz", 45162953);
			double balioa = 20.;
			int abg = 0;
			sut.ApustuaEgin(u, null, balioa, abg);
			fail();
		} catch (Exception e) {
		}
	}
	
	@Test
	public void test3() {
		try {
			Registered u = new Registered("Jon", "Iturrioz", 45162953);
			Vector<Quote> quotes = new Vector<Quote>();
			Quote quote = new Quote(20., "Forecast");
			quotes.add(quote);
			int abg = 0;
			sut.ApustuaEgin(u, quotes, null, abg);
			fail();
		} catch (Exception e) {
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
			sut.ApustuaEgin(u, quotes, balioa, null);
			fail();
		} catch (Exception e) {
		}
	}
	
	@Test
	public void test5() {
		try {
			Registered u = new Registered("Jon", "Iturrioz", 45162953);
			Vector<Quote> quotes = new Vector<Quote>();
			double balioa = 20.;
			int abg = 0;
			boolean b = sut.ApustuaEgin(u, quotes, balioa, abg);
			assertTrue(b);
		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public void test6a() {
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
	public void test6b() {
		try {
			Registered u = new Registered("Jon", "Iturrioz", 45162953);
			Vector<Quote> quotes = new Vector<Quote>();
			Quote quote = new Quote(20., "Forecast");
			quotes.add(quote);
			double balioa = -20.;
			int abg = 0;
			boolean b = sut.ApustuaEgin(u, quotes, balioa, abg);
			assertTrue(b);
		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public void test6c() {
		try {
			Registered u = new Registered("Jon", "Iturrioz", 45162953);
			Vector<Quote> quotes = new Vector<Quote>();
			Quote quote = new Quote(20., "Forecast");
			quotes.add(quote);
			double balioa = 0.;
			int abg = 0;
			boolean b = sut.ApustuaEgin(u, quotes, balioa, abg);
			assertTrue(b);
		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public void test6d() {
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
	public void test6e() {
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