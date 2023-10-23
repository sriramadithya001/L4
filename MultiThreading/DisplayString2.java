class StringThread implements Runnable {
    private String ThreadName;

    public StringThread(String name) {
	this.ThreadName = name;
    }

    public void run() {
	String s[] = {"java", "is", "a", "hot", "aromatic", "and", "invigorating"};
	for(int i=0;i<7;i++) {
	    System.out.println(this.ThreadName + " : " + s[i]);
	    try {Thread.sleep(1000);} catch(InterruptedException e) {}
	}
    }
}

public class DisplayString2 {
    public static void main(String[] args) {
	StringThread st1 = new StringThread("thread1");
	StringThread st2 = new StringThread("thread2");

	Thread t1 = new Thread(st1);
	Thread t2 = new Thread(st2);

	t1.start();
	t2.start();
    }
}