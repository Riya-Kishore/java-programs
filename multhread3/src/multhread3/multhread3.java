package multhread3;

class Counter {
	static int c=0; //try it without static and also make counter method non-static
	synchronized static void counter(/*String msg*/) {
		for(int i = 0; i<33; i++) {
			System.out.println("value of counter : " +  c++);
		}
	}
}
class NewThread implements Runnable {
	Thread t;
	String s;
	Counter target;

	NewThread(String name, Counter cou) {
		s = name;
		target = cou;
		t = new Thread(this);
		t.start();
	}

	public void run() {
		synchronized (this) {
			Counter.counter();
		}
	}
}

public class multhread3 
{
	public static void main(String[] args) {
		Counter count = new Counter();
		NewThread obj1 = new NewThread("one", count);
		NewThread obj2 = new NewThread("two", count);
		NewThread obj3 = new NewThread("three", count);
		try {
			obj1.t.join();
			obj2.t.join();
			obj3.t.join();
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
	}
}

