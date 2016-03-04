//program to reverse each word of a sentence with starting letter to be in CAPS 
//Input: my nAMe is john. 
//Output: Ym Eman Si Nhoj.
import java.util.Arrays;
import java.util.Scanner;

public class cheftest {
	public static void main(String[] args) {
		// TODO Auto-generated m
	String m ="my nAMe is john".toLowerCase();
	String[] yo=m.split(" ");
	String ans="";
	
	for(int i=0;i<yo.length;i++){
		String reversed = new StringBuilder(yo[i]).reverse().toString();
		reversed=reversed.substring(0,1).toUpperCase()+reversed.substring(1,reversed.length());
		ans+=reversed+" ";
	}
	System.out.println(ans);
	
	
	}
}