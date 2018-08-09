package com.qa.accountProject;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

import com.qa.account.application.Account;
import com.qa.account.application.Service;

import org.junit.Assert;

public class TDD {
	Service service;

	@Test
	public void testFirstName() {
		 	
		 service = new Service();
		 service.addAccount("11", new Account("Kev","Gates","32445"));
		 service.addAccount("15", new Account("Kev","Olsen","54475"));
		 service.addAccount("14", new Account("Kev","Forrest","458568"));
		 service.firstNameCount("Kev");
		 assertEquals(3, service.firstNameCount("Kev"));
		 	}

}
