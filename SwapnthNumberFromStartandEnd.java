package skillrack;

import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SwapnthNumberFromStartandEnd {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String chill  = br.readLine();
		
		ArrayList<String> s=new ArrayList<String>(Arrays.asList(chill.split(" ")));
		int length=s.size();
		int n=sc.nextInt();
		String a=s.get(n-1);
		String b=s.get(length-n);
		s.set(length-n, a);
		s.set(n-1, b);
		for(int i=0;i<length;i++)
		{	
			System.out.print(s.get(i));
			System.out.print(" ");
		}
		
		
		

	}

}
