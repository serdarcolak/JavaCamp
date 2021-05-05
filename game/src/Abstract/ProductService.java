package Abstract;


import Entities.Campaign;
import Entities.Gamer;
import Entities.Product;

public interface ProductService {
	
	void sell(Product product, Gamer gamer, Campaign campaign);
	
}
