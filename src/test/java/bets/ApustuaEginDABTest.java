package bets;
import static org.junit.Assert.*;
import java.util.Vector;
import org.junit.Test;
import dataAccess.DataAccess;
import domain.Registered;
import domain.Sport;
import test.dataAccess.TestDataAccess;
import domain.Event;
import domain.Question;
import domain.Quote;

public class ApustuaEginDABTest {
	static DataAccess sut = new DataAccess();
	static TestDataAccess testDA = new TestDataAccess();
	
	@Test
	public void test6() {
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
	
	@Test
	public void test7a() {
		try {
			// Preparar usuario
			Registered u = new Registered("Jon", "Iturrioz", 45162953);
			if(testDA.existRegistered(u)) testDA.removeRegistered(u);
			testDA.addRegistered("Jon", "Iturrioz", 45162953, 40.);
			
			// Preparar quote
			Vector<Quote> quotes = new Vector<Quote>();
			Quote quote = new Quote(20., "Forecast");
			double balioa = 20.;
			int abg = 0;

			// Ejecutar
			boolean b = sut.ApustuaEgin(u, quotes, balioa, abg);
			assertTrue(b);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	public void test7b() {
		try {
			// Preparar usuario
			Registered u = new Registered("Jon", "Iturrioz", 45162953);
			if(testDA.existRegistered(u)) testDA.removeRegistered(u);
			testDA.addRegistered("Jon", "Iturrioz", 45162953, 40.);
			
			// Preparar quote
			Sport sp = new Sport("Galgos");
			Event ev = new Event();
			ev.setEventNumber(1);
			ev.setSport(sp);
			Question q = new Question();
			q.setQuestionNumber(1);
			q.setEvent(ev);
			Vector<Quote> quotes = new Vector<Quote>();
			Quote quote = new Quote(20., "Forecast");
			quote.setQuoteNumber(5);
			quote.setQuestion(q);
			if(testDA.existQuote(quote)) testDA.removeQuote(quote);
			testDA.addQuote(quote);
			quotes.add(quote);
			double balioa = 20.;
			int abg = 0;
			
			// Ejecutar
			boolean b = sut.ApustuaEgin(u, quotes, balioa, abg);
			assertTrue(b);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	public void test7c() {
		try {
			// Preparar usuario
			Registered u = new Registered("Jon", "Iturrioz", 45162953);
			if(testDA.existRegistered(u)) testDA.removeRegistered(u);
			testDA.addRegistered("Jon", "Iturrioz", 45162953, 40.);
			
			// Preparar evento de la quote
			// Preparar quote
			Sport sp = new Sport("Galgos");
			Event ev = new Event();
			ev.setEventNumber(1);
			ev.setSport(sp);
			Question q = new Question();
			q.setQuestionNumber(1);
			q.setEvent(ev);
			Vector<Quote> quotes = new Vector<Quote>();
			Quote quote = new Quote(20., "Forecast");
			quote.setQuoteNumber(5);
			quote.setQuestion(q);
			if(testDA.existQuote(quote)) testDA.removeQuote(quote);
			testDA.addQuote(quote);
			quotes.add(quote);
			double balioa = -20.;
			int abg = 0;
			
			// Ejecutar
			boolean b = sut.ApustuaEgin(u, quotes, balioa, abg);
			assertTrue(b);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	public void test7d() {
		try {
			// Preparar usuario
			Registered u = new Registered("Jon", "Iturrioz", 45162953);
			if(testDA.existRegistered(u)) testDA.removeRegistered(u);
			testDA.addRegistered("Jon", "Iturrioz", 45162953, 40.);
			
			// Preparar evento de la quote
			// Preparar quote
			Sport sp = new Sport("Galgos");
			Event ev = new Event();
			ev.setEventNumber(1);
			ev.setSport(sp);
			Question q = new Question();
			q.setQuestionNumber(1);
			q.setEvent(ev);
			Vector<Quote> quotes = new Vector<Quote>();
			Quote quote = new Quote(20., "Forecast");
			quote.setQuoteNumber(5);
			quote.setQuestion(q);
			if(testDA.existQuote(quote)) testDA.removeQuote(quote);
			testDA.addQuote(quote);
			quotes.add(quote);
			double balioa = 0.;
			int abg = 0;
			
			// Ejecutar
			boolean b = sut.ApustuaEgin(u, quotes, balioa, abg);
			assertTrue(b);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	public void test7e() {
		try {
			// Preparar usuario
			Registered u = new Registered("Jon", "Iturrioz", 45162953);
			if(testDA.existRegistered(u)) testDA.removeRegistered(u);
			testDA.addRegistered("Jon", "Iturrioz", 45162953, 40.);
			
			// Preparar evento de la quote
			// Preparar quote
			Sport sp = new Sport("Galgos");
			Event ev = new Event();
			ev.setEventNumber(1);
			ev.setSport(sp);
			Question q = new Question();
			q.setQuestionNumber(1);
			q.setEvent(ev);
			Vector<Quote> quotes = new Vector<Quote>();
			Quote quote = new Quote(20., "Forecast");
			quote.setQuoteNumber(5);
			quote.setQuestion(q);
			if(testDA.existQuote(quote)) testDA.removeQuote(quote);
			testDA.addQuote(quote);
			quotes.add(quote);
			double balioa = 20.;
			int abg = 0;
			
			// Ejecutar
			boolean b = sut.ApustuaEgin(u, quotes, balioa, abg);
			assertTrue(b);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
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
			if(testDA.existRegistered(u)) testDA.removeRegistered(u);
			boolean b = sut.ApustuaEgin(u, quotes, balioa, abg);
			assertFalse(b);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
}