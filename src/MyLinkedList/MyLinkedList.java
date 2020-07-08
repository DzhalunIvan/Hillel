package MyLinkedList;

import java.util.*;

public class MyLinkedList implements Collection {

    private Node head;
    private int size = 0;


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {

        return head == null;
    }

    @Override
    public boolean contains(Object o) {
        Iterator iterator = this.iterator();
        int counter = 0;
        while (iterator.hasNext()) {
            if (iterator.next().equals(o)) {
                counter = 1;
                break;
            }
        }

        return counter == 1;
    }

    @Override
    public Iterator iterator() {
        return new ListIterator();
    }

    @Override
    public Object[] toArray() {
        Object[] arr = new Object[size];
        Node temp = head;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp.getData();
            if (temp.getNext() == null) break;
            temp = temp.getNext();
        }
        return arr;
    }

    @Override
    public boolean add(Object o) {
        head = new Node(o, head);
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (head == null) {
            return false;
        }
        if (head.getData().equals(o)) {
            head = head.next;
            size--;
            return true;
        }
        else {
            Node temp = head;
            while (temp.next!= null) {
                if (temp.next==null&&temp.data.equals(o)){
                    temp = null;
                    size--;
                    return true;
                }
                if (temp.next.data.equals(o)) {
                    temp.next= temp.next.next;
                    size--;
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        for (Object o : c) {
            add(o);
        }
        return true;
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public boolean retainAll(Collection c) {
        for (Object obj : this) {
                if (!c.contains(obj)) {
                    remove(obj);
                }
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection c) {
        for (Object obj : c) {
            remove(obj);
        }
        return true;
    }

    @Override
    public boolean containsAll(Collection c) {
        boolean result = false;
        for (Object obj : c) {
            result = contains(obj);
        }
        return result;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];

    }


    private class Node {

        private Object data;
        private Node next;

        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Object getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return Objects.equals(data, node.data);
        }


    }

    private class ListIterator implements Iterator {
        Node index;

        public ListIterator() {
            index = head;
        }

        @Override
        public boolean hasNext() {
            return index != null;
        }

        @Override
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object value = index.data;
            index = index.next;
            return value;
        }
    }
}
