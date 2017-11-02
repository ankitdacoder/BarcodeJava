package pdf;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {

	public static void main(String[] args) {
      
		Deque<Integer> deque= new  ArrayDeque <Integer>(6);
		deque.add(20);
		deque.add(30);
		deque.add(40);
		deque.add(50);
		deque.add(60);
		deque.addFirst(100);
		for(Integer  number : deque )
		{
			System.out.println("Number is "+number);
		}
		
	
		//  Deque<Integer> deque2 = deque.clone();
		
		System.out.println("Performing clear operation !!");
		   deque.clear();
		   int retval = deque.size();
		   System.out.println("Now, deque consists of "+ retval +" elements");
		   
		
	}

}
