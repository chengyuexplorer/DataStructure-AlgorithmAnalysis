package com.yc.singleLinkList.hasNode;

import com.yc.list.List;

/**
 * Created by yucheng on 2018/8/23.
 * 单链表类:
 * 注意：
 * 1.因为第一个结点的下标是0，那么自然头结点的下标是-1
 * 关键：
 * 设置了一个current对象，使得每次操作前，利用index()方法使current对象定位到要操作位置的前一个对象
 */
public class SingleLinkList implements List {

    Node head;   // 头指针
    Node current;// 当前结点对象
    int size;    // 结点的个数

    // 构造器
    public SingleLinkList(){
        // 初始化头结点,使头指针指向头结点，
        // 且刚初始化时只有一个头指针和一个头结点，而且头结点中没有数据
        head = current = new Node(null);
        // 链表的初始长度为零，头结点不算在链表长度内
        size = 0;
    }

    // 比如我们要在a2这个节点之前进行插入操作，那就先要把当前节点对象定位到a1这个节点，然后修改a1节点的指针域
    // 定位函数：即我们要对某个结点进行操作进行，我们需要做两个动作
    // 如插入操作：
    // 1.找到前一个结点，将其指针指向我们要插入的结点
    // 2.将我们要插入的结点的指针指向下一个结点
    // 删除操作
    // 1.找到前一个结点，将其指针指向下一个结点
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
        while(current != null&&j<index) {
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
            throw new Exception("链表为空!");
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
