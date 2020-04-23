import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Question5 {

    public LinkedList<String> getRemovedDuplicates(LinkedList<String> list) {
        return new LinkedList<>(new HashSet<>(list));
    }

    //O(n)
    public MyLinkedList<String> getRemovedDuplicates(MyLinkedList<String> list) {
        MyLinkedList<String> result = new MyLinkedList<>();
        Set<String> set = new HashSet<>();

        if (list.size() > 0) {
            do {
                set.add(list.getCurrent().value);
            } while(list.next());
        }

        for (String item : set) {
            result.add(item);
        }

        return result;
    }

    public static class MyLinkedList<T> {

        private Node<T> current;
        private Node<T> last;
        private int size = 0;

        public int size() {
            return size;
        }

        public void add(T value) {
            Node<T> node = new Node<>(value);
            node.previous = current;

            if (current == null) {
                current = node;
            }

            if (last != null) {
                last.next = node;
            }
            last = node;

            size++;
        }

        public boolean removeCurrentNode() {
            boolean canRemove = current != null;

            if (canRemove) {
                Node<T> aux = null;
                if (current.next != null) {
                    current.next.previous = current.previous;
                    aux = current.next;
                }
                if (current.previous != null) {
                    current.previous.next = current.next;
                    aux = current.previous;
                }
                current = aux;
                size--;
            }

            return canRemove;
        }

        public Node<T> getCurrent() {
            return current;
        }

        public boolean next() {
            boolean hasNext = hasNext();
            current = hasNext ? current.next : current;
            return hasNext;
        }

        public boolean hasNext() {
            return current.next != null;
        }

        public static class Node<T> {
            private Node<T> previous;
            private Node<T> next;
            private T value;

            public Node(T value) {
                this.value = value;
            }

            public T getValue() {
                return value;
            }

            public void setValue(T value) {
                this.value = value;
            }
        }
    }
}
