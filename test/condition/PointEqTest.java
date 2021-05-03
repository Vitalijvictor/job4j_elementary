package condition;

import org.junit.Assert;
import org.junit.Test;

public class PointEqTest {

	@Test
	public void when44to44thenTrue() {
        boolean expected = true;
        int x1 = 4;
        int y1 = 4;
        int x2 = 4;
        int y2 = 4;
        boolean out = PointEq.eq(x1, y1, x2, y2);
        Assert.assertEquals(expected, out);
    }
	@Test
	public void when11to11thenTrue() {
        boolean expected = true;
        int x1 = 1;
        int y1 = 1;
        int x2 = 1;
        int y2 = 1;
        boolean out = PointEq.eq(x1, y1, x2, y2);
        Assert.assertEquals(expected, out);
    }
	@Test
	public void when88to88thenTrue() {
        boolean expected = true;
        int x1 = 8;
        int y1 = 8;
        int x2 = 8;
        int y2 = 8;
        boolean out = PointEq.eq(x1, y1, x2, y2);
        Assert.assertEquals(expected, out);
    }
}
