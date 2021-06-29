package com.spring.exception;
import org.springframework.stereotype.Component;

@Component
public class InvalidRoomTypeException extends Exception {

	public InvalidRoomTypeException() {}
	public InvalidRoomTypeException(String msg) {

		// fill the code
		super(msg);
	}

}
