package com.bridgelabz.hashtable;

public class MyLinkedList<K> {
    public INode head;
    private INode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void append(INode newNode) {
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            INode tempNode = this.tail;
            tempNode.setNext(newNode);
            this.tail = newNode;
        }
    }



    public INode search(K key) {
        if (this.head == null) {
        } else {
            INode tempNode = head;
            while (!tempNode.equals(this.tail)) {
                if (tempNode.getKey().equals(key)) {
                    return tempNode;
                } else {
                    tempNode = tempNode.getNext();
                }
            }
            if (tempNode.getKey().equals(key)) {
                return tempNode;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head + '}';
    }
}