package skillrack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SmallestNumber {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int total = 0;
		if(2 <= str.length() && str.length() <=50)
		{
			for(char c : str.toCharArray())
			{	
				total += Character.getNumericValue(c)-9;
			}	
		}
		
		System.out.println(total);
    }

}
