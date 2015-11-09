public class Hamming {
	public static int compute(String a, String b){
		int dif = 0;
		if(a.length() != b.length()) throw new java.lang.IllegalArgumentException();
		for(int i = 0; i < a.length(); i++)
			dif += a.charAt(i) != b.charAt(i) ? 1 : 0;
		return dif;
	}
}
