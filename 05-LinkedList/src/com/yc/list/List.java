package com.yc.list;

/**
 * Created by yucheng on 2018/8/22.
 * 设计线性表抽象数据类型的Java接口：可以查看JDK源码进行对比
 * 1.求元素个数
 * 2.插入
 * 3.删除
 * 4.查找
 * 5.判断是否为空
 *
 * 注意：此List万不可与java.util.List弄错
 *       在导入包的时候要留意
 */
public interface List {
    // 获取线性表长度
    public int size();
    // 判断线性表是否为空
    public boolean isEmpty();
    // 插入元素
    public void insert(int index,Object obj) throws Exception;
    //删除元素
    public void delete(int index) throws Exception;
    //获取指定位置的元素
    public Object get(int index) throws Exception;
}
