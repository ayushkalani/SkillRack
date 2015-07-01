package skillrack;
import java.util.Scanner;

public class FactTrailingZeros {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		double n=sc.nextInt();
		int ans=0;
		if(n>=5){
		for(int i=1;i<n;i++)
		{
			double t=Math.pow(5,i);
			int d= (int) (n/t);
			ans+=d;
		}
		System.out.print(ans);
		}
		else{
			System.out.print("0");
		}
	}
}