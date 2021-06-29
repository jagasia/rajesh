package com.spring.service;

import com.spring.bo.BookRoomBO;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

//use appropriate annotation to make this class as component class
@Component
public class BookRoomService {
	
	private BookRoomBO bookRoomBOObj;

	//fill the code
	@Autowired
	public BookRoomService(BookRoomBO bookRoomBOObj) {
		super();
		this.bookRoomBOObj = bookRoomBOObj;
	}

	
	public BookRoomBO getBookRoomBOObj() {
		return bookRoomBOObj;
	}


	public void setBookRoomBOObj(BookRoomBO bookRoomBOObj) {
		this.bookRoomBOObj = bookRoomBOObj;
	}


	public double calculateRoomRent(String bookingId,String bookingDate,int customerId,String customerName,String emailId,String roomType,int noOfDays)
	{

		double totalRoomRent=0;
	
		// fill the code
	
		return totalRoomRent;
	}

}
