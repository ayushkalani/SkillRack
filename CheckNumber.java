package skillrack;

import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		int take = sc.nextInt();
		int n=0,s,r=0,t=take;
		n=take;
		while(n>0)
		{
			r++;
			n=n/10;
		}
		int arr[]=new int[r];
		int r1=r;
		while(t>0)
		{
			s=t%10;
			arr[--r]=s;
			t=t/10;
		}
		for(int i=0;i<r1;i++)
		{
			if(arr[i]%2==0)
			{
				arr[i]=arr[i]+1;
			}
			else
			{
			    arr[i]-=1;
			}
		}
		for(int i=0;i<r1;i++)
		{
			if(arr[i]==0 && i==0)
			{
				continue;
			}
			else
			{
				System.out.print(arr[i]);
			}
		}
		

	}
}
