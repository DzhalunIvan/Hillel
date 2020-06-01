package newCollection;

import java.util.Arrays;
import java.util.Iterator;

public class Collection1 implements java.util.Collection {
    private int size;

    private Object[] objects = new Object[size];

    public Collection1(Object... objects) {
        this.objects = objects;
        this.size = objects.length;
    }

    @Override
    public String toString() {
        return "objects=" + Arrays.toString(objects);
    }

    public Object[] getObjects() {
        return objects;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        int temp = 0;
        if (o == null)
            return false;
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] == null) {
                continue;
            }
            if (objects[i].equals(o)) {
                temp = 1;
                break;
            }
        }
        return temp == 1;
    }


    @Override
    public Object[] toArray() {
        return this.getObjects();
    }

    @Override
    public boolean add(Object o) {
        Object[] temp;
        if (this.objects.length == size) {
            temp = new Object[objects.length * 2 + 1];
        } else {
            temp = new Object[objects.length];
        }
        for (int i = 0; i < size; i++) {
            temp[i] = objects[i];
        }
        temp[size] = o;
        size++;
        objects = temp;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        Object[] temp = new Object[objects.length];
        int counter = -1;
        for (int i = 0; i < size; i++) {
            if (objects[i].equals(o)) {
                counter = i;
                break;
            }
        }
        for (int j = 0, k = 0; j < size; j++) {
            if (j == counter)
                continue;
            temp[k] = objects[j];
            k++;
        }
        objects = temp;
        size--;
        return true;
    }

    @Override
    public boolean addAll(java.util.Collection c) {
        Object[] temp = c.toArray();
        for (Object o : temp) {
            if (o == null) {
                break;
            }
            add(o);
        }
        return true;
    }

    @Override
    public void clear() {
        this.objects = new Object[0];
        size = 0;
    }

    @Override
    public boolean retainAll(java.util.Collection c) {
        Object[] temp = new Object[objects.length];
        int counter = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < c.toArray().length; j++) {
                if (objects[i] == (null) || c.toArray()[j] == null) {
                    continue;
                }
                if (objects[i].equals(c.toArray()[j])) {
                    temp[counter] = objects[i];
                    counter++;
                }
            }

        }
        objects = temp;
        size = counter;
        return true;
    }

    @Override
    public boolean removeAll(java.util.Collection c) {
        for (Object o : c.toArray()) {
            if (o == null)
                continue;
            remove(o);
        }
        return false;
    }

    @Override
    public boolean containsAll(java.util.Collection c) {
        int counter = 0;
        for (Object el : c.toArray()) {
            if (this.contains(el)) {
                counter++;
            }
        }
        return counter == c.size();
    }


    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }


    @Override
    public Iterator iterator() {
        return null;
    }

}


