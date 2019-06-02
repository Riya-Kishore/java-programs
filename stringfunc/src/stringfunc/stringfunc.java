package stringfunc;
import java.util.*;
public class stringfunc
{
	public static void main(String[] args)
	{
		String s1,s2; int a; String b;
		Scanner s = new Scanner(System.in);
		System.out.println("Choices you have on String");
		System.out.println("1. String Compare\n2. String Concatenation\n3. Trimming\n4. Into uppercase\n5. Into lowercase\n6. Is string empty\n7. Find substring\n8. IgnoreCase\n9. Find hashcode\n10. Check whether strings are equal or not\n11. Check whether strings are equal or not(Ignore case)\n12. Length of the string");
		System.out.println("13. String matches\n14. Find Character position\n15. Find character position(in unicode)\n16. String Contains\n17. String split\n18. Character replacement");
		do
		{
			System.out.println("Enter your choice");
			a = s.nextInt();
			switch(a)
			{
				case 1: System.out.print("Enter the strings to compare - ");
						s1 = s.next();
						s2 = s.next();
						if(0 == s1.compareTo(s2))
						{
							System.out.println("String are same");
						}
						else
						{
							System.out.println("Strings are different");
						}
						break;
				case 2: System.out.print("Enter the strings to concatenate - ");
						s1 = s.next();
						s2 = s.next();
						System.out.println(s1.concat(" ").concat(s2));
						break;
				case 3: System.out.print("Enter the string to be trimmed - ");
						s1 = s.next();
						System.out.println(s1.trim());
						break;
				case 4: System.out.print("Enter the string - ");
						s1 = s.next();
						System.out.println(s1.toUpperCase());
						break;
				case 5: System.out.print("Enter the string - ");
						s1 = s.next();
						System.out.println(s1.toLowerCase());
						break;
				case 6: System.out.print("Enter the string - ");
						s1 = s.next();
						System.out.println(s1.isEmpty());
						break;
				case 7: System.out.print("Enter the string and position of substring - ");
						s1 = s.next();
						int x1 = s.nextInt();
						System.out.println(s1.substring(x1)); //or System.out.println(s1.substring(3,6));
						break;
				case 8: System.out.print("Enter the strings to compare - ");
						s1 = s.next();
						s2 = s.next();
						if(0 == s1.compareToIgnoreCase(s2))
						{
							System.out.println("String are same");
						}
						else
						{
							System.out.println("Strings are different");
						}
						break;
				case 9: System.out.print("Enter the string - ");
						s1 = s.next();
						System.out.println(s1.hashCode());
						break;
				case 10: System.out.print("Enter the strings - ");
						s1 = s.next();
						s2 = s.next();
						System.out.println(s1.equals(s2));
						break;
				case 11: System.out.print("Enter the strings - ");
						s1 = s.next();
						s2 = s.next();
						System.out.println(s1.equalsIgnoreCase(s2));
						break;
				case 12: System.out.print("Enter the string - ");
						s1 = s.next();
						System.out.println(s1.length());
						break;
				case 13: System.out.print("Enter the string - ");
						s1 = s.next();
						s2 = s.next();
						System.out.println(s1.matches(s2)); //ask??????????
						break;
				case 14: System.out.print("Enter the string - ");
						s1 = s.next();
						int x2 = s.nextInt();
						System.out.println(s1.charAt(x2));
						break;
				case 15: System.out.print("Enter the string - ");
						s1 = s.next();
						int x3 = s.nextInt();
						System.out.println(s1.codePointAt(x3));
						break;
				case 16: System.out.print("Enter the string - ");
						s1 = s.next();
						s2 = s.next();
						System.out.println(s1.contains(s2));
						break;
				case 17: System.out.print("Enter the string - ");
						s1 = s.next();
						s2 = s.next();
						System.out.println(s1.split(s2));//check
						break;
				case 18: System.out.print("Enter the string - ");
						s1 = s.next();
						String old = s.next();
						String neww = s.next();
						System.out.println(s1.replace(old,neww));
						break;
			}
			System.out.println("Do you want to exit (y/n)");
			b = s.next(); //for string without whitespaces
		}while(b.equals("n"));
	}
}