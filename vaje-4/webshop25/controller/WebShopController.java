package si.unm.fis.prspr.webshop.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import si.unm.fis.prspr.webshop.model.Product;
import si.unm.fis.prspr.webshop.model.User;

@RestController
@RequestMapping("/webshop")
public class WebShopController {
	
	ArrayList<User> userList = new ArrayList<>();
	ArrayList<Product> productList = new ArrayList<>();
	
	public WebShopController() {
		super();
		userList.add(new User("pera","kojot"));
		userList.add(new User("janez","Novak2E"));
		userList.add(new User("marjana","MBer!K"));
		productList.add(new Product(1,"Logitech mouse", 49.99,"blah LT"));
		productList.add(new Product(2,"HP laptop", 1123.50,"blah HP"));
		productList.add(new Product(3,"Samsung S23 ultra", 1399.99,"blah S"));
	}

	@GetMapping("/login")
	public String authenticateUser(@RequestParam String username,
								   @RequestParam String password) {
		for(User u: userList) {
			if(u.getUsername().equals(username) && 
					u.getPassword().equals(password)) {
				return "Uporabnik je uspešno prijavljen!";
			}
		}
		return "Uporabnik ni uspešno prijavljen!";
	}

	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return productList;
	}

	@GetMapping("/getProducts")
	public List<Product> getAllProducts(@RequestParam String startsWith){
		ArrayList<Product> result = new ArrayList<>();
		for(Product p: productList) {
			if(p.getProductName().startsWith(startsWith)) {
				result.add(p);
			}
		}
		return result;
	}

	@GetMapping("/addProduct")
	public void addProduct(@RequestParam String username,
						@RequestParam String password,
						@RequestParam int productId,
						@RequestParam String productName,
						@RequestParam double productPrice,
						@RequestParam String productDesc) {
		boolean foundUser = false;
		for(User u: userList) {
			if(u.getUsername().equals(username) &&
			   u.getPassword().equals(password)) {
				foundUser = true;
				break;
			}

		}
		if(foundUser) {
			int max = 1;
			for(Product p: productList) {
				if(p.getProductId() > max){
					max = p.getProductId();
				}
			}
			productList.add(new Product(productId, productName, productPrice, productDesc));
		}
	}
}
