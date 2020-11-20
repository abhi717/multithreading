public class ThreadDemo2 implements Runnable
	{
		public void run()
		{
			System.out.println(Thread.currentThread());
			for(char i='A';i<='J';i++)
			{
				System.out.println(i);
			}
			
		}
		
		
		public static void main(String[] args) 
		{
			ThreadDemo td1 = new ThreadDemo();
			ThreadDemo td2 = new ThreadDemo();
			Thread t1 = new Thread(td1);
			Thread t2 = new Thread(td2);
			t1.setName("First");
			t2.setName("Second");
			t1.start();
			t2.start();
			
			
		}

	}
