package thread4;
//This program is not synchronized.
class Callme {
	 void call(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
		System.out.println("]");
	}
	//void cal(String msg) { System.out.println("1 " + msg); } //can be called by other threads
	//synchronized void cal(String msg) { System.out.println("1 " + msg); } //can't be called by other threads
}

class Caller implements Runnable {
	String msg;
	Callme target;
	Thread t;

	public Caller(Callme targ, String s) {
		target = targ;
		msg = s;
		t = new Thread(this);
		t.start();
	}

	static synchronized void hello(Callme t,String msg) {
		t.call(msg);
	}
	/*
	 * public void run() { synchronized(target) { target.call(msg); }
	 * //target.cal(msg); }
	 */
	 
	  synchronized public void run() { //why synchronized run() and normal void
	  //call() method target.call(msg); //won't provide synchronization?????????
		  hello(target,msg);
	     //target.call(msg); 
	  }
	 
}

class thread4{
	public static void main(String args[]) {
		Callme target = new Callme();
		Caller ob1 = new Caller(target, "Hello");
		Caller ob2 = new Caller(target, "Synchronized");
		Caller ob3 = new Caller(target, "World");

/*		Callme target = new Callme();
		Callme target1 = new Callme();
		Caller ob1 = new Caller(new Callme(), "Hello");//different object have different monitors
		Caller ob2 = new Caller(target1, "Synchronized");//therefore lock  is different and hence
		Caller ob3 = new Caller(target, "World"); //cannot be synchronized*/
//wait for threads to end
		try {
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
	}
}

