package my.generics;

class Subject {

}

class Java extends Subject {

}

class JavaScript extends Subject {

}
//
// class Trainer {
//
// private Object subject;
//
// public void setSubject(Object subject) {
// this.subject = subject;
// }
//
// public Object getSubject() {
// return this.subject;
// }
//
// }

class Trainer<T extends Subject> {

	private T subject;

	public void setSubject(T subject) {
		this.subject = subject;
	}

	public T getSubject() {
		return this.subject;
	}

}

public class Generics_Demo {

	public static void main(String[] args) {

		Trainer<Java> trainer1 = new Trainer<Java>(); // java
		trainer1.setSubject(new Java());

		Trainer<JavaScript> trainer2 = new Trainer<JavaScript>(); /// JavaScript
		trainer2.setSubject(new JavaScript());

		// Trainer<String> trainer=new Trainer<String>();

		// ------------------------------------------

		// trainer1.setSubject(new JavaScript());

		// ------------------------------------------
		//
		// Object object = trainer1.getSubject();
		//
		// //if (object instanceof Java) {
		// Java java = (Java) object;
		// System.out.println("Happy learning from tnr1");
		// //} else {
		// //System.out.println("ooops");
		// //}

		Java java = trainer1.getSubject();
		System.out.println("Happy learning from tnr1");

	}

}
