package com.yc.stack.linkStack;

/**
 * Created by yucheng on 2018/8/25.
 */
public class Test {
    public static void main(String[] args) throws Exception{
        // 创建一个空栈
        LinkStack ls = new LinkStack();
        // 压栈：输出测试数据
        for (int i = 0; i < 10; i++){
            ls.push(i);
        }
        // 弹栈
        while (!ls.isEmpty()){
            System.out.print(ls.pop() + " ");
        }
    }
}
