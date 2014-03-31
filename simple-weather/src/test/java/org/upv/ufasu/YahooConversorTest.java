package org.upv.ufasu;

import junit.framework.TestCase;

import org.upv.ufasu.weather.TemperatureConversor;

public class YahooConversorTest extends TestCase {
	public YahooConversorTest(String name){
		super(name);
	}
	
public void testParser() throws Exception {
  assertEquals("10",(new TemperatureConversor()).FtoC("50"));
}

}

