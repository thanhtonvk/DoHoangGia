package com.company;

public class SimpleLinkedList<T> {
    class Node {
        T data;
        Node next;
    }

    private Node top = null;
    private Node bot = null;
    private int n = 0;

    public void add(T data) {
        // Thêm phần tử vào đầu danh sách
        Node node = new Node();
        node.data = data;
        node.next = top;
        top = node;
    }

    public void addBot(T data) {
        // Thêm phần tử vào cuối danh sách
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (top == null) top = bot = node;
        else {
            bot.next = node;
            bot = node;
        }
    }

    public T get(int i) {
        Node node = top;
        int count = 0;
        while (node != null) {
            if (count == i) {
                return node.data;
            }
            count++;
            node = node.next;
        }
        return null;
    }

    public void set(int i, T data) {
        // Gán giá trị ở vị trí i bằng data
        Node node = top;
        int count = 0;
        while (node != null) {
            if (count == i) {
                node.data = data;
                break;
            }
            count++;
            node = node.next;
        }
    }

    public boolean isContain(T data) {
        // Kiểm tra trong danh sách có chứa phần tử data hay không?
        Node node = top;
        while (node != null) {
            if (node.data == data) return true;
            node = node.next;
        }
        return false;
    }

    public int size() {
        Node node = top;
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }

    public boolean isEmpty() {
        // Kiểm tra danh sách có rỗng hay không?
        return top == null;
    }

    public T removeTop() {
        // Xóa phần tử ở đầu danh sách, trả lại giá trị data của phần tử đó   		return null;
        Node node = top;
        top = node.next;
        return node.data;
    }

    public T removeBot() {
        // Xóa phần tử ở cuối danh sách, trả lại giá trị data của phần tử đó   		return null;
        T last = bot.data;
        Node node = top;
        while (node.next != null) {
            if (node.next == bot) {
                break;
            }
            node = node.next;
        }
        node.next = null;
        bot = node;
        return last;
    }

    public void remove(T data) {
        // Xóa tất cả các phần tử có giá trị bằng data
        int idx = 0;
        Node node = top;
        while (node.next != null) {
            if (node == data && idx == 0) {
                removeTop();
            }
            if (node == data && idx == size()) {
                removeBot();
            }
            if (node.next.data == data) {
                node.next = node.next.next;
            }
            node = node.next;
            idx++;
        }
    }

}
