package local.webshop.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

import local.webshop.entity.*;

@RestController
public class WebShopController {
	ArrayList<User> userList = new ArrayList<User>();
	ArrayList<Product> productList = new ArrayList<Product>();
	public WebShopController() {
		super();
		userList.add(new User("pera","kojot"));
		userList.add(new User("janez","Novak2E"));
		userList.add(new User("marjana","MBer!K"));
		productList.add(new Product(1,"Logitech mouse", 49.99,"blah LT"));
		productList.add(new Product(2,"HP laptop", 1123.50,"blah HP"));
		productList.add(new Product(3,"Samsung S23 ultra", 1399.99,"blah S"));
	}
	@RequestMapping("/authUser/{username}/{password}")
	public String authenticateUser(@PathVariable String username,
			@PathVariable String password) {
		for(User u: userList) {
			if(u.getUsername().equals(username) && 
					u.getPassword().equals(password)) {
				return "Uporabnik je uspešno prijavljen!";
			}

		}
		return "Uporabnik ni uspešno prijavljen!";
	}
	@RequestMapping("/products")
	public List<Product> getAllProducts(){
		return productList;
	}
	@RequestMapping("/getProducts/{startsWith}")
	public List<Product> getAllProducts(@PathVariable String startsWith){
		ArrayList<Product> result = new ArrayList<Product>();
		for(Product p: productList) {
			if(p.getProductName().startsWith(startsWith)) {
				result.add(p);
			}
		}
		return result;
	}
	@RequestMapping("/order/{username}/{password}/{productId}")
	public String order(@PathVariable String username,
			@PathVariable String password,
			@PathVariable int productId) {
		boolean foundUser = false;
		for(User u: userList) {
			if(u.getUsername().equals(username) &&
			   u.getPassword().equals(password)) {
				foundUser = true;
				break;
			}

		}
		if(foundUser) {
			for(Product p: productList) {
				if(p.getProductId()==productId) {
					return "Uporabnik "+username+" je uspešno naročil "
							+p.getProductName()+".";
				}

			}
			return "Takega izdelka ni.";
		}else {
			return "Takega uporabnika ni.";
		}
	}
}
