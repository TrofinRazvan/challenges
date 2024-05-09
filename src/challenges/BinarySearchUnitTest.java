package challenges;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchUnitTest {
    int[] nums = {-1, 0, 3, 5, 9, 12};
    @Test
    public void testSearchNotFound() {
        int target = 6;
        int index = BinarySearch.search(nums, target);
        assertEquals(-1, index);
    }

    @Test
    public void testSearchFoundAtBeginning() {
        int target = -1;
        int index = BinarySearch.search(nums, target);
        assertEquals(0, index);
    }

    @Test
    public void testSearchFoundInMiddle() {
        int target = 5;
        int index = BinarySearch.search(nums, target);
        assertEquals(3, index);
    }

    @Test
    public void testSearchFoundAtEnd() {
        int target = 12;
        int index = BinarySearch.search(nums, target);
        assertEquals(5, index);
    }
}