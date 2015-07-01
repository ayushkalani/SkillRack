import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class typeoftriangle {

	public static void main(String[] args) throws IOException {
	Scanner sc =new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	if(a==b&&b==c)
	{System.out.print("equilateral");}
	else if(a!=b&&b!=c&&c!=a)
	{System.out.print("scalene");}
	else{System.out.print("issoelses");}

	
		

}
}