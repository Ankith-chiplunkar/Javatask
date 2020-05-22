import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class assign2 {

	public static void main(String[] args) {
		LinkedList<String> list= new LinkedList<String>();
		list.add("first");
		list.add("second");
		System.out.println(list);
		 
		list.addLast("last");
	    list.addFirst("first item");
		System.out.println(list);
		 
		Iterator i =list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		Iterator it= list.descendingIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		 
		ArrayList<String> alist= new ArrayList<>(list);
		
		System.out.println(alist);
        
	}

}
