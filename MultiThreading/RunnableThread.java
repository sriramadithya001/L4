class MyThread implements Runnable {
    public void run() {
	for(int i=0;i<5;i++) {
	    System.out.println(i);
	    try {Thread.sleep(500);} catch(InterruptedException e) {}
        }
    }
}

public class RunnableThread {
    public static void main(String[] args) {
	MyThread mythread = new MyThread();
	MyThread mythread2 = new MyThread();
	Thread thread = new Thread(mythread);
	Thread thread2 = new Thread(mythread2);
	thread.start();
	thread2.start();
    }
}