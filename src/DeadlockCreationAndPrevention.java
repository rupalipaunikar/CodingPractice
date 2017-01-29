
public class DeadlockCreationAndPrevention {

	public static void main(String[] args) {
		System.out.println("Main initiated...");
		
		ThreadGroup tg1 = new ThreadGroup("Group1");
		ThreadGroup tg2 = new ThreadGroup("Group2");
		Thread t1[] = new Thread[20];
		Thread t2[] = new Thread[20];
		
		for(int i=0; i<20; i++){
			t1[i] = new Thread(tg1, new MyThread1("MyThread1 - "+i));
			t2[i] = new Thread(tg2, new MyThread2("MyThread2 - "+i));
		}
		
		for(int i=0; i<20; i++){
			t1[i].start();
			t2[i].start();
		}
		
		
		System.out.println("Main terminated...");
	}

}

class MyThread1 implements Runnable{

	String str;
	
	public MyThread1(String str) {
		super();
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}


	@Override
	public void run() {
		System.out.println(str +" initiated...");
		synchronized(String.class){
			synchronized(Integer.class){
			}
		}
		System.out.println(str +" terminated...");
	}
	
}

class MyThread2 implements Runnable{

String str;
	
	public MyThread2(String str) {
		super();
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	@Override
	public void run() {
		System.out.println(str +" initiated...");
		synchronized(String.class){
			synchronized(Integer.class){
			}
		}
		System.out.println(str +" terminated...");
	}
	
}