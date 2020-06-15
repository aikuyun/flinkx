package com.dtstack.flinkx.hive.test;

/**
 * @program: flinkx-all
 * @description: 分隔符测试
 * @author: TSL
 * @create: 2020-06-15 13:45
 **/
public class FieldDelimiterTest {
    public static void main(String[] args) {
        String st = "\t";
        int a = st.trim().length();
        System.out.println(st);
        System.out.println(a);
    }
}
