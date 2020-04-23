import org.junit.Test;

import static org.junit.Assert.*;

public class Question2Test {

    @Test
    public void isPartialPermutation() {
        assertTrue(new Question2().isPartialPermutation("you", "yuo"));
        assertTrue(new Question2().isPartialPermutation("probably", "porbalby"));
        assertTrue(new Question2().isPartialPermutation("despite", "desptie"));
        assertFalse(new Question2().isPartialPermutation("moon", "nmoo"));
        assertFalse(new Question2().isPartialPermutation("misspellings", "mpeissngslli"));
    }
}
