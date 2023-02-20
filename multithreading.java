 class MyThread extends Thread {

	public void run() {
		System.out.println("runmethod started");
		for (int i = 1; i <=25; i++) {
			System.out.println(i+" time in run");
		}
	}
}
public class multithreading {
     
	 public static void main(String[] args) {
     MyThread m1=new MyThread();
     System.out.println(m1.getName());
     m1.setName("varsha");
     System.out.println(m1.getName());
     m1.start();
     System.out.println(m1.getState()+"state");
     for (int i = 1; i <=20; i++) {
		System.out.println(i+" in main");
	}
}
}
