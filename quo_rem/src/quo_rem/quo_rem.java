package quo_rem;
import java.util.Scanner;

public class quo_rem {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num, num1, quo, rem;
		System.out.println("Enter Number 1 :- ");
		num = s.nextInt();
		System.out.println("Enter Number 2 :- ");
		num1 = s.nextInt();
		if(num1==0)
		{
			System.out.println("Denominator is zero");
		}
		else
		{
			System.out.println("Denominator = " + num1);
			quo = num/num1;
			System.out.println("Quotient = " + quo);
			rem = num%num1;
			System.out.println("Remainder = " + rem);
		}
	}

}
