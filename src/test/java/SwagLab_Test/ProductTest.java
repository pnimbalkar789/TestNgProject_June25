package SwagLab_Test;

import org.testng.annotations.Test;

import Swaglab_pages.LoginPage;
import Swaglab_pages.ProductsPage;

public class ProductTest extends BaseClass {
	
	
	@Test
	public void AddtoCartTest() {
		
		LoginPage lp = new LoginPage();
	    lp.LoginFunction("standard_user", "secret_sauce");
		
		ProductsPage pp =new ProductsPage();
		pp.AddToCart("Sauce Labs Bolt T-Shirt");
		
		
		

	
	}
}
