import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Etl {
	public Map<String, Integer> transform(Map<Integer, List<String>> old) {
		Map<String, Integer> transformedMap = new HashMap<String, Integer>();
		for(Integer score: old.keySet()){
			for(String letter: old.get(score)){
				transformedMap.put(letter.toLowerCase(),score);
			}
		}		
		return transformedMap;
	}
}
