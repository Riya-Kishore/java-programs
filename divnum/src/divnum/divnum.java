package divnum;
import java.util.Scanner;
public class divnum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b, sub, quo, rem, temp;
		quo = 0;
		System.out.println("Enter Number 1 :- ");
		a = s.nextInt();
		System.out.println("Enter Number 2 :- ");
		b = s.nextInt();
		temp = a;
		while(a>=b)
		{
			sub = a-b;
			a= sub;
			quo++;
		}
		rem = a % b;
		System.out.println("Division of Numbers ( " + temp + " and " + b + ") is =\n");
		System.out.println("Quotient = " + quo + " Remainder = " + rem );
	}

}
