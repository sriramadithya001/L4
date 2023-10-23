class StringThread extends Thread {
    public StringThread(String name) {
	super(name);
    }

    public void run() {
	String s[] = {"java", "is", "a", "hot", "aromatic", "and", "invigorating"};
	for(int i=0;i<7;i++) {
	    System.out.println(getName() + " : " + s[i]);
	    try {Thread.sleep(1000);} catch(InterruptedException e) {}
	}
    }
}

public class DisplayString {
    public static void main(String[] args) {
	StringThread t1 = new StringThread("thread1");
	StringThread t2 = new StringThread("thread2");

	t1.start();
	t2.start();
    }
}