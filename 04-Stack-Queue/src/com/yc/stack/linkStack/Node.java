package com.yc.stack.linkStack;

/**
 * Created by yucheng on 2018/8/25.
 */
public class Node {
    Object element; // 数据域
    Node next;      // 指针域,在Java中实际就是一个引用

    // 头结点构造器(头结点无数据)
    public Node(Node next) {
        this.next = next;
    }

    // 非头结点的结点构造器
    public Node(Object element, Node next) {
        this.element = element;
        this.next = next;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return  element.toString();
    }
}
