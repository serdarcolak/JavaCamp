

import Abstract.BaseCustomerManager;
import Concrete.AkahveCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new AkahveCustomerManager();
		customerManager.save(new Customer(1,"serdar","colak","1999.02.25","123456789"));
		
	}

}
