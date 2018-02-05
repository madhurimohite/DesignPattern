package com.design.pattern;

public class SingletonLazy {
	//public static final SingltonStatic instance;
       	
	 public static SingletonLazy instance;
		private SingletonLazy() {
			super();
			// TODO Auto-generated constructor stub
		}

		public static SingletonLazy getInstance(){
			System.out.println("Singlton Lazy");
			if(instance==null){
				new SingletonLazy();
			}
			return instance;
			
		}

}
