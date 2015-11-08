import java.util.*;

public class WordCount {
	public Map<String, Integer> Phrase(String phrase){
		String simplifiedInput = phrase.toLowerCase().replaceAll("[^a-z0-9 ]", "");
		Map<String, Integer> map = new HashMap<String, Integer>();
		Scanner sc = new Scanner(simplifiedInput);
		while(sc.hasNext()){
			String word = sc.next();
			int count = map.get(word) == null ? 0 : map.get(word);
			map.put(word, count+1);
		}
		return map;
	}
}
