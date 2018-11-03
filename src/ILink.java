/**
 * @author L
 * 链表接口
 */
public interface ILink {
    /**
     * 添加一个元素
     * @param obj 要添加的元素
     */
    void add(Object obj);

    /**
     * 删除obj对象
     * @param obj 要删除的obj对象
     * @return是否删除成功
     */
    boolean remove(Object obj);
    /**
     * 更改指定位置结点数据
     * @param index 索引
     * @param newData 新的数据
     * @return 返回删除前数据
     */
    Object set(int index,Object newData);

    /**
     * 根据索引获取该结点数据
     * @param index 指定索引
     * @return 目的结点数据
     */
    Object get(int index);

    /**
     * 判断指定数据是否存在
     * @param data 指定数据
     * @return 返回-1表示不存在，存在返回该数据所在结点索引
     */
    int contains(Object data);

    /**
     * 求链表长度
     * @return 链表长度
     */
    int size();

    /**
     * 清空链表
     */
    void clear();

    /**
     * 把链表转化为数组
     * @return 返回转换之后的数组
     */
    Object[] toArray();
    /**
     * 打印链表
     */
    void linkPrint();
}

