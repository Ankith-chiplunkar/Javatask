import java.util.HashMap;
import java.util.Set;

public class assign5 {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer, String>();
		map.put(1,"A");
		map.put(2,"B");
		map.put(3,"C");
		
		System.out.println(map);
		
		System.out.println("1. A exist?");
		if(map.containsValue("A")) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
		String a=map.get(2);
		System.out.println("value in 2 is "+a);
		
		Set<Integer> set=map.keySet();
		System.out.println(set);
		
		System.out.println("collection view of values: "+ map.values());
		
	

	}

}
