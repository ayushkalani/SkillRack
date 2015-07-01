/**
 * 
 */
package skillrack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckInstance {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str  = br.readLine();
		char abcd[]= new char[26];
		int i=0;
		int largest=0;
		char fina ='a';
			for(char alphabet ='a';alphabet<='z';alphabet++)
				{
					int count=0;
					for(i=0;i<str.length();i++)
					{
						if (alphabet == str.charAt(i))
						{
							count+=1;
						}
					}
					if (count >largest )
						
					{
						largest = count;
						fina = alphabet;
						
					}
					
				}
			System.out.println(fina);
		
	}

}
