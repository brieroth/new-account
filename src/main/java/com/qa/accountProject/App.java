package com.qa.accountProject;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.account.application.Account;
import com.qa.account.application.Service;


public class App 
{
		Service service;
	
	public App() {
		service = new Service();
		service.addAccount("11", new Account("Kev","Gates","32445"));
		service.addAccount("22", new Account("Aiden","Haynes","45678"));
		ObjectMapper mapperObj = new ObjectMapper();
	    try {					
				String jsonStr = mapperObj.writerWithDefaultPrettyPrinter().writeValueAsString(service);
		        System.out.println(jsonStr);
		        } catch (IOException e) {
		        e.printStackTrace();
		        }
		    }
	
	public void accountByKey(String key) {
		Account account = service.getAccountByKey("22");
		ObjectMapper mapperObj = new ObjectMapper();
	    try {					
				String jsonStr = mapperObj.writerWithDefaultPrettyPrinter().writeValueAsString(account);
		        System.out.println(jsonStr);
		        } catch (IOException e) {
		        e.printStackTrace();
		        }
		    }
	
	
	public static void main( String[] args )
    {
    //	new App();
    	new App().accountByKey("22");
   	    
    }
}
