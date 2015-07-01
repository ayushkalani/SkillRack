package skillrack;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tia
{
    public static void print_board(int a[][])throws Exception
    {
        System.out.println("-------------");
        for ( int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
    public static int check_ver(int a[][])
    {
        int i,j,k=0;
        for(j=0;j<3;j++)
        {
            k=0;
            for(i=0;i<3;i++)
            {
                k+=a[i][j];
            }
            if(k==3||k==12)
                return 1;
        }
        return 0;
    }
    public static int check_hor(int a[][])
    {
        int i,j,k=0;
        for(j=0;j<3;j++)
        {
            k=0;
            for(i=0;i<3;i++)
            {
                k+=a[j][i];
            }
            if(k==3||k==12)
                return 1;
        }
        return 0;
    }
    public static int check_dia(int a[][])
    {
        int i,j,k = 0;
        for(i=0;i<3;i++)
            k+=a[i][i];
        if(k==3||k==12)
            return 1;
        j=2;
        k=0;
        for(i=0;i<3;i++)
        {
            k+=a[i][j];
            j--;
        }
        if(k==3||k==12)
            return 1;
        return 0;   
    }
    public static int check(int a[][])throws Exception
    {
        int flag;
        flag=check_hor(a);
        if(flag==1)
            return 1;
        flag=check_ver(a);
        if(flag==1)
            return 1;
        flag=check_dia(a);
        if(flag==1)
            return 1;
        return 0;
    }
    public static void main(String args[]) throws Exception
    {
        int a[][]=new int[3][3];
        int b[]=new int[2];
        b[0]=1;
        b[1]=4;
        int i,j,k=0,s;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        print_board(a);
        while(true)
        {
            int flag=0;
            s=0;
            try
            {
                System.out.println("Player "+(k+1)+" turn");
                int i_val=Integer.parseInt(br.readLine());
                int j_val=Integer.parseInt(br.readLine());
                if(a[i_val][j_val]==0)
                    a[i_val][j_val]=b[k];
                else
                {
                    System.out.println("Already Occupied");
                    continue;
                }
                print_board(a);
                for(j=0;j<3;j++)
                    for(i=0;i<3;i++)
                        s+=a[i][j];
                if(s==21||s==22)
                {
                    System.out.println("Draw");
                    break;
                }
                flag=check(a);
                if(flag==1)
                {
                    System.out.println("Player "+(k+1)+" wins");
                    break;
                }
                k++;
                if(k==2)
                    k=0;
            }
            catch(Exception e)
            {
                System.out.println("Wronhg Input Try Again");
                continue;
            }
        }

    }
}
