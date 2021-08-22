package Week1.Day2;

public class ChangeOddIndexToUpperCaseAssignment {

	public static void main(String[] args) 
	{
		String test = "changeme"; 
	    StringBuffer updatedString = new StringBuffer(); 
	    char[] characters = test.toCharArray(); 
	    for (int index = 0; index < characters.length; index++)
	    { 
	     char c = characters[index]; 
	     if (index % 2 != 0) 
	     { 
	      c = Character.toUpperCase(c); 
	     } 
	     updatedString.append(c); 
	    } 
	    System.out.println("Modified string is: " + updatedString.toString()); 
	  } 
	}
