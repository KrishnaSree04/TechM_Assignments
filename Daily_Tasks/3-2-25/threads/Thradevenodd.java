package Files;
	class Even extends Thread {
	    public void run() {
	        for (int i = 2; i <= 20; i += 2) {
	            System.out.println("Even: " + i);
	            try { 
	            	Thread.sleep(500); 
	            	} catch (InterruptedException e) {
	            		e.printStackTrace(); }
	        }
	    }
	}

	class Odd extends Thread {
	    public void run() {
	        for (int i = 1; i <= 20; i += 2) {
	            System.out.println("Odd: " + i);
	            try {
	            	Thread.sleep(500);
	            	} 
	            catch (InterruptedException e) {
	            	e.printStackTrace(); }
	        }
	    }
	}

	public class Thradevenodd {
	    public static void main(String[] args) {
	        Even evenTh = new Even();
	        Odd oddTh = new Odd();

	        evenTh.start(); 
	        oddTh.start(); 
	    }
	}
