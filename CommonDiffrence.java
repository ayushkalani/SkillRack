package skillrack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CommonDiffrence {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String chill  = br.readLine();
		
		ArrayList<String> myList = new ArrayList<String>(Arrays.asList(chill.split(" ")));
		Collections.sort(myList);
		int a=Integer.parseInt(myList.get(1));
		int b=Integer.parseInt(myList.get(0));
		int ans=a-b;
		if(ans>0)
		{
			System.out.println(ans);
		}
		else {
			System.out.println(-ans);
		}
		
		

	}

}
