package pyramid;
import java.util.Scanner;
public class pyramid {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i, j, a, b, k;
		b = 1;
		System.out.println("Enter the value of a:- ");
		a = s.nextInt();
		for(k=1; k<=11; k++)
		{
			switch(k)
			{
				case 1 :
						System.out.println("\n\n---------a--------");
						for(i=1; i<=a; i++)
						{
							for(j=1; j<=i; j++)
							{
								System.out.print("*\t");
							}
							System.out.print("\n");
						}
						break;
					
				case 2 :
						System.out.println("\n\n---------b--------");
						for(i=1; i<=a; i++)
						{
							for(j=1; j<=i; j++)
							{
								System.out.print(i +"\t");
							}
							System.out.print("\n");
						}
						break;
						
				case 3 :
						System.out.println("\n\n---------c--------");
						for(i=1; i<=a; i++)
						{
							for(j=1; j<=i; j++)
							{
								System.out.print(j +"\t");
							}
							System.out.print("\n");
						}
						break;
						
				case 4 :
						System.out.println("\n\n---------d--------");
						for(i=1; i<=a; i++)
						{
							for(j=1; j<=i; j++)
							{
								System.out.print(b++ +"\t");
							}
							System.out.print("\n");
						}
						break;

				case 5 :
						System.out.println("\n\n---------e--------");
						for(i=1; i<=a; i++)
						{
							for(j=1; j<=i; j++)
							{
								System.out.print(i+j + "\t");
							}
							System.out.print("\n");
						}
						break;
						
				case 6 :
						System.out.println("\n\n---------f--------");
						for(i=1; i<=a; i++)
						{
							for(j=1; j<=i; j++)
							{
								if((i+j)%2 == 0)
								{
									System.out.print("1\t");
								}
								else
								{
									System.out.print("0\t");
								}
							}
							System.out.print("\n");
						}
						break;
						
				case 7 :
						System.out.println("\n\n---------g--------");
						for(i=1; i<=a; i++)
						{
							for(j=1; j<=i; j++)
							{
								System.out.print(a+1-j + "\t");
							}
							System.out.print("\n");
						}
						break;
					
				case 8:
						System.out.println("\n\n---------h--------");
						for(i=1; i<=a; i++)
						{
							for(j=1; j<=i; j++)
							{	
								System.out.print(a+1-i + "\t");
							}
							System.out.print("\n");
						}
						break;
						
				case 9 :
						System.out.println("\n\n---------i--------");
						for(i=1; i<=a; i++)
						{
							for(j=a; j>=i; j--)
							{
								System.out.print("*\t");
							}
							System.out.print("\n");
						}
						break;
						
				case 10 :
						System.out.println("\n\n---------j--------");
						for(i=1; i<=a; i++)
						{
							for(j=a; j>=i; j--)
							{
								System.out.print(i + "\t");
							}
							System.out.print("\n");
						}
						break;
						
				case 11 :
						System.out.println("\n\n---------k--------");
						for(i=1; i<=a; i++)
						{
							for(j=a; j>=i; j--)
							{
								System.out.print(j + "\t");
							}
							System.out.print("\n");
						}
						break;

				default :
						System.out.println("DONE");
			}			
	}	
}
}
