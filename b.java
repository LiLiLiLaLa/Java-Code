
public class Test{
    public static void main(String[] args) {
        //首字母大写
        System.out.println(fistUpper("zoujier"));//Zoujier
        System.out.println(fistUpper(""));//
        System.out.println(fistUpper("z"));//Z
    }
    public static String fistUpper(String str) {
        //字符串为null或者长度为0时
        if ("".equals(str)||str==null) {
            return str ;
        }
        //字符串长度大于1时
        if (str.length()>1) {
            return str.substring(0, 1).toUpperCase()+str.substring(1) ;//取出第一个字符转大写再拼接第一个字母之后的内容
        }
        //字符串只要一个字符时
        return str.toUpperCase() ;

//        System.out.println("hello".isEmpty());//false
//        System.out.println("".isEmpty());//true
//        System.out.println(new String().isEmpty());//true

//        String str = "hello" ;
//        System.out.println(str.length());//5

//        String str = "   hello%$$&%%&*WORLD  zoujierchibaba ";
//        System.out.println(str.toUpperCase());//   HELLO%$$&%%&*WORLD  ZOUJIERCHIBABA
//        System.out.println(str.toLowerCase());//   hello%$$&%%&*world  zoujierchibaba

//        String str = "    hello  world";
//        System.out.println("[" + str + "]");//[    hello  world]
//        System.out.println("[" + str.trim() + "]");//[hello  world]

//        String str = "helloworld";
//        System.out.println(str.substring(5));//world
//        System.out.println(str.substring(3,5));//low

//        String str = "zoujier:18|zoudapao:81";
//        String[] result = str.split("\\|");
//        for(int i = 0; i < result.length; i ++){
//            String[] tmp = result[i].split(":");
//            System.out.println(tmp[0] + "=" +tmp[1]);
//        }

//        String str = "192.168.1.1";
//        String[] result = str.split("\\.");
//        for(String s : result){
//            System.out.println(s);
//        }

//        String str = "hello world hello bit";
//        String[] result = str.split(" ",2);
//        for(String s : result){
//            System.out.println(s);
//        }
//        //hello
//        //world hello bit

//        String str = "hello world hello bit";
//        String[] result = str.split(" ");//按照空格拆分
//        for(String s : result){
//            System.out.print(s);//hello   world   hello   bit
//        }

//        String str = "helloworld";
//        System.out.println(str.replaceAll("l","-"));//he--owor-d
//        System.out.println(str.replaceFirst("l","-"));// he-loworld

//        String str = "helloworld";
//        System.out.println(str.indexOf("world"));//true
//        System.out.println(str.indexOf("lili"));//-1
//        if(str.indexOf("hello") != -1){
//            System.out.println("可以查到指定字符串");//可以查到指定字符串
//        }

//        System.out.println("A".compareTo("a"));//-32
//        System.out.println("a".compareTo("A"));//32
//        System.out.println("A".compareTo("A"));//0
//        System.out.println("AB".compareTo("AC"));//-1
//        System.out.println("刘".compareTo("杨"));//-5456

//        String str = "helloworld";
//        System.out.println(str.indexOf("l"));//2
//        System.out.println(str.indexOf("l",5));//8
//        System.out.println(str.lastIndexOf("l"));//8

//        String str = "**@@helloworld!!";
//        System.out.println(str.startsWith("**"));//true
//        System.out.println(str.startsWith("@@"));//false
//        System.out.println(str.startsWith("@@",2));//true
//        System.out.println(str.endsWith("!!"));//true
//        System.out.println(str.endsWith("d"));//false
    }
}