package Concrete;

import Abstract.ProductService;
import Entities.Campaign;
import Entities.Gamer;
import Entities.Product;

public class ProductManager implements ProductService {

	@Override
	public void sell(Product product, Gamer gamer, Campaign campaign) {
		System.out.println(product.getName() + " OYUNU SATILDI " + campaign.getName() + " Kampanyasý " + " Satýn Alan Oyuncu " + gamer.getUserName());
		
	}
	
}
