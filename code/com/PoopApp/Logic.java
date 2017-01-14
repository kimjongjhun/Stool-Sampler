package com.PoopApp;

import java.time.*;
import java.util.Date;



public class Logic {
	
	public Variables v = new Variables();
	
	public void makeNewPoop(LocalTime t, Date d, String location, String note) {
		v.Add(new Poop(t, d, location, note));
	}
	
	public void RemovePoop(int i) {
		v.Remove(i);
	}
	
	
	
}
