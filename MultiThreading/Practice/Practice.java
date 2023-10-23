import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
class Num extends Thread {
    public void run() {
	try {
	    File file = new File("C:\\Users\\ADMIN\\Desktop\\Incubation\\L4\\MultiThreading\\threadfile.txt");
	    if(file.createNewFile()) {
		FileWriter writer = new FileWriter("threadfile.txt");
		for(int i=0;i<10;i++) {
		    System.out.print(i);
		    writer.write(i + " ");
		    try {Thread.sleep(1000);} catch(InterruptedException e) {}
	        }
	    writer.close();
	    }
	    else {
		System.out.println("File already created");
	    }
	}
	catch(IOException e) {
	    System.out.println("Error occured in file"); 
	}
    }
}

class MyThread implements Runnable {
    public void run() {
	for(int i=0;i<5;i++) {
	    System.out.println(i);
	    try {Thread.sleep(1000);} catch (InterruptedException e) {}
	}
    }
}
*/

class Table {
    void multiple(int n) {
	for(int i=1;i<=5;i++) {
	    System.out.println(n * i);
	    //try {Thread.sleep(1000);} catch(InterruptedException e) {}
	}
    }
}

class MyThread extends Thread {

    public void run() {
	Table table = new Table();
	for(int i=1;i<=3;i++) {
	    table.multiple(i);
	}
    }
}

public class Practice {
    public static void main(String[] args) {
	/*Num num = new Num();
	num.start();
	MyThread mythread = new MyThread();
	new Thread(mythread).start();*/


	MyThread mythread = new MyThread();
	mythread.start();
    }
}