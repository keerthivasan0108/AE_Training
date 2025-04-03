package Collections;
import java.util.*;
public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<>();
		
		ll.add("red");
		ll.add("yellow");
		ll.add("blue");
		ll.add("green");
		ll.add("pink");
		
		System.out.println(ll);
		ll.add(1,"black");
		System.out.println(ll);
		
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.removeFirst());
		System.out.println(ll);
		System.out.println(ll.removeLast());
		System.out.println(ll);
	}

}
