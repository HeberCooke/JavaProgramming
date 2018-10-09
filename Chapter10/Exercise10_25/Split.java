

public class Split {
	Split(){
		
	}
	public static String[] split(String s, String regex) {
		String []temp = s.split(regex);
		return temp;				
	}
}
