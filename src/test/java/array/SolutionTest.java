package array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void should_return_length_of_array_01() {
        int[] nums = new int[]{1, 1, 2};
        assertEquals(2, Solution.removeDuplicates(nums));
    }

    @Test
    public void should_return_length_of_array_02() {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        assertEquals(5, Solution.removeDuplicates(nums));
    }
}