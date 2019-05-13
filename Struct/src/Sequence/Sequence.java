package Sequence;

/**
 * 为什么定义一个接口？
 * 自由替换实现方式（接口优先原则）
 */
public interface Sequence {
    /**
     * 添加元素
     * @param data 要添加的元素
     */
    void add(Object data);

    /**
     * 删除指定下标的元素
     * @param index 给定的要删除元素的下标
     * @return 是否删除成功
     */
    boolean remove(int index);
    /**
     * 查找指定索引的元素
     * @param index 要查找元素的索引
     * @return 返回指定索引对应的元素
     */
    Object get(int index);

    /**
     * 判断线性表中是否有指定元素
     * @param data
     * @return 是否存在
     */
    boolean contains(Object data);

    /**
     * 修改线性表中指定索引的内容
     * @param index 要修改元素的下标
     * @param newData 新修改的数据
     * @return 返回修改前的元素
     */
    Object set(int index, Object newData);

    /**
     * @return 返回当前线性表中元素个数
     */
    int size();
    /**
     * 清空线性表
     */
    void clear();

    /**
     * 将线性表转换为数组
     * @return 返回一个存放实际内容的数组
     */
    Object[] toArray();
}
