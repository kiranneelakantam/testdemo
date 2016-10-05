package com.kiran.util;


import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBankAccount {
	
	
	@Test
	 public void testTestDebit(){
		  
		  BankAccount baccount =  new BankAccount(10);
		  
		  double amount = baccount.debit(5);
		  
		  Assert.assertEqulas(5.0,amount);
	  }
	  
	  @Test
	 public void testTestDebits(){
		  
		  BankAccount baccount =  new BankAccount(10);
		  
		  double amount = baccount.debit(5);
		  
		  Assert.assertEqulas(5.0,amount);
	  }

}