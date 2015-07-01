package skillrack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VowelConsonant {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str  = br.readLine();
		int len = str.length();
		int j=0;
		for(int i=0;i<len;i++)
		{
				if(str.charAt(i)=='a' ||str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u'  )
				{
					System.out.print((char)(str.charAt(i)+1));
				}
				else
				{
					 for(j=str.charAt(i)+1;;j++)
		                {
		                    if(j=='a' || j=='e' || j=='i' || j=='o' || j=='u')
		
		                    {
		                        System.out.print((char)j);
		                        break;
		                    }
		                    else if(j>'u')
		                    {
		                        System.out.print('a');
		                        break;
		                    }
		                }
				}
		}

	}

}
