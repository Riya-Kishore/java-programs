package sumdigit;

import java.util.Scanner;

public class sumdigit {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count, temp, quo, rem, num, sum;
		count = 1;
		sum = 0; 
		System.out.println("Enter Number :- ");
		num = s.nextInt();
		temp = num;
		while(count <= temp)
		{
			quo = num/10;
			rem = num%10;
			sum = sum + rem;
			num = quo;
			count++;
		}
		System.out.println("Sum of digits of a given number (" + temp + ") is = " + sum);
	}


}
