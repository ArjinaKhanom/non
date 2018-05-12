/*Name: Arjina Khanom
 * MAC-286
 * HomeWork-6:Solve the MidTerm problem using one single queue, one pass.

Assume that you have a stack of integers. You want to organize it so that the numbers smaller than -100 go

to the bottom of the Stack and number between -100 and 100 go to the middle and numbers larger than 100

to the top.

solve the problem using one temporary queue.*/

package MidtermProject;
import java.util.*;

public class Stack<T> {
	private Vector<T> v;
	Stack(){
		v=new Vector<T>();
		
}
	Stack(int c){
		v = new Vector<T>(c);
	}
	
	void push(T a){
		v.insertElementAt(a, v.size());
	}
	T pop(){
		return v.remove(v.size()-1);
	}
boolean isEmpty(){
	return v.isEmpty();
}
T peek(){
	return v.elementAt(v.size()-1);
}
int size(){
	return v.size();
}
int capacity(){
	return v.capacity();
}
public boolean isFull(){
	if (v.size()==v.capacity())
		return true;
	return false;
}
void print(){
	System.out.println(v.toString());
}
public String toString(){
	return v.toString();
}
}
