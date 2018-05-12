/*Name: Arjina Khanom
 * MAC-286
 * HomeWork-6:Solve the MidTerm problem using one single queue, one pass.

Assume that you have a stack of integers. You want to organize it so that the numbers smaller than -100 go

to the bottom of the Stack and number between -100 and 100 go to the middle and numbers larger than 100

to the top.

solve the problem using one temporary queue.*/


package MidtermProject;

public class Queue<T> {
	private Node<T> head = null;
	private int size = 0;
	public Queue() {
		head = null;
		size = 0;
	}
	public int size() {
		return size;
	}
	boolean isEmpty() {
		return (size == 0);
	}
	public void insert(T e) {
		Node<T> newNode = new Node<T>(e);
		if(size == 0) {
			head = newNode;
			size++;
		}else {
			newNode.setNext(head);
			head = newNode;
			size++;
		}
	}
	public T remove() {
		//if only one element
		if (isEmpty())
			return null;		
		if(size == 1) {
			//The returned data will be the data of the first node
			T retEl = head.Data();
			head = null;
			size = 0;
			return retEl;
		}else {
			//go to the next to last node
			Node<T> temp = head;
			while(temp.Next().Next() != null) {
				temp = temp.Next();
			}
			T retEl = temp.Next().Data();
			temp.setNext(null);
			size--;
			return retEl;
		}
	}
	public void print() {
		Node<T> temp = head;
		while(temp!= null) {
			System.out.println(temp.toString());
			temp = temp.Next();
		}
	}

}
