//斐波那契数列
//public class Test {
//    public static void main(String[] args) {
//        System.out.println(fibonacciSequence(3));
//    }
//
//    public static <retuen> long fibonacciSequence(long n){
//        if(n < 0){
//            //抛出异常
//            throw new IllegalArgumentException("fibonacci n must be more thran 0");
//        }
//        if(n == 0){
//            return 0;
//        }
//        if(n == 1){
//            return 1;
//        }
//        return fibonacciSequence(n - 1) + fibonacciSequence(n - 2);
//    }
//}

import com.sequence.Sequence;
import com.sequence.SequenceArrayImpl;

public class Test{
    public static void main(String[] args) {
        Sequence seq = new SequenceArrayImpl(2);
        seq.add(1);
        seq.add(2);
        seq.add(3);
        seq.add(null);
        System.out.println(seq.contains(null));
        System.out.println(seq.contains(20));
        System.out.println(seq.contains(2));
    }
}