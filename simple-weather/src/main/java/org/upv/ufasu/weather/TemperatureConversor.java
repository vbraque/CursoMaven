package org.upv.ufasu.weather;

public class TemperatureConversor {

	
  public String FtoC (String text ) {
	  int far = Integer.parseInt(text);
	  int cel = (int) ((far-32)/1.8);
	  String res = String.valueOf(cel);
	  return res;
	  }
}
