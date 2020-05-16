package com.d3ti.pboLanjut20.thread;

public class ThreadInterface extends mainThread implements Runnable{
	String name;
	public ThreadInterface(String name){
		this.name=name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		jalan(name);
	}
	public static void main(String args[]){
		Thread vespa = new Thread(new ThreadInterface("vespa"));
		Thread sepeda = new Thread(new ThreadInterface("sepeda"));
		vespa.start();
		sepeda.start();
	}
}

