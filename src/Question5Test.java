import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class Question5Test {

    @Test
    public void getRemovedDuplicates_linkedList() {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");
        list = new Question5().getRemovedDuplicates(list);

        assertEquals(3, list.size());
        assertTrue(list.contains("a"));
        assertTrue(list.contains("b"));
        assertTrue(list.contains("c"));
    }

    @Test
    public void getRemovedDuplicates_myLinkedList() {
        Question5.MyLinkedList<String> list = new Question5.MyLinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");
        list = new Question5().getRemovedDuplicates(list);

        assertEquals(3, list.size());
    }
}
