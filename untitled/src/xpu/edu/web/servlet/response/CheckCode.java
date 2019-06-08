package xpu.edu.web.servlet.response;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_GREENPeer;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/**
 * 验证码
 */
@WebServlet("/CheckCode")
public class CheckCode extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /**
         * 图片的宽、高
         */
        int width = 100;
        int height = 50;

        //1.创建一个对象，在内存中代表一张图片（代表验证码的图片对象）
        BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);//RGB表示三原色的图片

        //2.美化图片
        //2.1.填充背景色
        //获取画笔对象
        Graphics graphics = image.getGraphics();
        //设置画笔颜色
        graphics.setColor(Color.PINK);
        //填充颜色
        graphics.fillRect(0,0,width,height);

        //2.2.画边框
        graphics.setColor(Color.BLUE);
        //边框有一个像素宽度
        graphics.drawRect(0,0,width - 1,height - 1);

        //2.3.生成随机内容
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random ran = new Random();
        for (int i = 1; i < 5; i++) {
            //生成随机角标
            int index = ran.nextInt(str.length());
            //获取字符
            char c = str.charAt(index);
            //写验证码
            graphics.drawString(c + "",width / 5 * i,height / 2);
        }

        //2.4.画干扰线
        for (int i = 0; i < 6; i++) {
            int x1 = ran.nextInt(width);
            int x2 = ran.nextInt(width);
            int y1 = ran.nextInt(height);
            int y2 = ran.nextInt(height);
            graphics.setColor(Color.GREEN);
            graphics.drawLine(x1,y1,x2,y2);
        }

        //3.将图片输出到页面展示
        ImageIO.write(image,"jpg",response.getOutputStream());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
