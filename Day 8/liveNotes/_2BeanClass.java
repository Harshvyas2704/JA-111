package liveNotes;

public class _2BeanClass {
	
	private int roll;
	private String name;
	private int marks;
	
	
	
	
	public _2BeanClass() {
		super();
	}


	public _2BeanClass(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	
	
}


/*
- > class must be public
-> all data member should me private
-> for each data there must be getter setter method
-> should have zero argument constructor
-> may have parameterized constructor (optional)
-> it can have some other methods (optional)

*/