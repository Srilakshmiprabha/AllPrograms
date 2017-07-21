package collection;
import java.util.*;
public class Hashset {
	public static void main(String[] args) {
	HashSet<Integer> list=new HashSet<Integer>();
	list.add(7);
	list.add(99);
	list.add(97);
	list.add(7);
	list.add(9);
	list.add(97);
	
	list.clone();
	list.remove(99);
	Iterator it=list.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}


}
}