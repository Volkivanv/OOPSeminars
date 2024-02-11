//Реализовать свой LinkedList с методами вставки в начало,
//        конец списка, получения размера списка и получения
//        элемента по индексу

package list.core.impl;

import list.core.GBList;

import java.util.Iterator;

public class GBLinkedList<T> implements GBList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    private static class Node<T> {
        T value;
        Node<T> next;
        Node<T> prev;

        public Node(T inValue, Node<T> inNext, Node<T> inPrev) {
            this.value = inValue;
            this.next = inNext;
            this.prev = inPrev;
        }
    }

    private static class LinkedIterator<E> implements Iterator<E> {
        Node<E> node;


        public LinkedIterator(Node<E> inNode) {
            this.node = inNode;
        }

        @Override
        public boolean hasNext() {
            return node != null;
        }

        @Override
        public E next() {
            E val = node.value;
            node = node.next;
            return val;
        }
    }

    public GBLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public void add(T elem) {
        if (this.head == null) {
            Node<T> nd = new Node<>(elem, null, null);
            head = nd;
            tail = nd;
        } else {
            Node<T> nd = new Node<>(elem, null, tail);
            tail.next = nd;
            tail = tail.next;
        }
        size++;

    }

    public void addFirst(T elem) {
        Node<T> nd = new Node<>(elem, head, null);
        head = nd;
        size++;
    }

    @Override
    public void remove(int index) {
        if (index == 0) {
            head = head.next;
            head.prev = null;
        } else if (index == size - 1) {
            tail = tail.prev;
            tail.next = null;
        } else {
            if (index < size / 2) { // если в первой половине списка
                int i = 0;
                Node<T> nd = head;
                while (i < index - 1) {
                    nd = nd.next;
                    i++;
                }
                nd.next = nd.next.next;
                nd.next.prev = nd;
            } else { // если во второй половине списка
                int i = size - 1;
                Node<T> nd = tail;
                while (i > index - 1) {
                    nd = nd.prev;
                    i--;
                }
                nd.next = nd.next.next;
                nd.next.prev = nd;

            }


        }
        size--;
    }

    @Override
    public T get(int index) {
        if (index < size / 2) {
            Node<T> nd = head;
            int i = 0;
            while (i < index) {
                nd = nd.next;
                i++;
            }
            return nd.value;
        } else {
            Node<T> nd = tail;
            int i = size - 1;
            while (i > index){
                nd = nd.prev;
                i--;
            }
            return nd.value;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedIterator<>(head);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        Node<T> nd = head;
        while (nd != null) {
            builder.append(nd.value).append(", ");
            nd = nd.next;
        }
        if (builder.length() == 1)
            return "[]";
        builder.deleteCharAt(builder.length() - 1).deleteCharAt(builder.length() - 1);
        builder.append("]");
        return builder.toString();
    }
}
