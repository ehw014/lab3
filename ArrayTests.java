import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 11,12,13,14 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 14,13,12,11 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { 11, 12, 13, 14 };
    assertArrayEquals(new int[]{ 14, 13, 12, 11 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAvg(){
    double delta = 0.05;
    double[] input1 = {1,0,2,3};
    assertEquals(2, ArrayExamples.averageWithoutLowest(input1), 0.05);
  }
}
