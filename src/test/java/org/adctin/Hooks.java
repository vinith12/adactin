package org.adctin;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass{
	
	@Before
	public void before() {
		System.out.println("Vandhutaanda");
		browserlaunch();
		waitt();
 		maximize();
 		urllaunch("https://www.facebook.com/");

	}
	@After
	public void aftetr() {
     quitt();
     System.out.println("podaaa");
	}

}
