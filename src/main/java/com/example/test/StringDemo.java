package com.example.test;

import java.util.Date;

/**
 * 字符串的常用操作练习
 */
public class StringDemo {

    public static void main(String[] args) {
        String a="chen/yan/qiu";
        System.out.println("一:"+a.toUpperCase());
        System.out.println("二："+a.lastIndexOf("/"));
        System.out.println("三:"+a.substring(a.indexOf("/")+1,a.lastIndexOf("/")));
        System.out.println("四："+a.substring(5,8));
        System.out.println("五："+a.concat("/haha"));
        Date date = new Date();
        String dateFormat = String.format("%tF %tT ", date, date);
        System.out.println(dateFormat);

        String b=" chenyanqiu ";
        System.out.println("六："+b.trim().length());

        System.out.println("七："+a.split("/")[0]);

        


    }
}
