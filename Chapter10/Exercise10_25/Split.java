
public class Split {

	public static String[] split(String s1, String regex) {		// method 
	String[] temp2 = s1.split(regex);	 // temp string that returns a string array
	
	for(int i = 0; i < temp2.length;i++) { // loop to add the regex value back to the string 
		temp2[i]+=",";  	// adding the comma to the end of each string in the array
		temp2[i]+= regex;		// adding the regex value to each string in the array
	}
		return  temp2; 
	}

	
}// end class---------------------------------------------------------

