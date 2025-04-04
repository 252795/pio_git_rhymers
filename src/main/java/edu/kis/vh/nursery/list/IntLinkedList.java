package edu.kis.vh.nursery.list;



public class IntLinkedList {


    Node last;
    private static final int EMPTY_VALUE = -1;  //Stała dla pustej wartości
    int i;

    private static class Node {

        public final int value;
        public Node prev, next;

        public Node(int i) {
            value = i;
        }

    }

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }



    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return EMPTY_VALUE;
        return last.value;
    }


    public int pop() {
        if (isEmpty())
            return EMPTY_VALUE;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}