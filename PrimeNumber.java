package skillrack;
import java.util.Scanner;
public class PrimeNumber {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		int take = sc.nextInt();
		int flag=0,r,check=0,i=0,temp2=take;
		for(i=temp2;i>0;i--)
		{ 
			for(int k=2;k<i/2;k++)
			{
				if(i%k!=0)
				{flag=0;}
				else{flag=1;break;}
					
				}
			if(flag==0)
			{check=1;}
			break;
		}
		if(check==1){
			System.out.println(0);
		}
		else{
		
		//to find previous prime number
		int temp=take-1;
		int flagp=0;
		 i=0;
			for(i=temp;i>0;i--)
			{ 
				for(int j=2;j<i/2;j++)
				{
					if(i%j!=0)
					{
					flagp=0;
					
					}
					else{flagp=1;break;}
				}
				if(flagp==0)
				{//System.out.println(i);
					break;}
				}
				
			
		//to find next prime number
			int temp1=take+1;
			int flagn=0;
			int s=0;
			for(s=temp1;s>0;s++)
			{
				for(int k=2;k<s/2;k++)
				{
					if(s%k!=0)
					{flagn=0;}
					else{flagn=1;break;}
						
					}
				if(flagn==0)
				{//System.out.println(s);
					break;}
				}
			
			//difference of the previous and next prime
			System.out.println(""+(s-i));
			}
	}
	}

