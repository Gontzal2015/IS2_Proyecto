package test.dataAccess;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import configuration.ConfigXML;
import domain.Event;
import domain.Question;
import domain.Quote;
import domain.Registered;
import domain.Team;

public class TestDataAccess {
	protected EntityManager db;
	protected EntityManagerFactory emf;

	ConfigXML c = ConfigXML.getInstance();

	public TestDataAccess() {
		System.out.println("Creating TestDataAccess instance");
		open();
	}

	public void open() {
		System.out.println("Opening TestDataAccess instance ");
		String fileName = c.getDbFilename();
		if (c.isDatabaseLocal()) {
			emf = Persistence.createEntityManagerFactory("objectdb:" + fileName);
			db = emf.createEntityManager();
		} else {
			Map<String, String> properties = new HashMap<String, String>();
			properties.put("javax.persistence.jdbc.user", c.getUser());
			properties.put("javax.persistence.jdbc.password", c.getPassword());
			emf = Persistence.createEntityManagerFactory(
					"objectdb://" + c.getDatabaseNode() + ":" + c.getDatabasePort() + "/" + fileName, properties);
			db = emf.createEntityManager();
		}
	}

	public void close() {
		db.close();
		System.out.println("DataBase closed");
	}

	public boolean removeEvent(Event ev) {
		System.out.println(">> DataAccessTest: removeEvent");
		Event e = db.find(Event.class, ev.getEventNumber());
		if (e != null) {
			db.getTransaction().begin();
			db.remove(e);
			db.getTransaction().commit();
			return true;
		} else
			return false;
	}

	public Event addEventWithQuestion(String desc, Date d, String question, float qty) {
		System.out.println(">> DataAccessTest: addEvent");
		Event ev = null;
		db.getTransaction().begin();
		try {
			ev = new Event(desc, d, new Team(), new Team());
			ev.addQuestion(question, qty);
			db.persist(ev);
			db.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ev;
	}

	public boolean existQuestion(Event ev, Question q) {
		System.out.println(">> DataAccessTest: existQuestion");
		Event e = db.find(Event.class, ev.getEventNumber());
		if (e != null) {
			return e.DoesQuestionExists(q.getQuestion());
		} else
			return false;
	}
	
	public boolean removeRegistered(Registered u) {
		System.out.println(">> DataAccessTest: removeRegistered");
		Registered us = db.find(Registered.class, u.getUsername());
		if (us != null) {
			db.getTransaction().begin();
			db.remove(us);
			db.getTransaction().commit();
			return true;
		} else
			return false;
	}
	
	public Registered addRegistered(String username, String password, Integer bankAccount, Double dirukop) {
		System.out.println(">> DataAccessTest: addRegistered");
		Registered u = null;
		db.getTransaction().begin();
		try {
			u = new Registered(username, password, bankAccount);
			u.setDirukop(dirukop);
			db.persist(u);
			db.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			db.getTransaction().rollback();
		}
		return u;
	}
	
	public boolean existRegistered(Registered u) {
		System.out.println(">> DataAccessTest: existRegistered");
		Registered us = db.find(Registered.class, u.getUsername());
		if (us != null) {
			return true;
		} else
			return false;
	}
	
	public boolean removeQuote(Quote q) {
		System.out.println(">> DataAccessTest: removeQuote");
		Quote qu = db.find(Quote.class, q.getQuoteNumber());
		if (qu != null) {
			db.getTransaction().begin();
			db.remove(qu);
			db.getTransaction().commit();
			return true;
		} else
			return false;
	}
	
	public Quote addQuote(Double balio, String forecast, Integer quoteNumber) {
		System.out.println(">> DataAccessTest: addQuote");
		Quote q = null;
		db.getTransaction().begin();
		try {
			q = new Quote(balio,forecast);
			q.setQuoteNumber(quoteNumber);
			db.persist(q);
			db.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			db.getTransaction().rollback();
		}
		return q;
	}
	
	public Quote addQuote(Quote q) {
		System.out.println(">> DataAccessTest: addQuote");
		db.getTransaction().begin();
		try {
			db.persist(q);
			db.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return q;
	}
	
	public boolean existQuote(Quote q) {
		System.out.println(">> DataAccessTest: existQuote");
		Quote qu = db.find(Quote.class, q.getQuoteNumber());
		if (qu != null) {
			return true;
		} else
			return false;
	}
	
	
}