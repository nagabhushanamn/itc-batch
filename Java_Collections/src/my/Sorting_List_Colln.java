package my;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product implements Comparable<Product> {

	private int id;
	private String name;
	private double price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Product o) {
		if (this.id > o.id) {
			return 1;
		} else if (this.id < o.id) {
			return -1;
		} else {
			return 0;
		}
	}

}

public class Sorting_List_Colln {

	public static void main(String[] args) {

		Product product1 = new Product(45367, "Laptop", 198000);
		Product product2 = new Product(65434, "Mobile", 19000);
		Product product3 = new Product(12321, "Camera", 39000);
		Product product4 = new Product(56856, "Other", 1000);
		Product product5 = new Product(56856, "Other", 1000);

		List<Product> products = new ArrayList<>();
		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);
		products.add(product5);

		// display(products);

		// sort & display
		// Collections.sort(products);
		// display(products);
		//
		// sort by price
		// Collections.sort(products, new ProductsByName());
		// Collections.sort(products, new Comparator<Product>() {
		// @Override
		// public int compare(Product o1, Product o2) {
		// // TODO Auto-generated method stub
		// return o1.getName().compareTo(o2.getName());
		// }
		// });
		// display(products);

		Collections.sort(products, new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				// TODO Auto-generated method stub
				if(o1.getPrice()==o2.getPrice()){
					return 0;
				}else if(o1.getPrice()>o2.getPrice()){
					return 1;
				}else{
					return -1;
				}
			}
		});
		display(products);

	}

	// static class ProductsByName implements Comparator<Product> {
	//
	// @Override
	// public int compare(Product o1, Product o2) {
	// return o1.getName().compareTo(o2.getName());
	// }
	//
	// }

	private static void display(List<Product> products) {
		for (Product product : products) {
			System.out.println(product);
		}
	}

}
