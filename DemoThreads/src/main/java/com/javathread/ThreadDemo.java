package com.javathread;


public class ThreadDemo implements Runnable{
	public void run(){  
		System.out.println("thread is running...");  
		}  
		  
		public static void main(String args[]){  
			ThreadDemo td1=new ThreadDemo();  
		Thread t1 =new Thread(td1);   
		t1.start();  
		 }  
}