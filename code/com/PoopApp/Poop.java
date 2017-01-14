package com.PoopApp;

import java.sql.Time.*;
import java.time.*;
import java.util.Date;

public class Poop {
	private static int numberOfPoops;
	private LocalTime t;
	private Date d;
	private String location;
	private String note;

	public Poop() {
//		this.t =;
//		this.d =;
		this.location = "Unknown";
		this.note = "No note";
		numberOfPoops++;
	}
	
	public Poop(LocalTime t, Date d, String l, String n) {
		this.t = t;
		this.d = d;
		this.location = l;
		this.note = n;
		numberOfPoops++;
	}
	
}
