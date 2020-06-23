package selenium.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare a String as PayPal India
		String name="PayPal India";
		
		//Convert it into a character array
		char[] carray = name.toCharArray();
		
		//Declare a Set as charSet for Character
		Set<Character> charset = new LinkedHashSet<Character>();
		
		//Declare a Set as dupCharSet for duplicate Character
		Set<Character> dupcharset = new LinkedHashSet<Character>();
		
		//Iterate character array and add it into charSet
		//if the character is already in the charSet then, add it to the dupCharSet
		for (Character c : carray) {
			boolean add = charset.add(c);
			if(add== false)
			{
				dupcharset.add(c);
			}
		
		}
		System.out.println(charset);
		System.out.println(dupcharset);
		
		//Check the dupCharSet elements and remove those in the charSet
		charset.removeAll(dupcharset);
	    System.out.println(charset);
	    
	    //Iterate using charSet
	    //Check the iterator variable isn't equals to an empty space
        //print each character for charSet
	    for (Character ch : charset) {
	    	
	    	if(ch == ' ')
	    	{
	    		continue;
	    	}
	    	else
	    	{
	    		System.out.println(ch);
	    	}
			
		}
	}

}
