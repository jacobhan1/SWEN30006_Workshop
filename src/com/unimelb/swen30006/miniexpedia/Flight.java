package com.unimelb.swen30006.miniexpedia;

import java.time.LocalDateTime;

public class Flight {
	private String from;
	private String to;
	private LocalDateTime date;
	
	public Flight(String from, String to, LocalDateTime date) {
		this.from = from;
		this.to = to;
		this.date = date;
	}
	
	public String getFrom() {return from;}
	
	public String getTo() {return to;}
	
	public LocalDateTime getDate() {return date;}
}
