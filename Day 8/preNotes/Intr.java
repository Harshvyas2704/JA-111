package preNotes;

public interface Intr {
	
	int x = 10;
	
	void funX();
	void funY();
	
	default void funZ() {
		System.out.println("inside funZ of Intr");
		// we don't have to override this method it is already inherited .
	}
	
	static void fun1() {
		System.out.println("inside static fun1 of Intr");
		// this will not be inherited in implemented class
	}
}
