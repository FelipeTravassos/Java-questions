import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Question3Test {

    @Test
    public void checkWords() {
        assertTrue(new Question3().checkTypos("pale", "ple"));
        assertTrue(new Question3().checkTypos("pales", "pale"));
        assertTrue(new Question3().checkTypos("pale", "bale"));
        assertFalse(new Question3().checkTypos("pale", "bake"));
    }
}
