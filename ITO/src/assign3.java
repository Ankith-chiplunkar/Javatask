import java.util.HashSet;

public class assign3 {

	public static void main(String[] args) {
		HashSet<String> set= new HashSet<String>();
		
		set.add("A");
		set.add("B");
		set.add("C");
		
		System.out.println(set);
		
		set.add("cgd");
		set.add("ggd");
		set.add("wadd");
		
		System.out.println(set);
		
		System.out.println(set.size());
		
		HashSet<String> set1=new HashSet<String>();
		
		set1.add("A");
		set1.add("C");
		
		set.retainAll(set1);
		System.out.println(set);
		
		set.clear();
		System.out.println(set);
		
		

	}

}
