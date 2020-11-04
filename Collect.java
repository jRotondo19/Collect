import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Collect {

	public static void main (String[] args) {
	
	List<String> collections = Arrays.asList("hello", "java is fun", "hello");
	Set<String> uniqueCollections = new HashSet<String>(collections);
	System.out.println("Unique collections: " + uniqueCollections.size());
	
	TreeMap<String, Integer> collec1 = new TreeMap<>();
	
	collec1.put("first", 1);
	collec1.put("third", 3);
	collec1.put("second", 2);
	
	Set<Entry<String, Integer>> sortedcollec1 = collec1.entrySet();
	
	for (Entry<String, Integer> mapsorted1 : sortedcollec1) {
		System.out.println(mapsorted1.getKey() + ":" + mapsorted1.getValue());
	}

	
	HashMap<String, Integer> collec2 = new HashMap<>();
	
	collec2.put("first", 1);
	collec2.put("third", 3);
	collec2.put("second", 2);
	
	Set<Entry<String, Integer>> sortedcollec2 = collec2.entrySet();
	
	for (Entry<String, Integer> mapsorted1 : sortedcollec2) {
		System.out.println(mapsorted1.getKey() + ":" + mapsorted1.getValue());
	}
	
	// hashmap should be used when the order does not matter
	// treemap should be implemented when you want to keep a certain order
	//as you can see while compiling the above program, treemap will keep a sorted order of integers but hashmap will give any order it pleases.
	
	}
	
}
