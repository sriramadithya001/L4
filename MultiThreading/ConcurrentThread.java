class ChildThread extends Thread {
    public ChildThread(String name) {
	super(name);
    }

    public void run() {
        for(int i=0;i<5;i++) {
	    System.out.println(i);
	    try {Thread.sleep(1000);} catch(InterruptedException e) {}
        }
    }
}

public class ConcurrentThread {
    public static void main(String[] args) {

	ChildThread childthread = new ChildThread("chid");
	System.out.println(childthread.getPriority());
	childthread.start();

	Thread mainthread = Thread.currentThread();
	System.out.println(mainthread.getPriority());

	for(int i=0;i<5;i++) {
	    System.out.println(i);
	    try {Thread.sleep(1000);} catch(InterruptedException e) {}
	}
	
    }
}