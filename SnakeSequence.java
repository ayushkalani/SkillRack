package skillrack;
import java.util.*;
import java.io.*;
public class SnakeSequence
{
	ArrayList<Integer> maxseq;
	ArrayList<Integer> ans1;
	int maxscore;
	ArrayList<ArrayList<Integer>> allseq;
	String inp;
	int num[];
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String line=sc.nextLine()+" ";
		String parts[]=line.split(" ");
		int n[]=new int[parts.length];
		for(int i=0;i<parts.length;i++)
			n[i]=Integer.parseInt(parts[i]);
		SnakeSequence obj=new SnakeSequence(n,line);
		obj.start();
	}
	public SnakeSequence(int num[],String inp)
	{
		this.num=num;
		this.inp=inp;
		maxseq=new ArrayList<Integer>();
		allseq= new ArrayList<ArrayList<Integer>>();
	}
	public void start()
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<num.length;i++)
			list.add(num[i]);
		ArrayList<Integer> check=new ArrayList<Integer>();
		for(int i=0;i<num.length;i++)
		{
			if(!check.contains(num[i]))
			{
				ArrayList<Integer> temp = new ArrayList<Integer>(list);
				int start=num[i];
				temp.remove(new Integer(start));
				ArrayList<Integer> startlist = new ArrayList<Integer>();
				startlist.add(num[i]);
				rnr(temp,startlist,start);
				check.add(num[i]);
			}
		}
		refine();
		maxscore=0;
		int occur=0;
		for(ArrayList<Integer> curr:allseq)
		{
			int i=getScore(curr);
			if(i>maxscore)
			{
				occur=1;
				maxscore=i;
				ans1=curr;
			}
			else if(i==maxscore)
				occur++;
		}
		if(occur==1)
			for(int x:ans1)
				System.out.print(x+" ");
		else
		{
			getone();
			getawesome();
		}
	}
	public void rnr(ArrayList<Integer> remaining,ArrayList<Integer> currentlist,int last)
	{
		if(currentlist.size()>maxseq.size())
		{
			maxseq=currentlist;
			allseq.add(currentlist);
		}
		else if(currentlist.size()==maxseq.size())
			allseq.add(currentlist);
		if(remaining.contains(last+1))
		{
			ArrayList<Integer> remainingnew = new ArrayList<Integer>(remaining);
			remainingnew.remove(new Integer(last+1));
			ArrayList<Integer> currentlistnew = new ArrayList<Integer>(currentlist);
			currentlistnew.add(last+1);
			rnr(remainingnew,currentlistnew,last+1);
		}
		if(remaining.contains(last-1))
		{
			ArrayList<Integer> remainingnew = new ArrayList<Integer>(remaining);
			remainingnew.remove(new Integer(last-1));
			ArrayList<Integer> currentlistnew = new ArrayList<Integer>(currentlist);
			currentlistnew.add(last-1);
			rnr(remainingnew,currentlistnew,last-1);
		}
	}
	public void refine()
	{
		ArrayList<ArrayList<Integer>> newallseq=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<allseq.size();i++)
			if(allseq.get(i).size()!=maxseq.size())
				newallseq.add(allseq.get(i));
		for(ArrayList<Integer> current:newallseq)
			allseq.remove(current);
	}
	public void getawesome()
	{
		int max=maxcomm(maxseq);
		for(int i=0;i<allseq.size();i++)
		{
			ArrayList<Integer> curr=allseq.get(i);
			if(maxcomm(curr)>max)
			{
				maxseq=curr;
				max=maxcomm(curr);
			}
		}
	}
	public void getone()
	{
		int i=0,j=0;
		while(allseq.size()>1)
		{
			int current=num[i];
			ArrayList<ArrayList<Integer>> newallseq=new ArrayList<ArrayList<Integer>>();
			for(ArrayList<Integer> currentlist:allseq)
				if(currentlist.get(j)==current)
					newallseq.add(currentlist);
			if(newallseq.size()==0)
				i++;
			else
			{
				i++;
				j++;
				allseq=newallseq;
			}
			if(i==num.length)
				i=0;
			if(j==maxseq.size())
				j=0;
		}
		for(int x:allseq.get(0))
			System.out.print(x+" ");
	}
	public int maxcomm(ArrayList<Integer> curr)
	
	{	int comm=0;
		String test="";
		int i=0;
		int x=0;
		while(i<curr.size())
		{
			test="";
			for(;i<curr.size();i++)
			{
				String oldtest=test;
				test+=curr.get(i)+" ";
				if(inp.contains(test))
					x++;
				else
				{
					if(x==0)
						comm=oldtest.length()-2;
					else
						comm+=oldtest.length()-2;
					break;
				}
			}
		}
		return comm;
	}
	public int getScore(ArrayList<Integer> curr)
	{
		String input=inp;
		String temp="";
		int score=0;
		for(int i=0;i<curr.size();i++)
		{
			String oldtemp=temp;
			temp+=curr.get(i)+" ";
			if(!input.contains(temp.trim()))
			{
				if(oldtemp.trim().length()>2)
				{
					score+=oldtemp.trim().length();
					input=input.replace(oldtemp,"");
				}
				temp="";
				temp+=curr.get(i)+" ";
			}
			if(i==(curr.size()-1))
				if(input.contains(temp.trim()) && temp.trim().length()>2)
					score+=temp.trim().length();
		}
		return score;
	}
}