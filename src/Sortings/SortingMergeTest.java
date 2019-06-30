package Sortings;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SortingMergeTest {
    @Test
    public void SortMergeFromMinToMax() {
        int[] testArray = {3, 4, 9, -3, 71};
        int[] expectedArray = {-3, 3, 4, 9, 71};
        SortingMerge process = new SortingMerge();
        int[] result = process.SortMerge(testArray);
        assertThat(result, is(expectedArray));



    }


}