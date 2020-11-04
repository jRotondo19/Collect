import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collect {

	public static void main (String[] args) {
	
	List<String> collections = Arrays.asList("hello", "java is fun", "hello");
	Set<String> uniqueCollections = new HashSet<String>(collections);
	System.out.println("Unique collections: " + uniqueCollections.size());
	}
}
