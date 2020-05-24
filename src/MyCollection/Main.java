package MyCollection;

import Gradebook.Student;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        MyCollection collection = new MyCollection("AAA","DDD","SSSS");
        MyCollection collection1 = new MyCollection("QQQ","WWW", "RRRR");
        collection.add("LLL");
        System.out.println(Arrays.toString(collection.getObjects()));
        collection.addAll(collection1);
        System.out.println(Arrays.toString(collection.getObjects()));
        System.out.println("Does coolection contains collection1? Must be true");
        System.out.println(collection.containsAll(collection1));
        System.out.println("Does coolection contains DDD? Must be true");
        System.out.println(collection.contains("DDD"));
        System.out.println("Collection after removing DDD string:");
        collection.remove("DDD");
        System.out.println(Arrays.toString(collection.getObjects()));
        collection.removeAll(collection1);
        System.out.println("Collection after removing collection1:");
        System.out.println(Arrays.toString(collection.getObjects()));
        collection.clear();
        System.out.println("Collection after clear method");
        System.out.println(Arrays.toString(collection.getObjects()));
        System.out.println("Is collection empty?");
        System.out.println(collection.isEmpty());
        MyCollection collection2 = new MyCollection("MMM","WWW", "TTT");
        collection1.retainAll(collection2);
        System.out.println("Collection1 after use retainAll method");
        System.out.println(Arrays.toString(collection1.getObjects()));
    }
}
