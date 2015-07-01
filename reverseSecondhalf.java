package skillrack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class reverseSecondhalf {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str  = br.readLine();
		int len=str.length();
		int lenu=str.length();
		String s1="";
		//case 1 : when even number of characters (use substring next time)
		if(len%2==0)
		{
			int temp=len/2;
			int test=len;
			for(len=test-1;len>=temp;len--)
			{	
				s1=s1+""+str.charAt(len);
			}
			//System.out.println(s1);
			
			String ssd ="";
			for(int i=0;i<lenu/2;i++)
			{ssd=ssd.concat(""+str.charAt(i));}
			
			String anseven=ssd + s1;
			System.out.println(anseven);
		}
		//case 2 : when odd number of characters (use sub string next time)
		
		else
		{	String s2="";
			int temp3=lenu/2;
			int tempt=lenu;
			for(lenu=tempt-1;lenu>=temp3+1;lenu--)
			{
				s2=s2+""+str.charAt(lenu);
			}
			
			
			String hdd ="";
			for(int j=0;j<tempt/2+1;j++)
			{hdd=hdd.concat(""+str.charAt(j));}
			
			String ansodd=hdd + s2;
			System.out.println(ansodd);

		}		
	}
}
