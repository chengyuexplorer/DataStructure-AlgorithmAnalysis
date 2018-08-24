package com.yc.singleCycleLinkList;

/**
 * Created by yucheng on 2018/8/24.
 */
public class MyTest {
    public static void main(String[] args) {
        SingleCycleLinkList scll = new SingleCycleLinkList();

/*        try {
            // 构造数据
            for (int i = 0;i < 10;i++){
                scll.insert(i,i*i);
            }
            // 输出
            for (int i = 0;i < scll.size;i++){
                System.out.print(scll.get(i) + " ");
            }
            System.out.println("\n" + "========================");
            // 删除
            scll.delete(7);
            // 输出
            for (int i = 0;i < scll.size;i++){
                System.out.print(scll.get(i) + " ");
            }
            System.out.println("\n" + "====================");
            // 插入
            scll.insert(5,100);
            for (int i = 0;i < scll.size;i++){
                System.out.print(scll.get(i) + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        Game game = new Game(10,3);
        try {
            game.play();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
