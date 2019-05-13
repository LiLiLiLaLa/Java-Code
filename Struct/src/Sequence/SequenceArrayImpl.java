package Sequence;

import java.util.Arrays;

public class SequenceArrayImpl implements Sequence {
    //存放元素的对象数组
    private Object[] elementData;
    //默认容量
    private final static int DEFAULT_CAPACITY = 10;
    //存放元素个数
    private int size;
    //线性表的最大容量
    private final static int MAX_CAPACITY = Integer.MAX_VALUE - 8;

    /**
     * 初始化存储元素数组，初始化为10
     * @param elementData 存放元素的对象数组
     */
    public SequenceArrayImpl(Object[] elementData) {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    /**
     * 传入初始化长度
     * @param capacity
     */
    public SequenceArrayImpl(int capacity){
        if(capacity > 0){
            this.elementData = new Object[capacity];
        }
    }

    /**
     * 确保没有越界
     * @param cap 传入待判断是否越界的元素个数
     */
    private void ensureCapacityInternal(int cap){
        if(cap - elementData.length > 0) {
            //此时数组长度小于待存放元素个数，需要扩容
            grow(cap);
        }
    }

    /**
     * 扩容
     * @param cap 待存放元素个数
     */
    private void grow(int cap){
        int oldCap = elementData.length;
        //二倍扩容
        int newCap = oldCap << 1;
        if(cap - newCap > 0) {
            //扩容后仍旧不能存放
            newCap = cap;
        }
        if(newCap - MAX_CAPACITY > 0){
            //超出最大值
            throw new IndexOutOfBoundsException("线性表超出最大值");
        }
        //数组扩容，将原数组的内容拷贝到新的扩容后的数组
        elementData = Arrays.copyOf(elementData, newCap);
    }

    @Override
    public void add(Object data) {
        //首先判断添加元素是否会导致数组越界
        //若越界先扩容而后存储
        ensureCapacityInternal(size + 1);
        elementData[size ++] = data;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    /**
     * 判断索引是否合法
     * @param index
     */
    private void rangeCheck(int index){
       if(index < 0 || index >= size){
           throw new IndexOutOfBoundsException("数组越界异常");
       }
    }

    @Override
    public Object get(int index) {
        //判断索引是否合法
        rangeCheck(index);
        return elementData[index];
    }

    @Override
    public boolean contains(Object data) {
        //判断是否有指定内容
        if(data == null){
            for (int i = 0; i < size; i++) {
                if(elementData[i] == null){
                    return true;
                }
            }
        }else{
            for (int i = 0; i < size; i++) {
                //反着调用equals防止数组里面本身有空值
                if(data.equals(elementData[i])){
                    return true;
                }
            }
        }

        return false;
    }

    @Override
    public Object set(int index, Object newData) {
        //判断索引是否合法
        rangeCheck(index);
        Object oldData = elementData[index];
        elementData[index] = newData;
        return oldData;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void clear() {
        for (int i = 0; i < this.size; i++) {
            elementData[i] = null;
        }
        this.size = 0;
    }

    @Override
    public Object[] toArray() {
        return this.elementData;
    }
}
