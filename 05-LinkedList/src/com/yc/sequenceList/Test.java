package com.yc.sequenceList;

/**
 * Created by yucheng on 2018/8/23.
 */
public class Test {
    public static void main(String[] args) {
        SquenceList sl = new SquenceList(20);
        try {
            sl.insert(0,22);
            sl.insert(0,33);
            sl.insert(1,44);
            for (int i = 0;i < sl.size();i++){
                System.out.print(sl.get(i) + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
