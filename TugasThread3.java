package com.d3ti.pboLanjut20.thread;

public class TugasThread3 extends Thread{
	public TugasThread3(String nama) {
		super (nama);
	}
	
	public static synchronized void tampil(String nama) {
		for(int j=0;j<4;j++) {
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				//TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread " + nama + " posisi " +j);
			}
		}
	
	public void run() {
		tampil(getName());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TugasThread3 l1=new TugasThread3("l1");
		TugasThread3 l3=new TugasThread3("l3");
		l1.setPriority(MAX_PRIORITY);
		l1.start();
		l3.start();
		Extends l2=new Extends("l2");
		Extends l4=new Extends("l4");
		l2.start();
		try {
			Thread.sleep(3000);
		}catch (InterruptedException e) {
			//TODO Auto-generate catch block
			e.printStackTrace();
		}
		l4.start();
	}
	}
