package fiboseries;
import java.util.Scanner;

public class fiboseries {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b, n, i, next;
		System.out.println("Enter Number :- ");
		n = s.nextInt();
		a = 0;
		b = 1;
		System.out.print("Fibonacci Series Generated :- \n" + a + "\t");
		for(i=0; i<=n; i++)
		{
			next = a+b;
			System.out.print(next + "\t");
			a = b;
			b = next;
		}
	}

}
