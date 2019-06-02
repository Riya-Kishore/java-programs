package strpal;
import java.util.Scanner;
class palins 
{
	String check (String s)
	{
		int i;
		String str1=new String();
		for(i=s.length()-1;i>=0;i--) 
		{
			str1=str1+s.charAt(i);
		}
	return(str1);
}
}
public class strpal{
	public static void main(String args[])
	{
		String str;
		String res=new String();
		Scanner s= new Scanner (System.in);
		System.out.print("Enter the string : ");
		str=s.nextLine();
		palins obj= new palins();
		res=obj.check(str);
		if(res.equals(str))
			System.out.print("The string is palindrome");
		else
			System.out.print("The string is not palindrome");
	}
}
