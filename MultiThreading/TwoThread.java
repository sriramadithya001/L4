class MyThread extends Thread {
    public MyThread(String name) {
	super(name);
    }

    public void run() {
	System.out.println(getName() + " is running");
    }
}

public class TwoThread {
    public static void main(String[] args) {
	MyThread t1 = new MyThread("thread1");
	MyThread t2 = new MyThread("thread2");

	t1.start();
	t2.start();

        System.out.println("Thread1 Alive : " + t1.isAlive());
        System.out.println("Thread2 Alive : " + t2.isAlive());
    }
}