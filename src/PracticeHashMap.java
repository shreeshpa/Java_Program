import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PracticeHashMap {

	public static void main(String[] args) {
		
	HashMap<Integer, String> hash=new HashMap<Integer, String>();
	
		hash.put(1, "Shreesh"); //1
		hash.put(2, "Chandan");//2
		hash.put(3, "Shirish");//3
		hash.put(4, "Ravi");//4
		hash.put(5,  "Null"); //5
		
		System.out.println(hash.get(1)); //SHreesh
		System.out.println(hash.get(6)); //Null
		
	//	hash.forEach((k,v) -> System.out.println("key =" + k + " value = " +v));
		
		for(Map.Entry<Integer, String> entry:hash.entrySet()) {
			System.out.println("Key=" +entry.getKey() + "Value= "+ entry.getValue());
		}
	hash.forEach((k,v) -> System.out.println("Key= "+k +"Value= "+v));	
	
	HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
	map1.put(1, 100);
	map1.put(2, 200);
	map1.put(3, 300);
	map1.put(4, 200);
	map1.put(5, null);
	map1.put(null, 600);
	map1.put(null, 700);

	System.out.println(map1.get(2));
	System.out.println(map1.get(5));
	System.out.println(map1.get(null));
	
	}

}
