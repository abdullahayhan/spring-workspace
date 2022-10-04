package springIntro;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {	
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext("applicationContext.xml");
		ICustomerService customerService = context.getBean("service",ICustomerService.class);
		customerService.add();	
		context.close();
	}
		
	//  IoC - Inversion Of Control newledigimiz kýsmý spring ile yapabiliriz bize nesne olusturur.
	//  Dependecy Injection denir 
	
	
}
