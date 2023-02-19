class GreetThread extends Thread {
	private Greet greet;
	private String name;
	public GreetThread(Greet greet, String name) {
		this.greet = greet;
		this.name = name;
	}
	@Override
	public void run() {
		greet.greeting(name);
	}

}
 class Greetting {
	public synchronized void greeting(String name) {
		for(int i=1;i<=10;i++) {
			System.out.print("Good Afternoon : ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
}
public class Greet {

	public static void main(String[] args) {
			Greetting g1 = new Greetting();
			Greetting g2 = new Greetting();
			GreetThread gt1 = new GreetThread(g1, "Ramu");
			GreetThread gt2 = new GreetThread(g1, "Shyamu");
			
			gt1.start();
			gt2.start();
	}

}
