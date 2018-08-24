package com.yc.stack;

/**
 * Created by yucheng on 2018/8/24.
 */
public class SequenceStack implements Stack {

    Object[] stack;            // 对象数组(栈用数组来实现)
    final int defaultSize = 10;// 默认最大长度
    int top;                   // 栈顶位置（的一个下标），可以理解成栈的实际长度
    int maxSize;               // 最大长度

    // 无参的构造器
    public SequenceStack() {
        init(defaultSize);
    }

    public SequenceStack(int size) {
       init(size);
    }

    // 初始化方法
    private void init(int size){
        maxSize = size;
        top = 0;
        stack = new Object[size];
    }
    @Override
    public void push(Object obj) throws Exception {
        // 判断栈是否已满
        if(top == maxSize){
            throw new Exception("堆栈已满！");
        }
        stack[top] = obj;
        top++;
    }

    @Override
    public Object pop() throws Exception {
        // 判断栈是否为空
        if(isEmpty()){
            throw new Exception("堆栈为空！");
        }
        // 注意：本质上这个对象在这一次操作中并没有被删除
        top--;
        return stack[top];
    }

    @Override
    public Object getTop() throws Exception {
        if(isEmpty()){
            throw new Exception("堆栈为空！");
        }
        return stack[top-1];
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }
}
