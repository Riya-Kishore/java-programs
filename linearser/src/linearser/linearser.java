package linearser;
import java.util.Scanner;
class linears{
	void check (String s[],String n)
	{
		int i,x=0,j=0;
		for(i=0;i<s.length;i++)
		{
			if(s[i].equals(n))
			{
				x=1;
				j=i;
				break;
			}
		}
		if(x==1)
			System.out.print("The string "+n+" is found at "+(j+1)+" position");
		else
			System.out.print("The string is not found");
	}
}
public class linearser
{
	public static void main(String args[])
	{
		String str[]=new String[5];
		String name=new String();
		int i;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the string array : ");
		for(i=0;i<5;i++)
			str[i]=s.nextLine();
		System.out.println("Enter the name to search : ");
		name=s.nextLine();
		linears obj=new linears();
		obj.check(str,name);

	}

}

