import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RotateMatrix {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		double br=sc.nextDouble();
		double buy=sc.nextDouble();
		double sell=sc.nextDouble();
		double quantity=sc.nextDouble();
		//test for input
		//(double)Math.round(value * 100000) / 100000
		//buying scene
		double taxonbuy=(buy*quantity*br)/100;
		double servicetax=(double)Math.round(((taxonbuy*10.36)/100)* 100) / 100;
		double taxb=taxonbuy+servicetax;
		//selling scene
		double taxonsell=(sell*quantity*br)/100;
		double servicetaxs=(taxonsell*10.36)/100;
		double stt=(sell*quantity*0.025)/100;
		double taxs=taxonsell+servicetaxs+stt;
		//total broke
		double misccharges=((buy*quantity+sell*quantity)*0.006)/100;
		double totalb=taxb+taxc+misccharges;
		double pl=(sell-buy)*quantity;
		if(pl>0)
		{
			System.out.print("Profit"+(pl-totalb));
		}
		else{
				System.out.print("Loss"+(Math.abs(pl)+totalb));
		}

	}

}