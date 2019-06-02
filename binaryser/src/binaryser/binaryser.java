package binaryser;
import java.util.Scanner;
class binary{
	int check (String s[],String n)
	{
		int first=0,last=s.length-1,mid;
		while(first<=last)
		{
			mid=(first+last)/2;
			if(n.compareTo(s[mid])<0)
				first=mid+1;
			else if(n.compareTo(s[mid])>0)
				last=mid-1;
			else
				return(mid);
		}
		return(-1);
	}
}
public class binaryser
{
	public static void main(String args[])
	{
		String str[]=new String[5];
		String name=new String();
		int i,res=0;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the string array : ");
		for(i=0;i<5;i++)
			str[i]=s.nextLine();
		System.out.println("Enter the name to search : ");
		name=s.nextLine();
		binary obj=new binary();
		res=obj.check(str,name);
		if(res==1)
			System.out.println("String not found");
		else
			System.out.println("String found at "+(res+1)+" position");

	}
}

