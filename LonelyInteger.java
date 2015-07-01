package skillrack;

import java.util.Scanner;

public class LonelyInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		int take = sc.nextInt();
		int arr[]=new int[take];
		for(int i=0;i<take;i++)
		{
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int k=0;k<take;k++)
		{	
			for(int j=0;j<take;j++)
			{		
				if(arr[k]==arr[j]){
					count++;	
				}	
			}
			if(count==1){
				System.out.println(arr[k]);	
			}
			else
			{count=0;}
		}
	}

}
