package skillrack;
//lund program with very  high time complexity and space too
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReverseCaseAfterUnderscore {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		//ArrayList<String> s=new ArrayList<String>(Arrays.asList(str.split("_")));
		
		int flag=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='_'){ 
				flag=i;
			}
		}
		if(flag==str.length()-1)
		{
			System.out.print(str);
		}
		else{
		ArrayList<Character> chu =new ArrayList<Character>();
		for(int i=flag+1;i<str.length();i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				
				 chu.add(Character.toLowerCase(str.charAt(i)));
			}
			else if(Character.isLowerCase(str.charAt(i)))
			{
				 chu.add(Character.toUpperCase(str.charAt(i)));
			}
		}
		String tiya = chu.toString()
			    .replace(",", "")  //remove the commas
			    .replace("[", "")  //remove the right bracket
			    .replace("]", "")  //remove the left bracket
			    .trim();           //remove trailing spaces from partially initialized arrays
		if(flag==0)
		{
			String ayush="_";
			String mc = new StringBuilder().append(ayush).append(tiya).toString();
				
			System.out.print(mc.replaceAll("\\s+",""));
		}
		
		else{
			ArrayList<Character> awe =new ArrayList<Character>();
			for(int i=0;i<=flag;i++)
			{
				awe.add(str.charAt(i));
				
			}
			String taka = awe.toString()
				    .replace(",", "")  //remove the commas
				    .replace("[", "")  //remove the right bracket
				    .replace("]", "")  //remove the left bracket
				    .trim();           //remove trailing spaces from partially initialized arrays
			 String bc = new StringBuilder()
		    .append(taka)
		    .append(tiya)
		    .toString();
			 System.out.print(bc.replaceAll("\\s+",""));
			
		}
	
	}
}
}
