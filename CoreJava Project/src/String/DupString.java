package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DupString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next().toLowerCase(),dupStr="";
		int l=s.length(),count=0;
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count=count+1;
					
				}
				
			}
			if(count>0)
				dupStr=dupStr+s.charAt(i)+" "+(count+1);
			count=0;
		}
		if(dupStr!="")
			System.out.println("The duplicate Strings are "+"\""+dupStr+"\"");
		else
			System.out.println("No duplicate characters");
		sc.close();
	}
}