package com.springrest.rest.dto;

import java.time.LocalDateTime;

public class ResponseStructure<T> {

	private Integer statucsCode;
	private String message;
	private T data;
	private LocalDateTime timeStamp;
	
	public Integer getStatusCode() {
		return statucsCode;
	}
	public void setStatucCode(Integer statucsCode) {
		this.statucsCode = statucsCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp() {
		this.timeStamp = LocalDateTime.now();
	}
	
}
