package leapyear;
import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num;
		System.out.println("Enter Year :- ");
		num = s.nextInt();	
		if(num%4==0)
		{
			System.out.println("Year:- " + num + " is a leap year");
		}
		else
		{
			System.out.println("Year:- " + num + " is not a leap year");
		}
	}

}
