package challenges;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchUnitTest {

    @Test
    public void testSearchNotFound() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 6;
        int index = BinarySearch.search(nums, target);
        assertEquals(-1, index);
    }

    @Test
    public void testSearchFoundAtBeginning() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = -1;
        int index = BinarySearch.search(nums, target);
        assertEquals(0, index);
    }

    @Test
    public void testSearchFoundInMiddle() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 5;
        int index = BinarySearch.search(nums, target);
        assertEquals(3, index);
    }

    @Test
    public void testSearchFoundAtEnd() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 12;
        int index = BinarySearch.search(nums, target);
        assertEquals(5, index);
    }
}