package Collection;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class Collection implements java.util.Collection {

    private int size;
    private Object[] objects = new Object[size];

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
        return false;
    }

    @NotNull
    @Override
    public Iterator iterator() {
        return null;
    }

    @NotNull
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(@NotNull java.util.Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(@NotNull java.util.Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(@NotNull java.util.Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(@NotNull java.util.Collection c) {
        return false;
    }

    @NotNull
    @Override
    public Object[] toArray(@NotNull Object[] a) {
        return new Object[0];
    }
}
