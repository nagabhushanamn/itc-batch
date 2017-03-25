package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


class Box implements Iterable<String>{

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	//
}

public class Demo {

	public static void main(String[] args) {
		
		
		List<String> list=new ArrayList<String>();
		list.add("item-1");
		list.add("item-2");
		
		
		for(String item:list){
			System.out.println(item);
		}
		
		Box box=new Box();
		
		for(String o:box){
			
		}
		
		
	}
	
}
