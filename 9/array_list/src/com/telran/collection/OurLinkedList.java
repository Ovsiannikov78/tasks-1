package com.telran.collection;

public class OurLinkedList implements OurList {

    private int size;
    Node first;
    Node last;

    OurLinkedList() {
    }

    @Override
    public void append(Object value) {
        if (size > 0) {
            Node newNode = new Node(null, last, value);
            last.next = newNode;
            last = newNode;
        } else {
            Node newNode = new Node();
            newNode.value = value;
            first = newNode;
            last = newNode;
        }
        size++;
    }

    @Override
    public Object get(int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();

        Node needle = first;
        for (int i = 0; i < index; i++) {
            needle = needle.next;
        }
//        int counter = 0;
//        while (counter < index) {
//            needle = needle.next;
//            counter++;
//        }
        return needle.value;
    }

    @Override
    public void set(Object o, int index) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean contains() {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public Object removeById(int index) {
        return null;
    }

    private static class Node {
        Node() {

        }

        Node(Node next, Node prev, Object value) {
            this.next = next;
            this.prev = prev;
            this.value = value;
        }

        Node next;
        Node prev;
        Object value;
    }
}
