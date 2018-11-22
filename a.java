String str1 = "Hello";
String str2 = "Hello";
String str3 = "Hello";
System.out.println(str1 == str2);//true
System.out.println(str1 == str3);//true
System.out.println(str2 == str3);//true
String str = new String("Hello");

//共享问题：该字符串常量并没有保存在对象池之中
String str1 = new String("hello");
String str2 = "hello";
System.out.println(str1 == str2);//false

String str1 = new String("hello").intern();
String str2 = "hello";
System.out.println(str1 == str2);//true

String str = "hello";
str = str + "world";
str += "!!!";
System.out.println(str);//hello world!!!

String str = "hello";
for(int i = 0; i < 100; i++){
	str += i;
}
Ststem.out.println(str);

//charAt()方法
String str = "hello";
System.out.println(str.charAt(0));//h
System.out.println(syr.charAt(10));//StringIndexOutOfBoundsException

String str = "helloworld";
//字符串变为字符数组
char[] data = str.toCharArray();
for(int i = 0; i < data.length; i++){
	data[i] -= 32;
	System.out.println(data[i] + "、")；
}
//字符数组变为字符串
System.out.println(new String(data));//全部转换
System.out.println(new String(data,5,5));//部分转换

String str = "helloworld";
byte[] data = str.getBytes();
for(int i = 0; i < data.length; i++){
	data[i] -= 32;
	System.out.println(data[i] + "、")；
}
System.out.println(new String(data));

//不区分大小写的比较
String str1 = "hello";
String str2 = "Hello";
System.out.println(str1.equals(str2));//false
System.out.println(str1.equalsIgnoreCase(str2));//true

System.out.println("A".compareTo("a"));//-32
System.out.println("a".compareTo("A"));//32
System.out.println("A".compareTo("A"));//0
System.out.println("AB".compareTo("AC"))；//-1
System.out.println("刘".compareTo("杨"))；