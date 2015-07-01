package skillrack;
import java.util.*;
//input- 2 1 
//output 9
//input - 10 2
//output -1
public class SumPrimeClose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		int t=prime(c);
		if(t==0)
		{	System.out.println(c*c);
		
		}
		else{
			for(int p=1;p<c;p++)
			{
				int m=prime(c-p);
				int n=prime(c+p);
				if(m==0&&n==0)
				{
					System.out.println("-1");
					System.exit(0);
				}
				else if(m==0)
				{
					System.out.println((c-p)*(c-p));
					System.exit(0);
				}
				else if(n==0)
				{
					System.out.println((c+p)*(c+p));
					System.exit(0);
				}
			}
			
		}
	}
	static int prime(int n)
	{	int k=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
			k=-1;	
			}
		}
		return k;
	}

}
