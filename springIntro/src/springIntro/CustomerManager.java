package springIntro;

public class CustomerManager implements ICustomerService {
	

	private ICustomerDal iCustomerDal;
	
	 // constructor injection
	public CustomerManager(springIntro.ICustomerDal iCustomerDal) {
		this.iCustomerDal = iCustomerDal;
	}
	
	// setter injection i�in.
//	public void setCustomerDal(ICustomerDal customerDal) {
//		this.customerDal = customerDal;
//	}

	public void add() {
		iCustomerDal.add();
	}
}
