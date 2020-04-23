//O(n)
public class Question1 {

    private static final char[] NEW_CHARACTER = {'&', '3', '2'};
    private static final char OLD_CHARACTER = ' ';

    public void replace(char[] input, int length) {
        int pivot = length;
        int index = input.length;

        while (pivot > 0) {
            char character = input[--pivot];

            if (character == OLD_CHARACTER) {
                input[--index] = NEW_CHARACTER[2];
                input[--index] = NEW_CHARACTER[1];
                input[--index] = NEW_CHARACTER[0];
            } else {
                input[--index] = character;
            }
        }
    }
}
