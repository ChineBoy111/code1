package String;

import java.util.Scanner;

public class Demo02StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = sb.append("张无忌");
        System.out.println(sb1);
        System.out.println(sb);
        System.out.println(sb==sb1);

        System.out.println("==============");
        //链式调用
        sb.append("赵敏").append("周芷若").append("小昭");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        String s = sb.toString();
        System.out.println(s);

        System.out.println("==============");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.nextLine();

        StringBuilder sb2 = new StringBuilder(str);
        String str2 = sb2.reverse().toString();
        if(str.equals(str2)){
            System.out.println(str+"是回文串");
        }else{
            System.out.println(str+"不是回文串");
        }
    }
}
