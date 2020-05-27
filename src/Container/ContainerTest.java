package Container;

public class ContainerTest {
    public static void main(String[] args) {
        IntContainer test = new IntContainer();
        IntContainer test1 = new IntContainer();
        test.print();
        test.add(1);
        test.add(105);
        test.add(3,4,5,6);
        test1.add(9,8,7);
        test.print();
        test1.print();
        int x = test.getByIndex(5);
        System.out.println(x);
        System.out.println(test.contains(7));
        System.out.println(test.contains(5));
        System.out.println(test.getSize());
        test.addFromContainer(test1);
        test.print();
       // test.clear();
        test.print();
        test.findIndexOf(7);
        System.out.println(test.findIndexOf(5));
        test.sortAscending();
        test.print();
        test.sortDescending();
        test.print();
    }
}
