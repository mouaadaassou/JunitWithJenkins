import junit.framework.*;

public class MainTest extends TestCase{

	public MainTest(String name) {
		super(name);
	}

	public void testSample() {
		assertEquals(9, Main.selectMaxOfAnArray(new long[] {7, 8, 9}));
	}

	public void testOreder() {
		assertEquals(9, Main.selectMaxOfAnArray(new long[] {9, 8, 7}));
		assertEquals(9, Main.selectMaxOfAnArray(new long[] {8, 7, 9}));
		assertEquals(9, Main.selectMaxOfAnArray(new long[] {8, 9, 7}));
	}
}
