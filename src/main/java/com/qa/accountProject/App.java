package com.qa.accountProject;

import com.qa.account.application.Account;
import com.qa.account.application.Service;

public class App 
{
		Service service;
	
	public App() {
		service = new Service();
		service.addAccount("11", new Account("Kev","Gates","32445"));
		service.addAccount("22", new Account("Aiden","Haynes","45678"));
	}
	
	public void accountByKey(String key) {
		Account account = service.getAccountByKey("11");
		System.out.println("First Name: "+account.getFirstName());
		System.out.println("Last Name: "+account.getLastName());
		System.out.println("Account Number: "+account.getAccountNumber());
		
	}
	
	public void run() {
		this.accountByKey("11");
	}
	
    public static void main( String[] args )
    {
        
        new App().run();
        
    }
}
