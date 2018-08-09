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

<<<<<<< HEAD
=======
	
>>>>>>> bcaec3edf9d862d9d5756f1e968e7371c95cea18
	public int firstNameCount(String nameCount) {
		return (int) accounts.values().stream().filter(Account -> Account.getFirstName().equals(nameCount)).count();

	}

}

