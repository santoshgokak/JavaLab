package threads;

/*import static org.junit.Assert.*;

import org.junit.Test;*/

public class PCTester {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	
	public static void main(String[] args) {
//		Q q = new QBroken();
		Q q = new QFixed(); 
		new Producer(q); 
		new Consumer(q); 
		System.out.println("Press Control-C to stop.");
	}

}
