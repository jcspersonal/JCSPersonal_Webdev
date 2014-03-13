package com.jipslabs.EcommResources;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class APIImpls {
	private Map<Integer, CustomerData> customerDb = null;
	private AtomicInteger idCounter = null;
	
	public APIImpls(){
		customerDb = new ConcurrentHashMap<Integer, CustomerData>();
		idCounter = new AtomicInteger();
	}
	
	//This method returns the customer information based on an id
	
	public String getCustomer(int id){
		CustomerData cust = customerDb.get(id);
		if(cust == null){
			System.out.println("Customer not found.");
			return "Not Found.";			
		}
		else{
			return cust.getName();			
		}		
	}
}
