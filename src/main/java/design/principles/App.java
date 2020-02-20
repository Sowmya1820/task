package design.principles;

class Sample {
	

	public void labclass() {

	System.out.println("I am in 3rd floor");
	OtherTasks();
	}

	public void theoryclass() {

	System.out.println("My friend is in 1st floor");
	OtherTasks();
	}

	public void OtherTasks() {

	System.out.println("I am in second floor");
	System.out.println("hod room  is in second floor");
	System.out.println("class room is in second floor");
	
	}

	} 

public class App{
public static void main(String[] args) {
	Sample obj=new Sample();
	obj.labclass();
	obj.theoryclass();
}

	
	
}