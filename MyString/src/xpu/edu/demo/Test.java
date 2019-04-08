package xpu.edu.demo;

public class Test {
    public static void main(String[] args) {
        MyString my = new MyString();
        MyString my1 = new MyString(11);
        MyString my2 = new MyString("aaa");
        MyString my3 = new MyString(my2);
        my.toString();
        my1.toString();
        my2.toString();
        my3.toString();
    }
}
