package skillrack;

import java.util.Scanner;

public class ArrayMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		int take = sc.nextInt();
		int arr[][]=new int[take][take];
		int s=0,rowlarge=0;
		int r=0,collarge=0;
		for(int i=0;i<take;i++)
		{
			for(int j=0;j<take;j++)
			{
				arr[i][j]=sc.nextInt();

			}
		}
		for(int i=0;i<take;i++)
		{s=0;r=0;
			for(int j=0;j<take;j++)
			{
				s=s+arr[i][j];
				r=r+arr[j][i];

			}
			if(s>rowlarge)
			{
				rowlarge=s;
								
			}
			if(r>collarge)
			{
				collarge=r;
							
			}
		}
		
		
		System.out.println(Math.max(rowlarge, collarge));

	}

}
