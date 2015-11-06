import java.util.*;

public class DNA {
	Map<Character, Integer> counts;
	String dnaString;

	public DNA(String dnaString){
		this.dnaString = dnaString;
		counts = new HashMap<Character, Integer>();
		counts.put('A', 0); counts.put('T', 0); counts.put('G', 0);
		counts.put('C', 0);
		countDNA();
	}

	public int count(char c){
		if(counts.get(c) == null) throw new IllegalArgumentException();
		return counts.get(c);
	}

	private void countDNA(){
		for(int i = 0; i < dnaString.length(); i++){
			if(counts.containsKey(dnaString.charAt(i)))
				counts.put(dnaString.charAt(i),counts.get(dnaString.charAt(i))+1);
		}
	}

	public Map<Character, Integer> nucleotideCounts(){
		return counts;
	}
}
