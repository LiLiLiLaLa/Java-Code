class Person{
    private String name;
    private int age;
    
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj){
        //1.首先判断obj是否属于Person类
        if(!(obj instanceof Person)){
            return false;
        }
        //2.判断当前对象是否和传入地址相同
        if(this == obj){
            return true;
        }
		
        //3.obj确实是Person对象，比较二者属性内容
        //4.向下转型取得Person属性值
        Person per = (Person)obj;
        return(this.name.equals(per.name))&&(this.age == per.age);
    }

    public String toString(){
        return this.name + this.age;
    }
}

public class Test{
    public static void main(String[] args)throws Exception{
        // String str = "邹鸡儿:81|黎美女:18";
        // String[] tem = str.split("\\|");//邹鸡儿：81  黎美女：18
        // for(int i = 0; i < tem.length; i++){
        //     String name = tem[i].split(":")[0];
        //     String age = tem[i].split(":")[1];
        //     System.out.println("姓名：" + name);
        //     System.out.println("年龄：" + age);
        //// Person per = new Person("邹鸡儿",18);
        //// System.out.println(per);
        Person per1 = new Person("邹鸡儿",81);
        Person per2 = new Person("邹小鸡",18);
        System.out.println(per1.equals(per2));
    }
}