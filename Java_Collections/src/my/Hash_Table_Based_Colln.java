package my;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

class Car extends Object {

	String model;
	String color;

	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

}

class Owner {
	String name;

	public Owner(String name) {
		super();
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Owner other = (Owner) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

}

public class Hash_Table_Based_Colln {

	public static void main(String[] args) {

		// String name1="Nag";
		// String name2="Nag";
		//
		// System.out.println(name1.hashCode());
		// System.out.println(name2.hashCode());
		//
		// HashSet<String> hashSet=new HashSet<>();
		// hashSet.add(name1);
		// hashSet.add(name2);
		//
		// System.out.println(hashSet.size());

		// ------------------------------------------

		Car car1 = new Car("BMW", "black");
		Car car2 = new Car("BMW", "black");
		
		Owner owner1=new Owner("Nag");
		Owner owner2=new Owner("Ria");
		
		

		// System.out.println(car1.hashCode());
		// System.out.println(car2.hashCode());
		//
		// System.out.println(car1.equals(car2));
		//
		// HashSet<Car> cars = new HashSet<>();
		// cars.add(car1);
		// cars.add(car2);
		//
		// System.out.println(cars.size());
		
		
		Map<Owner, Car> map=new HashMap<>();
		map.put(owner1, car1);
		map.put(owner2, car2);
		
		//-----------------------------------------
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter owner name");
		String name=sc.nextLine();
		
		Owner key=new Owner(name);
		
		Car car=map.get(key);
		if(car!=null){
			System.out.println(car.model);
		}else{
			System.out.println("dream it..");
		}
		
		

	}

}
