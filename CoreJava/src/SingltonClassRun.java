
class SingletonClass {
	private static SingletonClass sc = new SingletonClass();
	
	String s;
	
	private SingletonClass() {
		s = "Hello Singleton";
	}
	
	public static SingletonClass getInstance() {
		return sc;
	}
}

public class SingltonClassRun {

	public static void main(String atg[]) {
		SingletonClass singClass = SingletonClass.getInstance();
		//singClass.s = "Hello New";
		System.out.println(singClass.s);
	}
}


