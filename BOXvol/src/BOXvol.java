import java.util.Scanner;
class box 
{
	int height;
	int width;
	int depth;	
	box(int h,int w, int d ) //
	{
		height = h;
		width = w;
		depth= d;
	}
	int display () 
	{
		 int volume = height*width*depth ;
		 return volume;
	}
		
}
public class BOXvol
{
	
	public static void main(String[] args) 
	{
		int vol;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter height :");
		int a = sc1.nextInt();
		System.out.println("Enter width :");
		int b =sc1.nextInt();
		System.out.println("Enter depth :");
		int c = sc1.nextInt();
		box obj1 = new box(a,b,c);
		vol = obj1.display();
		System.out.println("the volume is :"+vol);
	}

}
