import junit.framework.*;

public class MainTest extends TestCase{

	public MainTest(String name) {
		super(name);
	}

	public void testSample() {
		assertEquals(9, Main.selectMaxOfAnArray(new long[] {5, 7, 8, 9, 3, 2}));
	}
}
