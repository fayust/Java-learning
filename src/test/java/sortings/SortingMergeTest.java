package sortings;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SortingMergeTest {
    @Test
    public void sortMergeFromMinToMax() {
        int[] testArray = {3, 4, 9, -3, 71};
        int[] expectedArray = {-3, 3, 4, 9, 71};
        SortingMerge process = new SortingMerge();
        int[] result = process.sortMerge(testArray);
        assertThat(result, is(expectedArray));
    }
}