package com.yc.singleLinkList.hasNode;

/**
 * Created by yucheng on 2018/8/23.
 * 此处我们演示的是有头结点的情况：
 * 头结点的好处：头结点即在链表的首元结点之前附设的一个结点，该结点的数据域中不存储线性表的数据元素，
 * 其作用是为了对链表进行操作时，可以对空表、非空表的情况以及对首元结点进行统一处理，编程更方便。
 */
public class Node {

    Object element;// 数据域
    Node next;// 指针域
    // 因为头结点是不包含数据的，因此它的构造方法与其它的不同
    // 头结点构造方法
    public Node(Node next){
        this.next = next;
    }
    // 非头结点的结点的构造方法
    public Node(Object element,Node next){
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
        return "element=" + element.toString();
    }
}
