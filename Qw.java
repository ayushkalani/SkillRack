package skillrack;

import java.util.Scanner;

public class Qw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String lim=" ";
        String temp[]=str.split(lim);
        int count[]=new int[temp.length];
            for(int i=0;i<temp.length;i++)
            {
            count[i]=0;
            }
            for(int i=0;i<temp.length;i++)
            {   for (int j=0;j<temp.length;j++) {
            if (temp[i].equals(temp[j])) {
            count[i]=count[i]+1;
            }
            }
            }
            for(int i=0;i<temp.length;i++)
            {if(count[i]==1)
            {System.out.println(temp[i]);}
            }
	}

}
