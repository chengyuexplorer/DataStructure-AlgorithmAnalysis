package com.yc.sequenceList;

import com.yc.list.List;

/**
 * Created by yucheng on 2018/8/22.
 * 顺序表：在物理存储结构上连续，大小固定
 *         使用顺序结构实现的线性表称为顺序表
 */
public class SquenceList implements List{
    // 默认顺序表的最大长度
    final int defaultSize = 10;
    // 最大长度
    int maxSize;
    // 当前长度
    int size;
    // 对象数组
    Object[] listArray;

    // 没有指定大小时，用默认最大长度构造顺序表
    public SquenceList() {

        init(defaultSize);
    }
    // 按指定长度构造顺序表
    public SquenceList(int size) {
        init(size);
    }

    //顺序表的初始化方法
    private void init(int size) {
        maxSize = size;
        this.size = 0;
        listArray = new Object[size];
    }
    @Override
    public int size() {// 返回顺序表的的尺寸大小
        return size;
    }

    @Override
    public boolean isEmpty() {// 判断顺序表是否为空
        return size == 0;
    }

    @Override
    public void insert(int index, Object obj) throws Exception {
        // 判断顺序表是否已满
        if (size == maxSize){
            throw new Exception("顺序表已满！");
        }
        // 判断输入是否正确,插入不能乱插，
        if(index < 0 || index > size){
            throw  new Exception("参数输入错误");
        }
        for (int j = size -1;j >= index;j--){
            // 依次将元素项往后移动一位
            listArray[j+1] = listArray[j];
        }
        listArray[index] = obj;
        size++;
    }

    @Override
    public void delete(int index) throws Exception {
        // 判断顺序表中是否还有元素
        if(isEmpty()){
            throw new Exception("顺序表为空，无法删除！");
        }
        // 判断输入是否正确
        if(index < 0 || index > size-1){
            throw  new Exception("参数输入错误");
        }
        for(int j = index; j < size-1; j++){
            listArray[j] = listArray[j+1];
        }

        size--;
    }

    @Override
    public Object get(int index) throws Exception {
        if(index < 0 || index > maxSize){
            throw  new Exception("参数输入错误");
        }
        return listArray[index];
    }
}
