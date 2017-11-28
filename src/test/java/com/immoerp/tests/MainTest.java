import org.junit.*;

public class MainTest{

	

	public void testSample() {
		Assert.assertEquals(9, Main.selectMaxOfAnArray(new long[] {7, 8, 9}));
	}

	@Test(expected= IllegalArgumentException.class)
	public void testOreder() {
		Assert.assertEquals("", 9, Main.selectMaxOfAnArray(new long[] {9, 8, 7}));
		Assert.assertEquals("", 9, Main.selectMaxOfAnArray(new long[] {8, 7, 9}));
		Assert.assertEquals("", 9, Main.selectMaxOfAnArray(new long[] {8, 9, 7}));
		Assert.assertEquals("", 9, Main.selectMaxOfAnArray(new long[] {}));
	}
}
