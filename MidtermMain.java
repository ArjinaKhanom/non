/*Name: Arjina Khanom
 * MAC-286
 * HomeWork-6:Solve the MidTerm problem using one single queue, one pass.

Assume that you have a stack of integers. You want to organize it so that the numbers smaller than -100 go

to the bottom of the Stack and number between -100 and 100 go to the middle and numbers larger than 100

to the top.

solve the problem using one temporary queue.*/

package MidtermProject;

public class MidtermMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		Stack<Integer> St = new Stack<Integer>();
		Queue<Integer> Q = new Queue<Integer>();
		St.push(23);
		St.push(10);
		St.push(-1200);
		St.push(156);
		St.push(-1024);
		St.push(28);
		St.push(-156);
		St.push(45);
		St.push(666);
		St.push(0);
		St.push(13);
		St.push(-140);
		//printing the original stack
	    St.print();
		
	//organize the original stack
				while(!St.isEmpty()) {
					int temp = St.pop();
					if(temp < -100) {
					
						St.push(temp);
					}else {
						Q.insert(temp);
					}
				}
				
			
				while(!Q.isEmpty()) {
					int temp = Q.remove();
					if((temp >=-100) && (temp<100) ){
						St.push(temp);
					}else {
					
						Q.insert(temp);
					}
				}
				
			while(!Q.isEmpty()) {
					
					St.push(St.pop());
				}
	
	//System.out.println(St);
			St.print();
	}
}
