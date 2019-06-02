package factorial;
import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num, temp, factt;
		factt = 1;
		System.out.println("Enter Number :- ");
		num = s.nextInt();
		temp = num;
		while(num>=1)
		{
			factt=factt*num;
			--num;
		}
		System.out.println("Factorial of a  number- " + temp + " is = " + factt);
	}

}
