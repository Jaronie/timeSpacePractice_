import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls
  @Test
  public void testTieBreakForMostCommonTimeEfficient() {
    // arrange
    int[] nums = {2, 3, 2, 3};
    int expected = 2;
    // act
    int actual = Practice.mostCommonTimeEfficient(nums);
    // assert
    assertEquals(expected, actual, "tie break by choosing element that appears first.");
  }
  @Test
  public void testReturnFreqNumSpaceEfficient() {
    //arrange
    int[] nums = {2,3,2,1,2};
    int expected = 2;

    //act
    int actual = Practice.mostCommonSpaceEfficient(nums);

    //assert
    assertEquals(expected, actual);
  }
}
