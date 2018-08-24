package com.yc.stack;

import java.util.Scanner;

/**
 * Created by yucheng on 2018/8/24.
 */
public class Test {
    public static void main(String[] args) throws Exception{
        SequenceStack ss = new SequenceStack();
        Scanner in = new Scanner(System.in);
        int temp;
        for (int i = 0;i < 10;i++){
            System.out.println("请在屏幕输入第" + i + "数据：");
            temp = in.nextInt();
            ss.push(temp);
        }
        for (int i = 0;i < 10;i++){
            System.out.print(ss.pop() + " ");
        }
    }
}
