package String;

import java.util.Scanner;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a string");
Scanner sc=new Scanner(System.in);
String s1=sc.next();
String s2="";
for(int i=s1.length()-1;i>=0;i--)
{
	s2+=s1.charAt(i);
	
}
System.out.println("the rev string is:"+s2);
if(s1.equals(s2))
{
	System.out.println("it is pallindrome");
}
else System.out.println("not a pallindrom");
	}

}
