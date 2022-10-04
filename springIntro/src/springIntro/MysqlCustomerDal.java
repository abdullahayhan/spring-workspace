package springIntro;

import org.springframework.stereotype.Component;

@Component("database")
public class MysqlCustomerDal implements ICustomerDal{
 
	private String connectionString;

	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	
	public void add() {
		System.out.println("Connection String : "+connectionString);
		System.out.println("Mysql Veritabanýna Eklendi.");
	}
}
