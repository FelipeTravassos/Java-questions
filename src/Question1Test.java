import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Question1Test {

    @Test
    public void replaceCharacters() {
        char[] input = "User is not allowed      ".toCharArray();
        new Question1().replace(input, 19);

        assertEquals("User&32is&32not&32allowed", new String(input));
    }
}
