public class Aa{
    public static void main(String[] args){

        System.out.println(strMakeOfNum("abc"));
    }
    //判断给定字符串是否由数字组成
    public static boolean strMakeOfNum(String str){
        char[] arr = str.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(!(arr[i] <= '9' && arr[i] >= '0')){
                return false;
            }
        }
        return true;
    }
}