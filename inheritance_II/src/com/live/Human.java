package com.live;

public class Human extends LivingThing{
	
	public void study() {
		System.out.println("Human study..");
	}

	@Override
	public void work(){
		super.work();
		System.out.println("Human work.");
	}

}
