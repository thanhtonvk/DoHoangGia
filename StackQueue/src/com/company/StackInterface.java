package com.company;

public interface StackInterface<E> extends Iterable<E> {
    void push(E element);

    E pop();

    boolean isEmpty();

    E top();
}
