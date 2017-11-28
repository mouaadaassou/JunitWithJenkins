import org.junit.*;

public class MainTest{

	@Test(expected = IllegalArgumentException.class)
	public void testSelectMaxOfAnArrayWithException() {
		Assert.assertEquals("the method doesn't throw an exception ", 9, Main.selectMaxOfAnArray(new long[] {}));
	}

	@Test
	public void testSelectMaxOfAnArray() {
		Assert.assertEquals("the result must be ", 9, Main.selectMaxOfAnArray(new long[] {9, 8, 7}));
	}

	@Test
	public void testSelectMaxOfAnArraySort() {
		Assert.assertEquals("the result must be ", 9, Main.selectMaxOfAnArray(new long[] {8, 7, 9}));
	}

	@Test
	public void testSelectMaxOfAnArrayDuplication() {
		Assert.assertEquals("the result must be ", 9, Main.selectMaxOfAnArray(new long[] {8, 9, 7}));
	}
}
