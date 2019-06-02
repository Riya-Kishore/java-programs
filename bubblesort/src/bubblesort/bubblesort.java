package bubblesort;
import java.util.Scanner;
public class bubblesort {
	public static void main(String args[])
	{
		int i,j,temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		int n=sc.nextInt();
		System.out.println("Enter the elements of the array : ");
		int num[]=new int[n];
		for(i=0;i<n;i++)
			num[i]=sc.nextInt();
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-1-i;j++)
			{
				if(num[j]>num[j+1])
				{
					temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
		System.out.println("The sorted array in ascending order is :");
		for(i=0;i<n;i++)
			System.out.print(num[i]+" ");
	}
}
