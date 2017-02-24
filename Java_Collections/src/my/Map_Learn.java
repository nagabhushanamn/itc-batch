package my;

import java.util.Map;
import java.util.TreeMap;

public class Map_Learn {

	public static void main(String[] args) {
		
		Map<String, String> map=new TreeMap<>();
		map.put("123", "Java");
		map.put("124", "JDBC");
		map.put("125", "Hibernate");
		
		String value=map.get("123");
		System.out.println(value);
		
	}
	
	
}
