package preNotes;

public class Main implements Intr {
	
	/* we have to override all the methods of interface or mark class
	 * as an abstract class
	 * if we mark as an abstract then the class which inherit main class,
	 * have to override methods.
	*/
	
	@Override
	public void funX() {
		// TODO Auto-generated method stub
		System.out.println("inside funX of main");
	}

	@Override
	public void funY() {
		// TODO Auto-generated method stub
		System.out.println("inside funY of main");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Intr i1 = new Main(); // we can assign any implemented class or null.
		Intr i2 = new IntrImpl(); // we can assign all the implemented class.
		
		i1.funX();
		i2.funY();
		Intr.fun1();
		
//		Intr i2 = new Intr();  wrong
	}

	

}
