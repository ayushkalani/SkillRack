package skillrack;

import java.util.Scanner;

public class PrimeProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		int take = sc.nextInt();
		int flag=0;int j=2;int k=0;
		int arr[]=new int[take];
		for(int i=2;i<take;i++)
		{
			if (take % i == 0)
			{	//to check if i is prime
				while (j <= i/ 2)
				  {
				      if (i % j == 0)
				      {
				         flag = 1;
				      }
				      j++;
				  }
				if(flag==0)
				{
					arr[k]=i;
					k++;				
				}
			}	
		}
		for (k=0;k<3;k++){
		System.out.println(arr[k]);
			}
	}
}
