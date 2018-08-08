package com.qa.account.application;

import java.io.FileWriter;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class JsonConversion {
	
	public static void main(String[] args) {
		
		
		ObjectMapper mapperObj = new ObjectMapper();
		Service service = new Service();
		service.addAccount("1", new Account("Iris","Gates","32445"));
		service.addAccount("2", new Account("Aiden","Haynes","45678"));
		
		try {
			
			String jsonStr = mapperObj.writerWithDefaultPrettyPrinter().writeValueAsString(service);
            System.out.println(jsonStr);
        } catch (IOException e) {
       
            e.printStackTrace();
        }


	}
}
