package xpu.edu.web.servlet.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

@WebServlet("/RequestDemo6")
public class RequestDemo6 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //POST获取请求参数
        //根据参数名称获取参数值
        String username = request.getParameter("username");
//        System.out.println("POST");
//        System.out.println(username);
        //根据参数名称获取参数值的数组
        String[] hobbies = request.getParameterValues("hobby");
//        for (String hobby:hobbies) {
//            System.out.println(hobby);
//        }
        //获取所有请求的参数名称
        Enumeration<String> parameterNames = request.getParameterNames();
//        while(parameterNames.hasMoreElements()){
//            String s = parameterNames.nextElement();
//            System.out.println(s);
//            String parameter = request.getParameter(s);
//            System.out.println(parameter);
//            System.out.println("------");
//        }
        //获取所有参数的Map集合
        Map<String, String[]> parameterMap = request.getParameterMap();
        //遍历
        Set<String> strings = parameterMap.keySet();
        for (String name:strings) {
            //根据键获取值
            String[] strings1 = parameterMap.get(name);
            System.out.println(name);
            for (String value:strings1) {
                System.out.println(value);
            }
            System.out.println("-----");
        }
        
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        //get获取请求参数
//        //根据参数名称获取参数
//        String username = request.getParameter("username");
//        System.out.println("GET");
//        System.out.println(username);
        this.doPost(request,response);
    }
}
