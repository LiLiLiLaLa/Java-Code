//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.InputStream;
//import java.io.OutputStream;
//import java.io.File;
//import java.lang.Exception;
//public class C {
//    public static void main(String[] args) throws Exception {
//        //源文件路径
//        String sourceFilPath ="C:\\Users\\15291\\Desktop\\Lock笔记.TXT";
//        //目标文件路径
//        String destFilePath = "C:\\Users\\15291\\Desktop\\Lock笔记1.TXT";
//        copyFile(sourceFilPath,destFilePath);
//    }
//    public static void copyFile(String sourceFilePath,String destFiePath) throws Exception{
//        //取得源文件与目标文件的FILE对象
//        File sourceFile = new File(sourceFilePath);
//        File destFile = new File(destFiePath);
//        //取得源文件的输入流和目标文件的输出流
//        InputStream in = new FileInputStream(sourceFile);
//        OutputStream out = new FileOutputStream(destFile);
//        //数据的输入输出
//        int len = 0;
//        byte[] data = new byte[1024];
//        long start = System.currentTimeMillis();
//        while((len = in.read(data)) != -1){
//            out.write(data,0,len);
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("共耗时" + (end - start) + "毫秒");
//    }
//}

public class C{
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("hellojier");
        System.out.println(s.delete(5,17).insert(1,"你好"));//你好hello
//        StringBuffer s = new StringBuffer("hellozoujier");
//        System.out.println(s.delete(5,7));//hellojier
////        StringBuffer s = new StringBuffer("zoujierchibaba");
////        System.out.println(s.reverse());
//////        StringBuffer sb = new StringBuffer();
//////        sb.append("Hello").append("zoujier");
//////        fun(sb);
//////        System.out.println(sb);
    }

    public static void fun(StringBuffer temp){
        temp.append("\n").append("www.zoudapaochibaba.cn");
    }
}

//class Person{
//    private String name;
//    private int age;
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//}
//
//class Student{
//    private String name;
//    private int age;
//    private String school;
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setSchool(String school) {
//        this.school = school;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getSchool() {
//        return school;
//    }
//}


//class Person{
//    private String name;
//    private int age;
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//}
//
////定义一个子类
//class Student extends Person{
//    private String school;
//
//    public String getSchool() {
//        return school;
//    }
//
//    public void setSchool(String school) {
//        this.school = school;
//    }
//}
//
//public class Test{
//    public static void main(String[] args){
//        Student stu = new Student();
//        stu.setName("Steven");
//        stu.setAge(18);
//        stu.setSchool("高新一中");
//        System.out.println("姓名：" + stu.getName() + "，年龄：" + stu.getAge() + "，学校是：" + stu.getSchool());
//
//    }
//}
////姓名：Steven，年龄：18，学校是：高新一中

//class Person{
//    public Person(){
//        System.out.println("父类对象产生");
//    }
//}
//class Student extends Person{
//    public Student(){
//        super() ; //此语句在无参时写于不写一样
//        System.out.println("子类对象产生");
//    }
//}
//public class Test{
//    public static void main(String[] args) {
//        new Student();
//    }
//}
////父类对象产生
////子类对象产生

//class Person{
//    private String name;
//
//    public String getName(){
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}
//
//class Student extends Person{
//    public void fun(){
//        System.out.println(getName());
//    }
//}
//
//public class Test{
//    public static void main(String[] args) {
//        Student stu  = new Student();
//        stu.setName("Steven");
//        System.out.println(stu.getName());
//        stu.fun();
//    }
//}
////Steven
////Steven

class Person{
    public void print(){
        System.out.println("1.Person类的print方法");
    }
}

class Student extends Person{
    public void print(){
        System.out.println("2.Student类的print方法");
    }
}

public class Test{
    public static void main(String[] args) {
        new Student().print();
    }
}
//2.Student类的print方法
