package MyLinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        MyLinkedList list1 = new MyLinkedList();
        MyLinkedList list2 = new MyLinkedList();
        MyLinkedList list3 = new MyLinkedList();
        System.out.println(list.size());
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list.size());
        list1.add("froster");
        list1.add("rocker");
        list.add("4");
        list.add("5");
        list2.add("1");
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list.size());
        list.addAll(list1);
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list.contains("1"));System.out.println(list.size());
        System.out.println(list.containsAll(list2));
        list.remove("6");
        list.retainAll(list1);
        System.out.println(Arrays.toString(list.toArray()));
    }
}
