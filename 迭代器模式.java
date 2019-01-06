// Copyright(C) 2000-2003 Yoshinori Oota All rights reserved.

public class IteratorSample
{
    static public Aggregate CreateArray()
    {
        AggregateArray array = new AggregateArray(8);
        array.add("item1");
        array.add("Item2");
        array.add("Item3");
        array.add("Item4");
        array.add("Item5");
        array.add("Item6");
        array.add("Item7");
        array.add("Item8");
        return array;
    }
    static public void main(String[] args)
    {
        Aggregate array = CreateArray();
        Iterator it = array.CreateIterator();
        for (it.First(); !it.IsDone(); it.Next())
        {
            System.out.println((String)it.CurrentItem());
        }
    }
}


// abstract class
abstract class Aggregate
{
    abstract public Iterator CreateIterator();
}

// concrete class
class AggregateArray extends Aggregate
{
    private Object[] _objects = null;
    private int _capacity = 0;
    private int _current = 0;
    public AggregateArray(int size)
    {
        _objects = new Object[size];
        _capacity = size;
        for (int i = 0; i < _capacity; ++i)
        {
            _objects[i] = null;
        }
    }
    public Iterator CreateIterator()
    {
        return (Iterator)(new ArrayIterator(this));
    }
    public boolean add(Object object)
    {
        if (_current >= _capacity) return false;
        _objects[_current] = null;
        _objects[_current] = object;
        ++_current;
        return true;
    }
    int size()
    {
        return _current;
    }
    Object get(int index)
    {
        if (index > _current) return null;
        return _objects[index];
    }
}

// abstract class
abstract class Iterator
{
    abstract public void First();
    abstract public void Next();
    abstract public boolean IsDone();
    abstract public Object CurrentItem();
}

//concrete class
class ArrayIterator extends Iterator
{
    private AggregateArray _array = null;
    private int _pointer = -1;

    public ArrayIterator(AggregateArray array)
    {
        _array = array;
        _pointer = 0;
    }
    public void First()
    {
        _pointer = 0;
    }
    public void Next()
    {
        ++_pointer;
    }
    public boolean IsDone()
    {
        return _pointer >= _array.size();
    }
    public Object CurrentItem()
    {
        return _array.get(_pointer);
    }
}
