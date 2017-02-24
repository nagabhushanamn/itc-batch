package my.util;

public class LinkedList<E> {

	private Node head = null;

	public void add(E data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node last = head;
			while (last.getNext() != null) {
				last = last.getNext();
			}
			last.setNext(newNode);
		}
	}

	private class Node {

		private E data;
		private Node next;

		public Node(E data) {
			this.data = data;
		}

		public E getData() {
			return data;
		}

		public void setData(E data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}
}
