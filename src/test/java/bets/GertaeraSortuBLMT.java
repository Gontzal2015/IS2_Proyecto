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
import test.dataAccess.TestDataAccess;
import domain.Event;
import domain.Question;
import domain.Quote;
import dataAccess.DataAccess;

public class GertaeraSortuBLMT {
    DataAccess dataAccess=Mockito.mock(DataAccess.class);
	@InjectMocks
	 BLFacade sut=new BLFacadeImplementation(dataAccess);
	
	
}
