import java.util.*;

public class Anagram {
	private String base;
	private String sortedBase;

	public Anagram(String base){
		this.base = base;
		sortedBase = sortWord(base);
	}

	public List<String> match(List<String> options){
		List<String> matches = new ArrayList<String>();
		for(String option : options)
			if(isAnagram(option)) matches.add(option);
		return matches;
	}

	private boolean isAnagram(String option){
		if(base.equalsIgnoreCase(option)) return false;
		return sortedBase.equals(sortWord(option));
	}

	private String sortWord(String word){
		char[] sortWord = word.toLowerCase().toCharArray();
		Arrays.sort(sortWord);
		return new String(sortWord);
	}
}
