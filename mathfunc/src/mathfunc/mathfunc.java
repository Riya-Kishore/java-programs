package mathfunc;
import java.lang.Math;
//import java.util.*;
import java.util.Scanner;
public class mathfunc
{
	public static void main(String[] args)
	{
		String b; int a,val1;
		long val3;
			System.out.println("Choices you have -");
			System.out.print("1. Square root\n2. Power\n3. sin\n4. cos\n5. tan\n6. Expoenetial\n7. Log\n");
			System.out.println("8. Log10 \n9. Roundoff \n10. Absolute value \n11. Maximum of two numbers \n12. Minimum of two numbers\n");		
			Scanner s = new Scanner(System.in);
			do
			{
				System.out.println("Enter your choice");
				a = s.nextInt();
				switch(a)
				{
					case 1: System.out.print("Enter the value whose sq. root has to be calculated - ");
							val1 = s.nextInt();
							System.out.println("Square of no " + val1 + " is " + Math.sqrt(val1));
							break;
					case 2: System.out.println("Enter the value and its power -");
							val1 = s.nextInt();
							int val2 = s.nextInt();
							System.out.println(val1 + " to the power of " + val2 + " is " + Math.pow(val1,val2));
							break;
					case 3: System.out.println("Enter the value -");
							val1 = s.nextInt();
							System.out.println("sin(" + val1 + ") is " + Math.sin(val1));
							break;
					case 4: System.out.println("Enter the value -");
							val1 = s.nextInt();
							System.out.println("cos(" + val1 + ") is " + Math.cos(val1));
							break;
					case 5: System.out.println("Enter the value -");
							val1 = s.nextInt();
							System.out.println("tan(" + val1 + ") is " + Math.tan(val1));
							break;
					case 6: System.out.println("Enter the value -");
							val1 = s.nextInt();
							System.out.println("exp(" + val1 + ") is " + Math.exp(val1));
							break;
					case 7: System.out.println("Enter the value -");
							val1 = s.nextInt();
							System.out.println("log(" + val1 + ") is " + Math.log(val1));
							break;
					case 8: System.out.println("Enter the value -");
							val1 = s.nextInt();
							System.out.println("log10(" + val1 + ") is " + Math.log10(val1));
							break;
					case 9: System.out.println("Enter the value -");
							val3 = s.nextLong(); 
							System.out.println("Roundoff(" + val3 + ") - " + Math.round(val3));
							break;
					case 10: System.out.println("Enter the value -");
							float val4 = s.nextInt();
							System.out.println("|" + val4 + "| is " + Math.abs(val4));
							break;
					case 11: System.out.println("Enter the two values -");
							val1 = s.nextInt();
							val2 = s.nextInt();
							System.out.println("Maximum number is " + Math.max(val1,val2));
							break;
					case 12: System.out.println("Enter the two values -");
							val1 = s.nextInt();
							val2 = s.nextInt();
							System.out.println("Minimum number is " + Math.min(val1,val2));
							break;
				}
				System.out.println("Do you want to exit (y/n)");
			b = s.next(); //for string without whitespaces
		}while(b.equals("n"));
						
	}
}

