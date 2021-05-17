package String;

public class RevSen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="raja ram keshari";
String s1[]=s.split(" ");
String s2="";
String s3="";
for(int i=s1.length-1;i>=0;i--)
{
	s2+=s1[i]+" ";
}
System.out.println(s2);
for(int j=s.length()-1;j>=0;j--) {
	s3+=s.charAt(j);
}
System.out.println(s3);
	}

}
