package Jar;

import java.util.ArrayDeque;
import java.util.Deque;

public class Jar<T> {
    private Deque<T> queue;

    public Jar() {
        this.queue = new ArrayDeque<>();
    }

    public void add(T element) {
        this.queue.push(element);
    }

    public T remove() {
        return this.queue.pop();
    }

}
