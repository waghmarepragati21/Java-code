package lab_20_Oct;

public class Threading  extends Thread{

		public void thread()
		{
			System.out.println("This code is running in a thread");
		}

		public static void main(String[] args) {
			
			Threading t1 = new Threading();
			Threading t2= new Threading();
			
			System.out.println("Name of t1:"+t1.getName());
			System.out.println("Name of t1:"+t2.getName());
			
			
			t1.start();
			t2.start();
			
			t1.setName("Pragati");
			t2.setName("Waghmare");
			
			System.out.println("After changing thread name :"+t1.getName());
			System.out.println("After change thread name :"+t2.getName());
			
			
		}

}
