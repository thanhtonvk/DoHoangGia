package com.company;

import java.util.Iterator;

public class LinkedListStack<E> implements StackInterface<E> {
    class Node {
        E element;
        Node next;
    }

    private Node stack = null;
    @Override
    public void push(E element) {
        Node node = new Node();
        node.element = element;
        node.next = stack;
        stack = node;
    }

    @Override
    public E pop() {
        Node node = stack;
        stack = node.next;
        return node.element;
    }

    @Override
    public boolean isEmpty() {
        return stack == null;
    }

    @Override
    public E top() {
        return stack.element;
    }

    @Override
    public Iterator<E> iterator() {
        return new StackIterator();
    }

    class StackIterator implements Iterator<E> {

        private Node currentNode = stack;

        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            return currentNode != null;
        }

        @Override
        public E next() {
            // TODO Auto-generated method stub
            E data = currentNode.element;
            currentNode = currentNode.next;
            return data;
        }
    }

}
