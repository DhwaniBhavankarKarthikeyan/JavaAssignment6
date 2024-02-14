package Part1b;

public interface Interface_GSTK {
	public void push(int element);
	public int pop();
	public void displayStack();
	public boolean isOverflow();
	public boolean isUnderflow();

}

package Part1b;

import java.util.ArrayList;

public class Growable_stk implements Interface_GSTK {
	
	ArrayList<Integer> stack = new ArrayList<Integer>(5);
	private int top=-1;
	
	public ArrayList<Integer> getStack() {
		return stack;
	}

	public void setStack(ArrayList<Integer> stack) {
		this.stack = stack;
	}
	
	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}
	

	public Growable_stk() {
		this.stack = stack;
		this.top = top;
	}

	//Verified
	@Override
	public void push(int element) {
		//top=top+1;
		stack.add(++top,element);
		
	}

	//verified
	@Override
	public int pop() {
		if(isUnderflow())
		{
			System.out.println("Stack is empty");
			System.exit(0);
		}
		return stack.remove(top--);
	}

	//verified
	@Override
	public void displayStack() {
		if(isUnderflow())
		{
			System.out.println("No elements");
		}
		else
		{
			System.out.println();
			System.out.println("Stack elements are : ");
			
			for(int x:stack)
			{
				System.out.print(x+"\t");
			}
		}	
	}

	//verified
	@Override
	public boolean isOverflow() {
		return false;
	}

	//verified
	@Override
	public boolean isUnderflow() {
		if (top==-1)
			return true;
		else 
			return false;
	}

	

}
package Part1b;

public class GStackDemo {

	public static void main(String[] args) {
		Growable_stk g = new Growable_stk();
		
		g.push(1);
		g.push(2);
		g.push(3);
		g.push(4);
		g.push(5);
		
		g.displayStack();
		
		g.pop();
		g.displayStack();
		
		g.pop();
		g.displayStack();
		
		g.pop();
		g.displayStack();
		
		g.pop();
		g.displayStack();
		
		g.pop();
		g.displayStack();
		
		g.pop();
		g.displayStack();


	}

}






