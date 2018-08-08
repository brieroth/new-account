package com.qa.account.application;
import  java.util.*;

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
 
}

