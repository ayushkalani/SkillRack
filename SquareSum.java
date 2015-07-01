package skillrack;

import java.util.Scanner;

public class SquareSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(""+Math.pow((a+b), 2));
	}

}
