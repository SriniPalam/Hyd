package Srini.Tour.Goa;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
	
	public void drive()
	{
		System.out.println("I am going to Goa by bike");
	}


}
