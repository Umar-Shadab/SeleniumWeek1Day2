package Week1.Day2;

public class ReverseEvenWordsAssignment {

	public static void main(String[] args) {
		
		String str = "This is the final Assignment of first week";
		
		String[] split = str.split(" ");
		
		for(int i = 0; i < split.length; i++)
		{
			if(i%2 != 0){ 
				split[i] = new StringBuffer(split[i]).reverse().toString(); 
			} 
		}
		
		StringBuffer output = new StringBuffer(); 
		for(String x : split)
		{ 
			output.append(x+" "); 
		} 
		System.out.println(output);

	}

}
