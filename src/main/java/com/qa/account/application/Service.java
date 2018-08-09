package com.qa.account.application;
import java.io.IOException;
import  java.util.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class Service {
		private HashMap<String, Account> accounts;
	
	public Service() {
		accounts = new HashMap<String, Account>();
	}

	public void addAccount(String key, Account account) {
		this.accounts.put(key, account);
	}
	
	public Account getAccountByKey(String key) {
		return this.accounts.get(key);
	}
	
	public HashMap<String, Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(HashMap<String, Account> accounts) {
		this.accounts = accounts;
	}

//	public Object getFirstNameCount(String firstN) {
//		int counter = 0 ;
//		for(Account value : accounts.values()) {
//				if(value.getFirstName().equals(firstN)) {
//					counter++;
//				}
//			}
//			System.out.println(counter);
//			return counter;
//	}
//	
	public int firstNameCount(String nameCount) {
		return (int) accounts.values().stream().filter(Account -> Account.getFirstName().equals(nameCount)).count();

	}

}

