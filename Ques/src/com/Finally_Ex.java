package com;

import java.io.Closeable;

class MyException extends Exception {
	@Override
	public String getMessage() {
		return "I hate Java";
	}
}

class Resource implements Closeable {

	public void init() {
		System.out.println("resource:init()");
	}

	public void use() throws MyException {
		System.out.println("resource:use()");
		// throw new MyException();
	}

	public void close() {
		System.out.println("resource:close()");
	}

}

public class Finally_Ex {
	public static void main(String[] args) {

		// Resource resource = new Resource();
		// resource.init();
		// try {
		// resource.use();
		// return;
		// } catch (Exception e) {
		// System.out.println("i caught " + e.getMessage());
		// } finally {
		// resource.close();
		// }

		// JDK 1.7 , try with closable resource
		// try (Resource resource = new Resource()) {
		// resource.init();
		// resource.use();
		// } catch (Exception e) {
		// System.out.println("i caught " + e.getMessage());
		// }

	}
}
