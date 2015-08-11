import java.io.*;
import java.util.*;

public class payoda2{
	public static HashSet<String> yu=new HashSet<String>();
	 public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		permutation("",str);
		System.out.println(yu.size());
		//HashSEt can't be sorted so we use treeset which is by deafult in ascending order
		TreeSet myTreeSet = new TreeSet();
   		myTreeSet.addAll(yu);
       	System.out.println(myTreeSet.toString().replace("[","").replace("]","").replace(",","").trim());
	}
	public static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0)
	    { 	
	    	yu.add(prefix);
	    }
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	    
	}
}
