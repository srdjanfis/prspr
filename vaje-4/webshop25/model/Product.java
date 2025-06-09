package si.unm.fis.prspr.webshop.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Product {
	private int productId;
	private String productName;
	private double productPrice;
	private String productDesc;
}
