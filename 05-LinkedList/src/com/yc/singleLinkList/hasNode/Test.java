package com.yc.singleLinkList.hasNode;

/**
 * Created by yucheng on 2018/8/23.
 */
public class Test {
    public static void main(String[] args) {
        SingleLinkList sll = new SingleLinkList();
        try {
            // 构造数据
            for (int i = 0;i < 10;i++){
            sll.insert(i,i*i);
            }
            // 输出
            for (int i = 0;i < sll.size;i++){
                System.out.print(sll.get(i) + " ");
            }
            System.out.println("\n" + "====================");
            // 删除
            sll.delete(7);
            // 输出
            for (int i = 0;i < sll.size;i++){
                System.out.print(sll.get(i) + " ");
            }
            System.out.println("\n" + "====================");
            // 插入
            sll.insert(5,100);
            for (int i = 0;i < sll.size;i++){
                System.out.print(sll.get(i) + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
