package org.windbell.lab.hamster.hook;

public class HookTest {
	private String str;
	private Integer number;
	public static void main(String[] args) {
		Runtime.getRuntime().addShutdownHook(new MyshutdownHook());
		System.out.println("Start App");
//		System.exit(0);
		tt();
		System.out.println("End App");
	}
	private static void tt(){
		throw new RuntimeException();
	}
	private static class MyshutdownHook extends Thread{
		@Override
		public void run(){
			System.out.println("Close App");
		}
	}
	
	
}
