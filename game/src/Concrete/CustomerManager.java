package Concrete;

import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;

public class CustomerManager implements CustomerService {
	CustomerCheckService customerCheckService;

	public CustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void add(Customer customer) {
		if (customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Baþarýlý Kayýt = " + customer.getId() + " " + customer.getFirstName());
		} else {
			System.out.println("Baþarýsýz");
		}
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Silindi = " + customer.getId() + " " + customer.getFirstName());
	}

	@Override
	public void update(Customer customer) {
		System.out.println("güncellendi = " + customer.getId() + " " + customer.getFirstName());
	}
}
