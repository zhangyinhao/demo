package com.beautiful.demol;

public class JDK8_NewFeature {

	public static void main(String[] args) {
System.out.println( "Hello World!" );
        
		//线程实现方式1：实现Tread类
        new Thread(){
        	@Override
        	public void run() {
        		super.run();
        		System.out.println("thread 1");
        	}
        }.start();
        
        //线程实现方式2：实现Runnable接口
        new Thread(new Runnable() {
			
        	@Override
			public void run() {
				System.out.println("thread 2");
			}
		}).start();
        
        //lambda表达式
        new Thread(()-> {
        	int i=1+1;
        	System.out.println("thread 3"+";"+i);
        	}).start();
	}

}
