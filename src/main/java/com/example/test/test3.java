package com.example.test;

/**
 * Created by Administrator on 2017/8/1.
 */
public class test3 {
    public static void  main(String[] args){
        String[] ip = "http://172.16.50.80:7180/".split("//")[1].split(":");
        System.out.println(ip[0]);
        System.out.println(ip[1].split("/")[0]);
    }
}
