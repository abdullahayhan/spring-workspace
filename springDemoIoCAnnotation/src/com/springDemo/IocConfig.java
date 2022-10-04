package com.springDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration // konfigürasyon icin

@ComponentScan("com.springDemo") // aramasý icin

@PropertySource("classpath:values.properties") // kült degiskenleri tek bir dosyadan yonetmek icin
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
