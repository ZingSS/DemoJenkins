import static org.junit.Assert.*;

import org.junit.Test;


public class TestAdd {

	@Test
	public void test() {
		Hw h = new Hw();
		int result = h.add(5, 6);
		
		assertEquals(11, result);
	}

}
