package skillrack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RotateMatrix {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[][] a=new int[n][n];
		String str=br.readLine();
		
		for(int j=0;j<n;j++)
		{
			for(int i=0;i<n;i++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		if(str.equalsIgnoreCase("CW"))
		{		//transpose matrix
				//matrix a is <pre> transposed when taking input
			//reverse row
			for(int i=0;i<n;i++)
			{
				for(int j=n-1;j>=0;j--)
				{
					System.out.print(a[i][j]+" ");
				}
			}
		}
		else if(str.equalsIgnoreCase("CCW"))
		{
			//reverseColumn
			//matrix a is pre transposed when taking input
			for(int j=0;j<n;j++)
			{
				for(int i=n-1;i>=0;i--)
				{
					System.out.print(a[i][j]+" ");
				}
			}
			
		}
		else{
			System.out.print("Incorect Rotationn Parameter ");
			System.exit(0);
		}
}
}