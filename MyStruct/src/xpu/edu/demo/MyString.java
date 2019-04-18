package xpu.edu.demo;

import java.util.ArrayList;

public class MyString {
    //限制内部是一个char数组
    private char[] charArray;
    //length是指字符串实际长度，而数组长度是charArray.length
    private int length;

    //生成构造方法
    public MyString() {
        this.charArray = new char[20];
        this.length = 0;
    }
    public MyString(int length) {
        this.charArray = new char[length];
        this.length = 0;
    }

    //通过其他字符串构造
    public MyString(MyString other){
        this.charArray = new char[other.charArray.length];
        this.length = other.length;
        System.arraycopy(other.charArray, 0, this.charArray, 0, other.charArray.length);
    }

    public MyString(String aaa){
        char[] chars = aaa.toCharArray();
        this.charArray = new char[chars.length];
        //建议使用arraycopy，因为他是本地方法
        System.arraycopy(chars, 0, this.charArray, 0, chars.length);
        this.length = aaa.length();
    }

    public char[] toChatArray(){
        return this.charArray;
    }

    public int length(){
        return this.length;
    }

    public char charAt(int index){
        return this.charArray[index];
    }

    @Override
    public String toString() {
        for (int i = 0; i < this.length; i++) {
            System.out.print(this.charArray[i]);
        }
        System.out.println();
        return null;
    }
}
