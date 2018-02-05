

public class SingletonEagerIni {
     public static final SingletonEagerIni instance=new SingletonEagerIni();
	private SingletonEagerIni() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static SingletonEagerIni getInstance(){
		System.out.println("Singlton Eager");
		/*try{
			int i=10/0;
		}catch (Exception e) {
			 throw new RuntimeException("Exception occured in creating singleton instance");
		}
		*/
		
		return instance;
		
	}
}
