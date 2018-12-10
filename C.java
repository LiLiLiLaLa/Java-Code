//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.InputStream;
//import java.io.OutputStream;
//import java.io.File;
//import java.lang.Exception;
//
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
