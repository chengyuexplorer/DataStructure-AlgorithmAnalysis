package com.yc.stack;

/**
 * Created by yucheng on 2018/8/24.
 */
public interface Stack {

    // 压栈
    public void push(Object obj) throws Exception;
    // 弹栈
    public Object pop() throws Exception;
    // 获取栈顶元素
    public Object getTop() throws Exception;
    // 判断是否为空
    public boolean isEmpty();
}
