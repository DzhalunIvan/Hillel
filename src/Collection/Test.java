package Collection;

import Gradebook.Student;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Collection test = new Collection();
        Collection test1 = new Collection("wednesday","thursday","friday");

        test.add("sunday");
        test.add("monday");
        test.add("tuesday");
        test1.add("saturday");
        test.addAll(test1);

        System.out.println(test);
        System.out.println(test1);

        System.out.println(test.contains("tuesday"));
        System.out.println(test.containsAll(test1));

        test.retainAll(test1);
        System.out.println(test);

        test.remove("friday");
        System.out.println(test);

        test1.removeAll(test);
        System.out.println(test1);
        System.out.println(test1.isEmpty());
        System.out.println(test1.size());

        test.clear();
        System.out.println(test);
        System.out.println(test.isEmpty());
    }
}
