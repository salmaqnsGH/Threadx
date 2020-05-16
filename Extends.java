package com.d3ti.pboLanjut20.thread;

public class Extends extends Thread {
	public Extends(String nama) {
		super(nama);
	}
	
	public void run() {
		for(int i=0;i<4;i++) {
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread " + getName() + " posisi " +i);
	}
}
}
