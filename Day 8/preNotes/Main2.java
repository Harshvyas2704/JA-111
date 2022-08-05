package preNotes;

public class Main2 {
	
	static void fun1(int... i) {
		
		for(int a:i) {
			System.out.println(a);
		}
	}
	
	public static void main(String[] args) {
		
		fun1(10,20,30,40);
	}
}
