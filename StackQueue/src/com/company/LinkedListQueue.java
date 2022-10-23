package com.company;

import java.util.Iterator;

public class LinkedListQueue<E> implements QueueInterface<E> {
    class Node {
        E element;
        Node next;
    }

    private Node top = null;
    private Node bot = null;

    @Override
    public void enqueue(E element) {
        Node node = new Node();
        node.element = element;
        node.next = null;
        if (top == null) top = bot = node;
        else {
            bot.next = node;
            bot = node;
        }
    }

    @Override
    public E dequeue() {
        Node node = top;
        top = node.next;
        return node.element;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public Iterator<E> iterator() {
        return new QueueIterator();
    }

    class QueueIterator implements Iterator<E> {

        private Node currentNode = top;

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
