	package skillrack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//input-5 5 6 10
//output 55
import java.util.Collections;

public class PairDifference {

	public static void main(String[] args) throws IOException {
	    //Scanner sc=new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str =br.readLine();
		String[] mau=str.split(" ");
		int min=100;
		int dead=0;
		int mau5 = 0;
		int temp=0;
		for(int i=0;i<mau.length;i++)
		{ 
			for(int j=1;j<mau.length;j++)
			{	
				int a=Integer.parseInt(mau[i]);
				int b=Integer.parseInt(mau[j]);
				if(i!=j){
				temp=Math.abs(a-b);
				}
				if(temp<min)
				{
					min=temp;
					dead=a;
					mau5=b;
				}
			}
			
		}
		System.out.print(Math.min(dead, mau5)+" "+Math.max(dead, mau5));
	
	}

}
