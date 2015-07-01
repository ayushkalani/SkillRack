package skillrack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class A3B5a2 {

	static HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

	static int askForKey(int i)
	{
		for(int l:map.keySet())
		{
			if (map.get(l) == i)
			{
				return l;
			}
		}

		return 0;
	}
	public static void main(String[] args) throws Exception
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		for(char c:str.toCharArray())
		{
			int t = Integer.parseInt(""+c);
			if (map.containsKey(t))
			{
				map.put(t, map.get(t) + 1);
			}
			else
			{
				map.put(t,1);
			}
		}

		


		int largest = 0;

		while(true)
		{
			largest =0;
			for(int i: map.values()) 
			{
				
				if (i>largest)
				{
					largest = i;
				}
			}
			
			if (largest != 0)  
			{
				int l = askForKey(largest);
				
				for(int j=0;j<largest;j++)
				{
					System.out.print(l);	
				}
				map.remove(l);
			}

			if (map.size()==0)
			{
				System.exit(0);
			}

		}
	}
}