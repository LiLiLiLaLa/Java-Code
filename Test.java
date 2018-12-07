//abstract class Person{
//    private String name;
//    public String getname(){
//        return name;
//    }
//    public abstract void home();
//}

//class Student extends Person{
//    public void home(){
//        System.out.println("邹鸡儿吃狗屎");
//    }
//}

//public class Test{
//    public static void main(String[] args){
//        // Person  per1 = new Person();
//        // per1.name = "邹二狗";
//        // per1.age = 20;
//        // per1.eat();
//        // per1.sleep();
//        // per1.work();
//        Person per = new Student();
//        per.home();
//    }
//}

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.SQLOutput;

//public class Test {
//    public static void main(String[] args){
//        //获取File对象
//        File file = new File("C:" + File.separator + "Users"
//                + File.separator + "15291" + File.separator + "Desktop"
//                + File.separator + "bit");
//        //判断父路径是否存在，不存在创建多级父路径
//        if(!file.getParentFile().exists()){
//            file.getParentFile().mkdirs();
//        }
//        //判断文件是否存在，不存在创建文件
//        if(file.exists()){
//            System.out.println("文件已存在");
//        }else{
//            try{
//                file.createNewFile();
//            }catch(IOException e){
//                e.printStackTrace();
//            }
//        }
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        //获取File对象
//        File file = new File("C:" + File.separator + "Users"
//                + File.separator + "15291" + File.separator + "Desktop");
//        //将IO操作放在子线程中进行
//        new Thread(()->{
//            long start = System.currentTimeMillis();
//            listAllFiles(file);
//            long end = System.currentTimeMillis();
//            System.out.println("桌面文件遍历结束，共耗时：" + (end - start) + "毫秒");
//        }).start();
//        System.out.println("main线程结束");
//    }
//    public static void listAllFiles (File file){
//        if (file.isFile()) {
//            System.out.println(file);
//        } else {
//            if (file.exists() && file.isDirectory()) {
//                File[] files = file.listFiles();
//                for (File file1 : files) {
//                    listAllFiles(file1);
//                }
//            }
//        }
//    }
//}

public class Test{
    public static void main(String[] args) throws Exception{
        //取得终端对象
        File file = new File("C:" + File.separator + "Users"
                + File.separator + "15291" + File.separator + "Desktop"
                + File.separator + "bit");
        //取得指定文件的输出流
        OutputStream out = new FileOutputStream(file,true);
        //进行数据的输出
        String str = "hello world";
        out.write(str.getBytes(),6,5);
        //关闭流
        out.close();
    }
}
