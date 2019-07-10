package com.hello;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 一叶知秋
 * @create 2019-07-10-11:24
 */
public class Test {
    //模板一psvm
    public static void main(String[] args) {
        //模板二sout
        System.out.println("快捷键");
        //变形soutp,soutm,soutv,xxx.sout
        int nums = 10;
        System.out.println("nums = " + nums);
        System.out.println("args = [" + args + "]");
      //模板三：fori,iter,itar
        String[] s = new String[]{"aa","bb","cc"};
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        for (String s1 : s) {
            System.out.println(s1);
        }
        for (int i = 0; i < s.length; i++) {
            String s1 = s[i];
            System.out.println(s1);
        }
        //模板四list.for,list.fori,list.forr
        List li =new ArrayList();
        li.add(12);
        li.add(13);
        li.add(14);
        li.add(15);
        for (Object o : li) {
            System.out.println(o);
        }

    }
}
