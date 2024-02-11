//Реализовать свой LinkedList с методами вставки в начало,
//        конец списка, получения размера списка и получения
//        элемента по индексу

package list.core.impl;

import list.core.GBList;

import java.util.Iterator;

public class GBLinkedList<T> implements GBList<T> {
    private Node<T> head;
    private int size;

    private static class Node<T>{
        T value;
        Node<T> next;
        Node<T> prev;
        public Node(T inValue, Node<T> inNext, Node<T> inPrev){
            this.value = inValue;
            this.next = inNext;
            this.prev = inPrev;
        }
    }

    private static class LinkedIterator<E> implements Iterator<E>{
        Node<E> node;


        public LinkedIterator(Node<E> inNode){
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

    public GBLinkedList(){
        this.head = null;
        this.size = 0;
    }

    @Override
    public void add(T elem) {
        if(this.head == null){
            head = new Node<>(elem, null, null);
        } else {
            Node<T> nd = head;
            while(nd.next != null){
                nd = nd.next;
            }
            nd.next = new Node<>(elem, null, nd);
        }
        size++;

    }

    public void addFirst(T elem){
        Node<T> nd = new Node<>(elem, head,null);

        head = nd;
    }

    @Override
    public void remove(int index) {
        if(index == 0){
            head = head.next;
            head.prev = null;
        } else {
            int i = 0;
            Node<T> nd = head;
            while (i < index - 1) {
                nd = nd.next;
                i++;
            }
            if( index == size - 1){
                nd.next = null;
            } else {
                nd.next = nd.next.next;
                nd.next.prev = nd;
            }
        }
        size--;
    }

    @Override
    public T get(int index) {
        Node<T> nd = head;
        int i = 0;
        while (i < index){
            nd = nd.next;
            i++;
        }
        return nd.value;
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
