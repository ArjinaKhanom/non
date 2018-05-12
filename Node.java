/*Name: Arjina Khanom
 * MAC-286
 * HomeWork-6:Solve the MidTerm problem using one single queue, one pass.

Assume that you have a stack of integers. You want to organize it so that the numbers smaller than -100 go

to the bottom of the Stack and number between -100 and 100 go to the middle and numbers larger than 100

to the top.

solve the problem using one temporary queue.*/


package MidtermProject;
public class Node<T> {
	private T data;
	private Node next;
	
	//default constructor
	public Node() {
		data = null;
		next = null;
	}
	//with the data
	public Node(T d) {
		data = d;
		next = null;
	}
	//with both parameters 
	public Node(T d, Node n) {
		data = d;
		next = n;
	}
	//getters 
	public T Data() {
		return data;
	}
	public Node<T> Next() {
		return next;
	}
	//setters 
	public void setData(T d) {
		data = d;
	}
	public void setNext(Node n) {
		next = n;
	}
	public String toString() {
		String s = "" + data;
		return s;
	}
}


