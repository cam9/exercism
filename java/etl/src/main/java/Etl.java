import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Etl {
	public Map<String, Integer> transform(Map<Integer, List<String>> old) {
		Map<String, Integer> etl = new HashMap<String, Integer>();
		for(Integer i: old.keySet()){
			for(String s: old.get(i)){
				etl.put(s.toLowerCase(),i);
			}
		}		
		return etl;
	}
}
