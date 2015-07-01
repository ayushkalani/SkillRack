package skillrack;

import java.util.Scanner;

public class SumOfOddFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int total=0;
		if(n>1&&n<10000)
		{
			for(int i=1;i<=n;i++)
			{
				if((n%i)==0&&(i%2)!=0)
				{
					total+=i;
				}
			}
		}
		System.out.println(total);
	}

}
