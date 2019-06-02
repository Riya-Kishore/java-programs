package armstrong;
import java.util.Scanner;

public class armstrong 
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count, temp, quo, rem, num, sum;
		count = 0;
		sum = 0; 
		
		System.out.println("Enter Number :- ");
		num = s.nextInt();
		temp = num;
		while(count <= temp)
		{
			quo = num/10;
			rem = num%10;
			rem = rem*rem*rem;
			sum = sum + rem;
			num = quo;
			count++;
		}
		System.out.println("Sum of cube of digits of a given number (" + temp + ") is = " + sum);
		if(sum == temp)
		{
			System.out.println("Entered Number (" + temp + ") is an Armstrong number");
		}
		else
		{
			System.out.println("Entered Number (" + temp + ") is not a Armstrong number");
		}
	}
}
