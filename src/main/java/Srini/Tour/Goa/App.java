package Srini.Tour.Goa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	
public static void main( String[] args )
    
{
	//=================
  // Car obj =new Car();
   //obj.drive();
  // ====================
   //Bike obj =new Bike();
   //obj.drive();
	//=============================
	//Vehicle obj =new Car();
	  //obj.drive();
	//==================================
	//ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
	//Vehicle obj = (Vehicle) context.getBean("vehicle");
	//obj.drive();
	//============================
	//ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
	//Vehicle obj = (Vehicle) context.getBean("vehicle");
	//obj.drive();
	
	//==============
	ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
	Tyre t = (Tyre) context.getBean("tyre");
	
			System.out.println(t);
	
}
}