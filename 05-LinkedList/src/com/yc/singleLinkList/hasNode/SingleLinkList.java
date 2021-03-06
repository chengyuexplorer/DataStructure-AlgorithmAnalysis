package com.yc.singleLinkList.hasNode;

import com.yc.list.List;

/**
 * Created by yucheng on 2018/8/23.
 * 单向循环链表类:
 */
public class SingleLinkList implements List {

    Node head;   // 头指针
    Node current;// 当前结点对象
    int size;    // 结点的个数

    // 构造器
    public SingleLinkList(){
        head = current = new Node(null);
        size = 0;
    }

    public void index(int index) throws Exception{
        // 验证输入
        if(index < -1 || index > size-1){
            throw new Exception("输入错误！");
        }
        if(index==-1)    //说明在头结点之后操作，因为第一个数据元素结点的下标是0，那么头结点的下标自然就是-1了。
            return;
        current = head.next;// 将当前对象定位到头结点的下一个结点
        int j=0;//循环变量
        // 实际是将当前对象定位到要操作的对象的前一个对象
        while(current != null&& j < index) {
            current = current.next;
            j++;
        }
    }
    @Override
    public void insert(int index, Object obj) throws Exception {
        // 输入检查
        if (index < 0 || index > size){
            throw new Exception("输入错误！");
        }
        index(index-1);// 定位到要插入的位置的前一个对象
        // setNext使current的指针指向new node(),而current.next则使new Node()的指向指向下一个对象
        current.setNext(new Node(obj,current.next));
        size++;//尺寸加1
    }

    @Override
    public void delete(int index) throws Exception {
        if (isEmpty()){
            throw new Exception("链表为空e!");
        }
        // 输入检查
        if (index < 0 || index > size){
            throw new Exception("输入错误！");
        }
        index(index-1);
        current.setNext(current.next.next);
        size--;
    }

    @Override
    public Object get(int index) throws Exception {
        // 验证输入
        if(index < -1 || index > size-1){
            throw new Exception("输入错误！");
        }
        // 1.将当前对象current定位到index对象
        index(index);// 这样current就定位到第index个对象了
        return current.getElement();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
