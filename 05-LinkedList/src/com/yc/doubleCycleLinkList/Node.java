package com.yc.doubleCycleLinkList;

/**
 * Created by yucheng on 2018/8/24.
 */
public class Node {
    Object element;// 数据域
    Node next;     // 后进指针域
    Node prior;    // 前驱指针域

    // 头结点构造器
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

    public Node getPrior() {
        return prior;
    }

    public void setPrior(Node prior) {
        this.prior = prior;
    }

    @Override
    public String toString() {
        return element.toString();
    }
}
