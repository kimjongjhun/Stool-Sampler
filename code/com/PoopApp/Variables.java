package com.PoopApp;

import java.time.*;
import java.util.ArrayList;
import java.util.Date;

public class Variables {

	public ArrayList<Poop> listOfPoops = new ArrayList<Poop>();
	public Date dateOfPoop;
	public LocalTime timeOfPoop;

	public void Add(Poop p) {
		listOfPoops.add(p);
	}

	public void Remove(int i) {
		listOfPoops.remove(listOfPoops.get(i-1));
	}
}