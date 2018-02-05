package com.design.pattern;

public class SingltonStatic {
	 public static SingltonStatic instance=new SingltonStatic();
    static{
        try{
        	if(instance==null){
                new SingltonStatic();
        	}
          // int i=10/0;
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

	
	
		private SingltonStatic() {
			super();
			// TODO Auto-generated constructor stub
		}

		public static SingltonStatic getInstance(){
			System.out.println("Singlton Static");
			return instance;
			
		}
}
