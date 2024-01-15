package com.javathread;

public class ProducerConsumerExample {
	public static void main(String args[]){
		
		Buffer b = new Buffer();
 
		Producer p = new Producer(b);
		
		Consumer c = new Consumer(b);
 
		p.start();
		c.start();
	}
}
