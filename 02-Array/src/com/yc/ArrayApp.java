package com.yc;

/**
 * Created by yucheng on 2018/8/22.
 */
public class ArrayApp {
    public static void main(String[] args) {
        long[] arr; // 创建一个数组的索引
        arr = new long[100]; // 创建数组
        int nElems = 0;
        int j;
        long serachKey;
        // ==================================================
        arr[0] = 77;// 插入10记录
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        arr[7] = 00;
        arr[8] = 66;
        arr[9] = 33;
        nElems =10; // 数组中有10条记录
        // ===================================================
        for (j = 0;j < nElems; j++){    // 输出数组
            System.out.println(arr[j] + " ");
        }

        // ====================================================
        serachKey = 55;
        for (j = 0;j < nElems;j++){
            if (arr[j] == serachKey){
                break;// 跳出循环
            }
        }
        if (j == nElems){
            // 表示已经将数组查询完了
            System.out.println("can't find " + serachKey);
        }
        else
            System.out.println("found " + serachKey);

        // ======================================================
        serachKey = 66; // 删除66，第一步先找到66，第二步删除
        for (j = 0;j < nElems;j++){// 找
            if (arr[j] == serachKey){
                break;// 跳出循环
            }
        }
        for (int k = j;k < nElems; k++){// 删
            arr[k] = arr[k+1];
        }
        nElems--;

        // =======================================================
        for (j = 0;j < nElems; j++){    // 输出数组
            System.out.println(arr[j] + " ");
        }
    }
}
