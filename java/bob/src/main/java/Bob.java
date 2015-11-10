public class Bob{
	private static String YELL = "Whoa, chill out!";
	private static String ASK = "Sure.";
	private static String OTHER = "Whatever.";
	private static String NONE = "Fine. Be that way!";

	public String hey(String input){
		if(input.matches("\\s+"))
			return NONE;
		if(input.equals(input.toUpperCase()) && input.matches(".*[a-zA-Z].*"))
			return YELL;
		if(input.endsWith("?"))
			return ASK;
		else
			return OTHER;
	}
}
