package CustomList;

import java.util.ArrayList;
import java.util.List;

public class CustomList<T extends Comparable<T>> {
    private List<T> list;
    public int size;

    public CustomList() {
        this.list = new ArrayList<>();
    }

    public void add(T element) {
        this.list.add(element);
        this.size++;
    }

    public T remove(int index) {
        if (isNotInRange(index)) {
            return null;
        }
        this.size--;
        return this.list.remove(index);
    }

    public boolean contains(T element) {
        return this.list.contains(element);
    }

    public void swap(int index1, int index2) {
        if (isNotInRange(index1) || isNotInRange(index2)) {
            System.out.println("First/Second index is/are not valid!");
        } else {
            T firstValue = list.get(index1);
            T secondValue = list.get(index2);
            this.list.set(index1, secondValue);
            this.list.set(index2, firstValue);
        }
    }

    public int countGreaterThan(T elementToCompare) {
        int count = 0;
        for (T element : this.list) {
            int result = element.compareTo(elementToCompare);
            if (result > 0) {
                count++;
            }
        }
        return count;
    }

    public T getMax() {
        T max = this.list.getFirst();
        for (T currentElement : list) {
            if (currentElement.compareTo(max) > 0) {
                max = currentElement;
            }
        }
        return max;

    }

    public T getMin() {
        T min = this.list.getFirst();
        for (T currentElement : list) {
            if (currentElement.compareTo(min) < 0) {
                min = currentElement;
            }
        }
        return min;
    }

    public T get(int index) {
        if (isNotInRange(index)) {
            System.out.println("Invalid index!");
            return null;
        }
        return this.list.get(index);
    }

    private boolean isNotInRange(int index) {
        return index < 0 || index >= this.list.size();
    }

    public void sort() {
        this.list.sort(Comparable::compareTo);
    }
}
