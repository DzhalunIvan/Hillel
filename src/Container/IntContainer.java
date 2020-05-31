package Container;



import java.util.ArrayList;
import java.util.Arrays;

public class IntContainer {
    /*Реализовать простой контейнер для int на базе массива. Здесь можно проявить мастерство архитектора :). Первым делом нужно подумать, что должен делать контейнер, а потом реализовывать. Например:
    добавлять (add),
    доставать по индексу (get),
    проверять наличие элемента (contains),
    добавлять все элементы из другого контейнера (addAll)
    проверять на равенство (equals)
    очищать (clear)
    находить индекс элемента (find or indexOf)
    узнавать размер (getSize)
    сортировать (sort) (это очень важный вопрос его нужно хорошо продумать) */

    private int[] container = new int[0];

    void add(int x) {
        int[] temp = new int[container.length + 1];
        for (int i = 0; i < container.length; i++) {
            temp[i] = container[i];
        }
        temp[temp.length - 1] = x;
        container = temp;
    }

    void add(int... x) {
        for (int nums : x) {
            add(nums);
        }
    }

    void print() {
        for (int i = 0; i < container.length; i++) {
            if (i == 0) {
                System.out.print("[" + container[i] + ", ");
            } else if (i == container.length - 1) {
                System.out.print(container[i] + "]\n");
            } else
                System.out.print(container[i] + ", ");
        }

    }

    int getByIndex(int index) {
        for (int i = 0; i < container.length; i++) {
            if (i == index) {
                return container[i];
            }
        }
        return 0;
    }

    //
    boolean contains(int x) {
        for (int i = 0; i < container.length; i++) {
            if (container[i] == x)
                return true;
        }
        return false;
    }

    int getSize() {
        int size = 0;
        for (int i = 0; i < container.length; i++) {
            size++;
        }
        return size;
    }

    void addFromContainer(IntContainer srcContainer) {
        int[] temp = new int[container.length + srcContainer.getSize()];
        int k = 0;
        for (int i = 0; i < temp.length; i++) {
            if (i < container.length) {
                temp[i] = container[i];
            } else if (i >= container.length) {

                temp[i] = srcContainer.container[k++];
            }
        }
        container = temp;
    }

    //
    void clear() {
        int[] temp = new int[0];
        container = temp;
        System.out.println("IntContainer has been cleared!");
    }

    //
    int findIndexOf(int x) {
        int index = -1;
        for (int i = 0; i < container.length; i++) {
            if (container[i] == x) {
                index = i;
                break;
            }

        }
        return index;
    }


    void sortAscending() {
        for (int i = container.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (container[j] > container[j + 1]) {
                    int tmp = container[j];
                    container[j] = container[j + 1];
                    container[j + 1] = tmp;
                }
            }

        }
    }
    void sortDescending() {
        for (int i = container.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (container[j] < container[j + 1]) {
                    int tmp = container[j];
                    container[j] = container[j + 1];
                    container[j + 1] = tmp;
                }
            }

        }
    }
}

