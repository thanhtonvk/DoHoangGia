package com.company;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayQueue<E> implements QueueInterface<E> {

    private E[] queue;
    private int n = 0;
    private int top = 0;
    private int count = 0;
    private int default_size = 100;

    public ArrayQueue(int capacity) {
        n = capacity;
        queue = (E[]) new Object[capacity];
    }

    public ArrayQueue() {
        n = default_size;
        queue = (E[]) new Object[default_size];
    }

    @Override
    public void enqueue(E element) {
        boolean check = false;
        for (int i = 0; i < queue.length; i++) {
            if (queue[i] == null) {
                queue[i] = element;
                check = true;
                break;
            }
        }
        if (!check) {
            E[] resized = Arrays.copyOf(queue, queue.length + 1);
            resized[resized.length - 1] = element;
            queue = resized;
        }
    }

    @Override
    public E dequeue() {
        E[] newArray = (E[]) new Object[queue.length - 1];
        for (int i = 1; i < queue.length; i++) {
            newArray[i - 1] = queue[i];
        }
        E element = queue[0];
        queue = newArray;
        return element;
    }

    @Override
    public boolean isEmpty() {
        return queue.length==0;
    }

    @Override
    public Iterator<E> iterator() {
        // TODO Auto-generated method stub
        return new ArrayQueueIterator();
    }

    class ArrayQueueIterator implements Iterator<E> {
        private int current = top;
        private int num = 0;

        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            return num < count;
        }

        @Override
        public E next() {
            // TODO Auto-generated method stub
            E data = queue[(current + num) % n];
            num++;
            return data;
        }
    }
}
