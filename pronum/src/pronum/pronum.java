package pronum;
import java.util.Scanner;

public class pronum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b, i, sum;
		sum = 0;
		System.out.println("Enter Number 1 :- ");
		a = s.nextInt();
		System.out.println("Enter Number 2 :- ");
		b = s.nextInt();
		for(i=0; i<a; i++)
		{
			sum = sum + b;
		}
		System.out.println("Product of Numbers (" +  a + " and " + b + ") is = " + sum);
	}

}
