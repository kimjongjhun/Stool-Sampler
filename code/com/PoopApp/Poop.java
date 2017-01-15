package com.PoopApp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Poop {

	private static int numberOfPoops;

	private String time;
	DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
	private String date;
	DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/YYYY");

	private String location;
	private String note;
	private String color;
	private int stinkLevel;
	private int numOfWipes;
	private String type;

	public Poop(String location, String note, String color, int stinkLevel, int numOfWipes, int type) {
		this.time = timeFormat.format(LocalDateTime.now());
		this.date = dateFormat.format(LocalDateTime.now());
		this.location = location;
		this.note = note;
		this.color = color;
		this.stinkLevel = stinkLevel;
		this.numOfWipes = numOfWipes;
		switch (type) {
		case 1:
			this.type = "Hard Lumps";
			break;
		case 2:
			this.type = "Lumpy Sausage";
			break;
		case 3:
			this.type = "Cracked Sausage";
			break;
		case 4:
			this.type = "Smooth Snake";
			break;
		case 5:
			this.type = "Soft Blobs";
			break;
		case 6:
			this.type = "Mushy";
			break;
		case 7:
			this.type = "Liquid";
			break;
		}
		numberOfPoops++;
	}

}
