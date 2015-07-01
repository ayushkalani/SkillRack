package skillrack;

import java.util.Scanner;

public class WaterJug {
	Scanner sc=new Scanner(System.in);
	int maxa,maxb,desa,desb,a,b;
	
	public static void main(String args[])
	{
		WaterJug lund =new WaterJug();
		lund.input();
		lund.mix();
	}
	
	void input()
	{
		maxa=sc.nextInt();
		maxb=sc.nextInt();
		desa=maxa+1;
		desb=maxb+1;
		while(desa>maxa||desb>maxb)
		{
			desa=sc.nextInt();
			desb=sc.nextInt();
		}
	}

	void mix()
	{
		a=0;
		b=0;
		while(a!=desa || b!=desb)
		{
		if(b==0)
		{
			fillB();
		}
		else if(a<maxa && b>0)
		{
			bta();
		}
		else if(a==maxa)
		{
			emptya();
		}
		System.out.println(a+","+b);
	}
	}
	
	void fillB()
	{
		b=maxb;
	}
	void bta()
	{
		int diff=maxa-a;
		while(a!=maxa && b!=0)
		{
			a++;
			b--;
		}
	}
	void emptya()
	{
		a=0;
	}


}
