package practiceFrameWork;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer>ll=new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(null);
		
		System.out.println(ll); //[10, 20, 30, 40, null]
		ll.add(2, 25);
		System.out.println(ll);  //[10, 20, 25, 30, 40, null]
		ll.set(5, 50);
		System.out.println(ll);
		System.out.println(ll.isEmpty());
		System.out.println(ll.contains(30));
		ll.addFirst(5);
		ll.addLast(35);
		System.out.println(ll);  //[5, 10, 20, 25, 30, 40, 50, 35]
		Collections.sort(ll);
		System.out.println(ll); //[5, 10, 20, 25, 30, 35, 40, 50]
		Collections.sort(ll,Collections.reverseOrder());
		System.out.println(ll); //  [50, 40, 35, 30, 25, 20, 10, 5]
		
		LinkedList l=new LinkedList();
		l.addAll(ll);
		System.out.println(l);
		l.removeAll(ll);
		System.out.println(l);
		/*System.out.println(ll.get(0));
	System.out.println(ll.remove(4));
	System.out.println(ll);
	
	//advanced for loop 
	for(Integer in:ll) {
		System.out.println(in);
		
	}*/
		
		

	}

}
;