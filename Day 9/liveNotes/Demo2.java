package liveNotes;

public final class Demo2 { // final class does not have a child
	
	final int x = 30; // inside a program no body can change value 
	// it is like const in JS
	
	final void funA() {
		System.out.println("inside funA of Demo2");
		// we can not override a method in child class
	}
	
	public static void main(String[] args) {
		
		// final int y = 500;
		
		// y = 100; error
		
	}
}
