package my;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Item implements Comparable<Item> {

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

	public Item(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Item o) {
		if (this.id > o.id) {
			return 1;
		} else if (this.id < o.id) {
			return -1;
		} else {
			return 0;
		}
	}

}

public class Sorting_Set_Colln {

	public static void main(String[] args) {

		Item Item1 = new Item(45367, "Laptop", 198000);
		Item Item2 = new Item(65434, "Mobile", 19000);
		Item Item3 = new Item(12321, "Camera", 39000);
		Item Item4 = new Item(56856, "Other", 1000);
		Item Item5 = new Item(56856, "Other", 1000);

		Set<Item> items = new TreeSet<>(new Comparator<Item>() {
			public int compare(Item o1, Item o2) {
				if (o2.getId() == o1.getId()) {
					return 0;
				} else if (o2.getId() > o1.getId()) {
					return 1;
				} else {
					return -1;
				}
			};
		});
		items.add(Item1);
		items.add(Item2);
		items.add(Item3);
		items.add(Item4);
		items.add(Item5);

		display(items);
	}

	private static void display(Set<Item> Items) {
		for (Item Item : Items) {
			System.out.println(Item);
		}
	}

}
