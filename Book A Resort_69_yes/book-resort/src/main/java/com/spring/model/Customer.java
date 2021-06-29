package com.spring.model;
import org.springframework.stereotype.Component;
//pojo class with required attributes,getters and setters 
//use appropriate annotation to make this class as component class

@Component
public class Customer {
	
	private int customerId;
	private String customerName;
	private String emailId;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	};
 
	
}
