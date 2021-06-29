package com.spring.model;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
//pojo class with required attributes,getters and setters 
//use appropriate annotation to make this class as component class
@Component
public class BookRoom {

	private String bookingId;
	private String bookingDate; 	
	private Customer customer;
	private String roomType;
	private int noOfDays;
	
	
	//	fill the code
	@Autowired
	public BookRoom(Customer customer) {
		this.customer=customer;
	}
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	
		
}

