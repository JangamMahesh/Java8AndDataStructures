import java.security.InvalidAlgorithmParameterException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*Callable interface represents an asynchronous task which can be
executed by a separate thread, it has one call() method, which returns a
Future object

A Runnable can be executed by passing it into the Thread class constructor
but Thread class does not have a constructor that accepts a Callable, so
Callable can be executed only by submit() method of ExecutorService
Interface.*/
class Task implements Callable<Integer> {

	private int num;

	public Task(int num) {
		this.num = num;
	}

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub

		if (num < 0) {
			throw new InvalidAlgorithmParameterException("cannot take negative numbers");
		}
		return num * num;
	}
}

public class CallableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Task task=new Task(5);
		//Task task = new Task(-1);

		ExecutorService es = Executors.newFixedThreadPool(2);
		Future<Integer> fu = es.submit(task);
		try {

			System.out.println("task call method returned future object " + fu.get());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
