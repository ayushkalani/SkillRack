package skillrack;

import java.io.*;
import java.util.*;

public class AlphaPo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader chill = new BufferedReader(new InputStreamReader(System.in));
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		
		String str=chill.readLine();
		int length =sc.nextInt();
		for(int i=length;i<=str.length();)
		{
			System.out.print(str.charAt(i-1));
			i=i+length;
		}
		
		

	}

}
