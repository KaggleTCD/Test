package com.test;

public class DeadLock {

	public static void main(String[] args) {
	
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
		
	}
	
	private static class Thread1 extends Thread{
		
		
		public void run() {
			
			synchronized (String.class) {
				
				System.out.println("Thread 1 String");
				try { Thread.sleep(5000); }
	            catch (InterruptedException e) {}
	            System.out.println("Thread 1: Waiting for lock 2...");
	            
	        	synchronized (Integer.class) {
					
					System.out.println("Thread 1 Integer");
				}
			}
			
		
		}
	}
	
	private static class Thread2 extends Thread{
		
		
		public void run() {
			
			synchronized (Integer.class) {
				
				System.out.println("Thread 2 Integer");
				try { Thread.sleep(5000); }
	            catch (InterruptedException e) {}
	            System.out.println("Thread 2: Waiting for lock 1...");
	            
	        	synchronized (String.class) {
					
					System.out.println("Thread 2 String");
				}
			}
			
		
			
		
		}
	}

}
