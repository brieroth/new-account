package com.qa.accountProject;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

import com.qa.account.application.Account;
import com.qa.account.application.Service;

import org.junit.Assert;


public class AppTest 
{
	private Service service;
	
	@Before
	


	@Test
	  public void testService()
    {
	service = new Service();
	service.addAccount("1", new Account("Iris","Gates","3235665"));
	assertEquals(1,service.getAccounts().size());

	
	
    	
    }
      }
