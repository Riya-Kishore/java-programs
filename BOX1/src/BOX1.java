class test {
	int y,x;
	test(){
		System.out.println("No Parameters.");
	}

	test(int a,int y)
	{
		x = a;
		this.y=y;
		System.out.println("First Parameter: " + x);
		System.out.println("Second Parameter: " + y);
	}

	test(test obj)
	{
		x = 50;
		System.out.println(x == obj.x);
	}
}
public class BOX1
{
	public static void main(String[] args) {
		test myobj = new test();
		test obj = new test(5,10);
		test obj2 = new test(obj);
	}

}
