package com.springrest.rest.dto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.springrest.rest.exceptionHandler.NoDataForGivenIDFoundException;

@ControllerAdvice
public class CustomExceptionHandler {
           //instead of directly throwing exception we create custom exception by ResponseEntity
	@ExceptionHandler(value = NoDataForGivenIDFoundException.class)
	public ResponseEntity<ResponseStructure<String>> noDataForGivenIDFoundExceptionHandler(NoDataForGivenIDFoundException e) {
           ResponseStructure<String> responseStructure = new ResponseStructure<String>();
	       responseStructure.setStatucCode(HttpStatus.NOT_FOUND.value());  
	       responseStructure.setMessage("No data found");
	       responseStructure.setData(e.getMessage());
	       responseStructure.setTimeStamp();
	       
	       return new ResponseEntity<ResponseStructure<String>>(responseStructure, HttpStatus.NOT_FOUND);
	}

}
