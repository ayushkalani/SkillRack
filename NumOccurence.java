package skillrack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumOccurence {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int flag=0;

		for(int i=0;i<str.length();i++)
		{
			if (Character.isDigit(str.charAt(i)))
			{
				
				for(int j=flag;j<i;j++)
				{
					int total = Integer.parseInt(""+str.charAt(i));
					for(int k=0;k<total;k++)
					{
						System.out.print(str.charAt(j));
					}
				}
				flag = i+1;
			}
		}


	}
}