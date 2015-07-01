package skillrack;

import java.util.Scanner;

public class EvenFactor {

	public static void main(String[] args) {
		// Highest even factor*catch
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		int take = sc.nextInt();
		int fina=0;
		if(take%2==0)
			{
				int half=take/2;
				if(half%2==0)
				{
					System.out.println(half);
				}
				else{
					for(int i=half-1;i>0;i--)
					{
					if(take%i==0)
						{
							fina=i;
							break;
						}
					}
					System.out.println(fina);
				}
			}
		else{System.out.println("-1");}
	}

}
