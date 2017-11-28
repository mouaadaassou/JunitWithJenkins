import org.junit.*;

public class MainTest{

	@Test(expected= IllegalArgumentException.class)
	public void testSample() {
		Assert.assertEquals("the method doesn't throw an exception ", 9, Main.selectMaxOfAnArray(new long[] {}));
	}

	@Test
	public void testSelectMaxOfAnArray() {
		Assert.assertEquals("the result must be ", 9, Main.selectMaxOfAnArray(new long[] {9, 8, 7}));
		Assert.assertEquals("the result must be ", 9, Main.selectMaxOfAnArray(new long[] {8, 7, 9}));
		Assert.assertEquals("the result must be ", 9, Main.selectMaxOfAnArray(new long[] {8, 9, 7}));
	}
}
