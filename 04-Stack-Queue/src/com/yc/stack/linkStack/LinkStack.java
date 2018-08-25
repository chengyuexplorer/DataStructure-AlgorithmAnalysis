package com.yc.stack.linkStack;

import com.yc.stack.Stack;

/**
 * Created by yucheng on 2018/8/25.
 */
public class LinkStack implements Stack {
    Node head; // 栈顶指针
    int size;  // 栈大小

    public LinkStack() {
        // 刚开始时，栈为空，因此栈顶指针为null,size为0
        this.head = null;
        this.size = 0;
    }
    // 压栈
    @Override
    public void push(Object obj) throws Exception {
        // 压栈操作：将栈顶指针移向新插入的结点，
        // 并将该结点的指针指向之前栈顶指针指向的位置
        head = new Node(obj,head);
        size++;
    }
    // 弹栈
    @Override
    public Object pop() throws Exception {
        // 判定是否为空
        if (isEmpty()){
            throw new Exception("堆栈为空！");
        }
        // 弹栈操作：1.返回结点的element 2.将栈顶指针下移
        Object obj = head.getElement();
        head =head.getNext();
        size--;
        return obj;
    }

    @Override
    public Object getTop() throws Exception {
        // 判定是否为空,
        if (isEmpty()){
            throw new Exception("堆栈为空！");
        }
        return head.getElement();
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
        // or return head == null;
    }
}
