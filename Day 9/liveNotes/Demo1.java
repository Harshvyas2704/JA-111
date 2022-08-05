package liveNotes;

public class Demo1 extends A {

	@Override
	public void funA() {
		System.out.println("inside funA of Demo1");
	}
	
	
	public A fun1() {
		System.out.println("inside funX of Demo1");
		
		return new B();
	}
	
	
	public static void main(String[] args) {
		
		Demo1 d1 = new Demo1();
		
		A a1 = d1.fun1();
		a1.funA();
		
		
		if(a1 instanceof B) { 
			B b1 = (B)a1;
			b1.funB();
			// this will check if returning object is of class B or not.
		}
		
	} 
	
}
