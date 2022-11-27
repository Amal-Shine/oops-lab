import java.util.Scanner;


class Node {
	int data;
	Node prev, next;

	Node(int data) {
		this.data = data;
		this.prev = null;
		this.next = null;
	}
}

class DoublyLinkedList {

	Node head;

	DoublyLinkedList(Node head) {
		this.head = head;
	}

	void print() {
		Node node = head;
		while(node.next != null) {
			System.out.print(node.data + " -> " );
			node = node.next;
		}
		System.out.println(node.data);
	}

	void insertAtEnd(int data) {
		Node ptr = head;
		while(ptr.next != null)
			ptr = ptr.next;
		Node node  = new Node(data);
		ptr.next = node;
		node.prev = ptr;
	}

	void insertAtBegining(int data) {
		Node node = new Node(data);
		node.next = head;
		head.prev = node;
		head = node;
	}

	void insert(int i, int data) {
		int index = 0;
		Node ptr = head;
		while(ptr.next != null && i < index) {
			ptr = ptr.next;
			i++;
		}
		ptr = ptr.next;
		Node node = new Node(data);
		node.prev = ptr;
		node.next = ptr.next;
		ptr.next.prev = node;
		ptr.next = node;
	}

	void deleteLastNode() {
		Node ptr = head;
		while(ptr.next != null)
			ptr = ptr.next;
		ptr.prev.next = null;
	}

	void deleteFirstNode() {
		head = head.next;
	}

	void delete(int i) {
		int index = 0;
		Node ptr = head;
		while(ptr.next != null && i < index) {
			ptr = ptr.next;
			i++;
		}
		ptr = ptr.next;

		ptr.next = ptr.next.next;
		ptr.next.prev = ptr;
	}
}

public class DLL {
	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList(new Node(1));
		dll.insertAtEnd(2);
		dll.insertAtBegining(0);
		dll.print();
		dll.insert(2, 9);
		dll.print();
		dll.deleteLastNode();
		dll.print();
		dll.delete(1);
		dll.print();
		dll.deleteFirstNode();
		dll.print();
	}
}
