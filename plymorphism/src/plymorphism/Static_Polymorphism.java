package plymorphism;

class Person{
	
	public void eat() {
		System.out.println("wat to eat???");
	}
	public void eat(String item) {
		System.out.println("eating "+item);
	}
	
}

public class Static_Polymorphism {
	
	public static void main(String[] args) {
		
		Person person=new Person();
		person.eat();
		person.eat("PIZAA");
		
		System.out.println(1);
		System.out.println("string");
		System.out.println(12.12);
		
	}

}
