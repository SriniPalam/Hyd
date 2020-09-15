package Srini.Tour.Goa;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	
	public void drive()
	{
		System.out.println("I am going to Goa by car");
	}

}
