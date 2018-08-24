package com.yc.singleCycleLinkList;

import com.yc.singleLinkList.hasNode.Node;

/**
 * Created by yucheng on 2018/8/24.
 * 单项循环链表的应用举例：
 * 游戏规则：N个人围成一个圈，从第一个人开始传花，当数到M时，该人退出游戏，直到剩下最后一个人。
 */
public class Game {
    // 创建单向循环链表
    SingleCycleLinkList scll = new SingleCycleLinkList();
    int num;// 总人数
    int key;// 数到谁退出

    public Game(int num, int key) {
        this.num = num;
        this.key = key;
    }

    public void play() throws Exception{
        // 构造数据
        for (int i = 0;i < num; i++){
            scll.insert(i,i);
        }
        System.out.println("游戏开始之前");
        for (int i = 0;i < scll.size; i++){
            System.out.print(scll.get(i) + " ");
        }
        System.out.println("游戏开始....");

        int iCount = num;// 刚开始时等于总人数
        int j = 0;//
        Node node = scll.head;// 一开始指向头结点
        while(iCount!=1)
        {
            if(node.getElement()!=null&& Integer.parseInt(node.getElement().toString())!=-1)
            {
                j++;
                if(j%key==0)
                {
                    node.setElement(-1);
                    iCount--;
                    System.out.println();
                    for(int i=0;i<scll.size;i++)
                    {
                        System.out.print(scll.get(i)+" ");
                    }
                }
            }
            node = node.next;
            }
        System.out.println("\n-------游戏结束---------\n");
        for(int i=0;i<scll.size;i++)
        {
            System.out.print(scll.get(i)+" ");
        }
    }
}
