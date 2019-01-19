//public class Test{
//    public static void main(String[] args) {
//        int line = 10;
//        for(int x = 0; x < line; x ++){
//            for (int y = 0; y < line; y ++){
//                System.out.print(" ");
//            }
//            for(int z = 0; z < x; z ++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}
//
//if(布尔表达式){
//    //条件满足时执行代码
//        }else{
//    条件不满足时执行代码
//        }
//
//
//if(布尔表达式1){
//    //条件1满足时执行代码
//        }else if(布尔表达式2){
//    //条件2满足时执行代码
//        }....
//         else{
//             //以上条件均不满足时执行代码
//        }

//switch(数字|枚举|字符|字符串){
//    case 内容1:{
//        内容1满足时执行代码;
//        break;
//        }
//    case 内容2:{
//        内容2满足时执行代码;
//        break;
//        }
//    case 内容3:{
//        内容3满足时执行代码;
//        break;
//        }
//    .....
//    default:{
//         以上内容均不满足时执行语句;
//         break;
//         }
//}

//import java.io.IOException;
//
//public class Test{
//    public static void main(String[] args) throws IOException {
//        System.out.println("请输入字符：");
//        char x = (char) System.in.read();
//        switch(x){
//            case 'a':{
//                System.out.println("邹大炮是猪");
//                break;
//            }
//            case 'b':{
//                System.out.println("邹大炮不是猪");
//                break;
//            }
//            default:{
//                System.out.println("邹大炮原来是瓜娃子");
//                break;
//            }
//        }
//    }
//}
////请输入字符：
////a
////邹大炮是猪
//
////请输入字符：
////b
////邹大炮不是猪
////邹大炮原来是瓜娃子

//while(控制循环的条件判断){
//    循环语句;
//    修改条件内容;
//        }
//
//do{
//   循环语句;
//   修改条件内容;
//        }while(控制循环的条件判断);

//for(循环初始化;循环结束的条件判断;修改条件内容){
//    循环体;
//        }

public class Test{
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i*j + "\t");
            }
            System.out.println();
        }
    }
}
//输出
//1*1=1
//1*2=2	2*2=4
//1*3=3	2*3=6	3*3=9
//1*4=4	2*4=8	3*4=12	4*4=16
//1*5=5	2*5=10	3*5=15	4*5=20	5*5=25
//1*6=6	2*6=12	3*6=18	4*6=24	5*6=30	6*6=36
//1*7=7	2*7=14	3*7=21	4*7=28	5*7=35	6*7=42	7*7=49
//1*8=8	2*8=16	3*8=24	4*8=32	5*8=40	6*8=48	7*8=56	8*8=64
//1*9=9	2*9=18	3*9=27	4*9=36	5*9=45	6*9=54	7*9=63	8*9=72	9*9=81