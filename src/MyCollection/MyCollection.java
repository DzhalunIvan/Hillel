package MyCollection;

public class MyCollection {

    private int size;
    private Object[] objects = new Object[size];

    public Object[] getObjects() {
        return objects;
    }

    public int getSize() {
        return size;
    }

    public MyCollection(Object... objects) {
        this.objects = objects;
        size = this.objects.length;
    }

    public int size() {
        return getSize();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object object) {
       int temp = 0;
       if (object==null){
           return false;
       }
       for (int i = 0; i< size;i++) {
            if (objects[i].equals(object)){
                temp =1;
            break;}
        }
        return temp == 1;
    }

    public void add(Object object) {
       Object[]temp;
        if (size ==objects.length){
        temp = new Object[objects.length*2];}
        else{
            temp = new Object[objects.length];
        }

        for (int i = 0; i <objects.length ; i++) {
            temp[i]=objects[i];
        }
        temp[size]=object;
        objects=temp;
        size++;
    }

    public void remove(Object object) {
        Object[] temp = new Object[objects.length];
        int counter=-1;
        for (int i = 0; i<objects.length;i++){
            if (objects[i].equals(object)){
                counter = i;
                break;
            }
        }
        int k=0;
        for (int i = 0; i < objects.length; i++) {
            if (i == counter)
                continue;
            temp[k] = objects[i];
            k++;
        }
        objects=temp;
        size--;
    }

    public void addAll(MyCollection collection) {
        for (Object el:collection.getObjects()) {
            add(el);
        }

    }

    public void clear() {
        Object[] temp = new Object[0];
        size = 0;
        objects = temp;

    }

    public void retainAll(MyCollection collection) {
       Object[]temp = new Object[objects.length];
       int counter=0;
       for (int i = 0; i <size; i++) {
            for (int j = 0; j < collection.objects.length; j++) {
                if (objects[i].equals(null)||collection.objects[j].equals(null)){
                    continue;
                }
                if (objects[i].equals(collection.objects[j])){
                    temp[counter]=objects[i];
                    counter++;
                }
            }

        }
        objects=temp;
       size =counter;
    }

    public void removeAll(MyCollection collection) {
        for (Object el:collection.getObjects()) {
            remove(el);
        }
    }

    public boolean containsAll(MyCollection collection) {
            int counter = 0;
        for (Object el:collection.objects) {
            if (this.contains(el)){
                counter++;
            }
        }
        return counter == collection.getSize();
    }

}
