package copyfile;
import java.io.*;

class FILEIO {
	public static int i;
	boolean varset = false;
	FileInputStream fin;
	FileOutputStream fout;

	FILEIO(FileInputStream fin, FileOutputStream fout) {
		this.fin = fin;
		this.fout = fout;
	}

	synchronized int writing() throws IOException {
		while (!varset) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException Caught");
			}
		}
		if (-1 != i) {
			fout.write(i);
		}
		varset = false;
		notify();
		return i;
	}

	synchronized void reading(int in) throws IOException {
		while (varset) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException Caught");
			}
		}
		in = fin.read();
		i = in;
		varset = true;
		notify();
	}

}

class InputFile implements Runnable {
	Thread t;
	String name;
	FILEIO target;
	int i;

	InputFile(String s, FILEIO ob) {
		name = s;
		target = ob;
		t = new Thread(this);
		t.start();
	}

	public void run() {
		try {
			do {
				i = FILEIO.i;
				target.reading(i);
			} while (-1 != i);
		} catch (IOException e) {
			System.out.println("IOException");
		}
	}
}

class OutputFile implements Runnable {
	Thread t;
	String name;
	FILEIO target;
	int i;

	OutputFile(String s, FILEIO ob) {
		name = s;
		target = ob;
		t = new Thread(this);
		t.start();
	}

	public void run() {
		i = FILEIO.i;
		try {
			do {
				this.i = target.writing();
			} while (-1 != i);
		} catch (IOException e) {
			System.out.println("IOException");
		}
	}
}

public class copyfile {
	public static void main(String[] args) throws IOException {
		FileInputStream fin;
		FileOutputStream fout;
		try {
			try {
				fin = new FileInputStream(args[0]);
			} catch (FileNotFoundException e) {
				System.out.println("Input File Not Found");
				return;
			}
			try {
				fout = new FileOutputStream(args[1]);
			} catch (FileNotFoundException e) {
				System.out.println("Error Opening Output File");
				return;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Usage: CopyFile From To");
			return;
		}
		FILEIO obj = new FILEIO(fin, fout);
		InputFile ob1 = new InputFile("Input thread", obj);
		OutputFile ob2 = new OutputFile("Output thread", obj);
		try {
			ob1.t.join();
			ob2.t.join();
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
		fin.close();
		System.out.println("FILE IN CLOSED");
		fout.close();
		System.out.println("FILE OUT CLOSED");
	}
}
