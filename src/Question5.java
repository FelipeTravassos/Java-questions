import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Question5 {

    //O(n log n)
    public static <T> void removeDuplicates(LinkedList<T> list) {
        for (int j, i = 0; i < list.size(); i++) {
            T item = list.get(i);
            for (j = i + 1; j < list.size(); j++) {
                if (item.equals(list.get(j))) list.remove(j--);
            }
        }
    }

    //O(n)
    public static <T> LinkedList<T> getRemovedDuplicates(LinkedList<T> list) {
        return new LinkedList<>(new HashSet<>(list));
    }

    //O(n)
    public static <T> MyLinkedList<T> getRemovedDuplicates(MyLinkedList<T> list) {
        MyLinkedList<T> result = new MyLinkedList<>();
        Set<T> set = new HashSet<>();

        if (list.size() > 0) {
            do {
                set.add(list.getCurrent().value);
            } while(list.next());
        }

        for (T item : set) {
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
