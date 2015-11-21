import java.util.*;

public class Robot{
	String name;
	Random rand;

	public Robot(){
		rand = new Random(System.currentTimeMillis());
		this.name = genName();
	}

	public void reset(){
		this.name = genName();
	}

	public String getName(){
	 return name;
	}

	private String genName(){
		String name = "";
		name += (char) ('A' + rand.nextInt(26));
		name += (char) ('A' + rand.nextInt(26));
		for(int i = 0; i < 3; i++)
			name+= rand.nextInt(10)+"";
		return name;
	}
}	
