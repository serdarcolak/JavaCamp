package Main;

import java.rmi.RemoteException;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.CustomerManager;
import Concrete.ProductManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Gamer;
import Entities.Product;


public class Main {

	public static void main(String[] args) throws RemoteException {
		CustomerManager customerManager = new CustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer(1,"SERDAR", "ÇOLAK", 1999, "12345678");
		customerManager.add(customer);
		customerManager.delete(customer);
		customerManager.update(customer);
		
		
		ProductManager productManager = new ProductManager();
		productManager.sell(new Product(1, "witcher", 10), new Gamer(1, "serdarcolak"), new Campaign("Bahar"));
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(new Campaign("Bahar"));
	}

}
