package com.beautiful.demol;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        new Thread(){
        	@Override
        	public void run() {
        		super.run();
        		System.out.println("thread 1");
        	}
        }.start();
        
        new Thread(new Runnable() {
			
        	@Override
			public void run() {
				System.out.println("thread 2");
			}
		}).start();
        
        new Thread(()-> {
        	int i=1+1;
        	System.out.println("thread 3"+";"+i);
        	}).start();
    }
}
