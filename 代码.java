package bit.reflect;

import java.lang.reflect.Method;

class Person {
     private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Test {
    public static void main(String[] args) throws Exception{
//        Person per = new Person();
//        per.setName("张三");
//        System.out.println(per.getName());
        // 1.取得Class对象
        Class<Person> cls = Person.class;
        // 2.组装方法名称
        String setMethodName = "set"+initCap(args[0]);
        String getMethodName = "get"+initCap(args[0]);
        // 3.取得Method对象
        Method setMethod = cls.getMethod(setMethodName,String.class);
        Method getMethod = cls.getMethod(getMethodName);
        // 4.取得Person类实例化对象而后调用方法
        Person per = cls.newInstance();
        setMethod.invoke(per,"张三");
        System.out.println(getMethod.invoke(per));
    }
    private static String initCap(String str) {
        return str.substring(0,1).toUpperCase()+
                str.substring(1);
    }
}


BeanUtil.java
package bit.reflect;

import java.lang.reflect.Method;

/**
 * 操作简单类属性设置的工具类
 * @author yuisama
 * @date 2018/12/2 15:19
 */
public class BeanUtil {
    private BeanUtil(){}
    /**
     *
     * @param actionObj 拿到提供给用户使用的xxAction类
     * @param beanValue 要设置的具体值
     *"emp.name:dange|emp.job:Coder"
     */
    public static void setBeanValue(Object actionObj,String beanValue) throws Exception{
         String[] temp = beanValue.split("\\|");
         for(int i = 0;i < temp.length;i++) {
             // emp.name:dange
             String[] result = temp[i].split(":");
             // emp.name
             // dange
             String realValue = result[1];
             // emp.name
             String className = result[0].split("\\.")[0];
             String attrName = result[0].split("\\.")[1];
             Object realObj = getRealObject(actionObj,className);
             // TODO
             // 调用真正类的setter方法设置属性值
             // 取得真正主题类的class对象
             Class<?> cls = realObj.getClass();
             // 拼装setter方法名
             String setName  = "set" + initCap(attrName);
             // 取得setter方法的method对象
             Method setMethod = cls.getMethod(setName,String.class);
             // 调用invoke通过反射设置值
             setMethod.invoke(realObj,realValue);
         }
    }
    /**
     * 取得真正操作的对象
     * @param actionObj
     * @param className 要操作的类名称
     * @return
     */
    private static Object getRealObject(Object actionObj,
                                        String className) throws Exception{
        // 1.取得xxAction Class对象
        Class<?> cls = actionObj.getClass();
        // 2.拼装getXX()方法名称
        String methodName = "get"+initCap(className);
        // 3.取得该方法名称的Method对象
        Method method = cls.getMethod(methodName);
        // 4.通过反射调用该方法
        // 等同于empAction.getEmp();
        return method.invoke(actionObj);
    }
    private static String initCap(String str) {
        return str.substring(0,1).toUpperCase()+str.substring(1);
    }
}
