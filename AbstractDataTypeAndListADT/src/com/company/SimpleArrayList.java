package com.company;

import java.util.Arrays;
import java.util.Iterator;

public class SimpleArrayList<T> implements ListInterface<T> {
    private T[] array;
    private int n = 0;
    private int defaultSize = 100;

    public SimpleArrayList() {
        array = (T[]) new Object[defaultSize];
    }

    public SimpleArrayList(int capacity) {

        n = capacity;
        array = (T[]) new Object[capacity];
    }

    public SimpleArrayList(T[] array, int n, int defaultSize) {
        this.array = array;
        this.n = n;
        this.defaultSize = defaultSize;
    }

    @Override
    public void add(T data) {
        boolean check = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = data;
                check = true;
                break;
            }
        }
        if (!check) {
            T[] resized = Arrays.copyOf(array, array.length + 1);
            resized[resized.length - 1] = data;
            array = resized;
        }
    }

    @Override
    public T get(int i) {
        if (array.length - 1 < i) return null;
        return array[i];
    }

    @Override
    public void set(int i, T data) {
        if (array.length - 1 < i) System.out.println("Out of length");
        else {
            array[i] = data;
        }
    }

    @Override
    public void remove(T data) {
        T[] newArray = (T[]) new Object[array.length - 1];
        for (int i = 0, k = 0; i < array.length; i++) {
            if (array[i] != data) {
                newArray[k] = array[i];
                k++;
            }
        }
        array = newArray;
    }

    @Override
    public boolean isContain(T data) {
        for (int i = 0; i < array.length; i++) {
            if (data == array[i]) return true;
        }
        return false;
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public boolean isEmpty() {
        return array.length == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
