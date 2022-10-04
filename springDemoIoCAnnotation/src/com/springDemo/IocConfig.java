package com.springDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration // konfig�rasyon icin

@ComponentScan("com.springDemo") // aramas� icin

@PropertySource("classpath:values.properties") // k�lt degiskenleri tek bir dosyadan yonetmek icin
public class IocConfig {
	
	@Bean
	public ICustomerDal database() {
		return new MsSqlCustomerDal();
	}
	
	@Bean
	public ICustomerService service() {
		return new CustomerManager(database());
	}
	
	
		
}
