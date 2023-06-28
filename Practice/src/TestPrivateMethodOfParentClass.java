import java.util.concurrent.Callable;

class Parent implements Callable {
    private  void privateMethod() {
        System.out.println("Parent's private method");
    }

    public  void publicMethod() {
        privateMethod(); // Calls parent's private method
    }

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

class Child extends Parent {
    // Override parent's public method
    public void publicMethod() {
    	 //super.privateMethod(); 
        System.out.println("Child's public method");
       // Calls parent's private method
    }

    // Define a new method with a different name
    public void newMethod() {
        System.out.println("Child's new method");
    }
}

public class TestPrivateMethodOfParentClass {

	public static void main(String[] args) {
		Parent p=new Child();
		p.publicMethod();
		Parent p1=new Parent();
		p1.publicMethod();

	}

}
