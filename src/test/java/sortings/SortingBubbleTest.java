package sortings;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class SortingBubbleTest {

    @Test
    public void sortBubbleFromMinToMax() {
        int[] testArray = {3, 4, 9, -3, 71};
        int[] expectedArray = {-3, 3, 4, 9, 71};
        SortingBubble process = new SortingBubble(testArray);
        int[] result = process.sorter();
        assertThat(result, is(expectedArray));
    }
}
