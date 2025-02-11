package Files;

	class MyThread extends Thread {
	    public void run() {
	        System.out.println("Hello!");
	    }
	}
	public class basic_thread {
		public static void main(String[] args) {
	        MyThread thread = new MyThread(); 
	        thread.start(); 
	    }
	}
