package day2;

import java.util.Arrays;

public class StringTest {
    public static void main(String[] args) {
        char[] a = {'J','a','v','a'};
        String s = new String(a);
        System.out.println(s);
        char[] b = {'零','壹','贰','叁','肆','伍','陆','柒'};
        String s2 = new String(b,2,4); //2起始位置 抽4个
        System.out.println(s2);
        System.out.println(s2.length());
        String you="you";
        String hi ="hi";
        String testTwo = you+hi;
        String testOne = you+hi;
        System.out.println(testOne.equals(testTwo));
        System.out.println(testOne==testTwo);
        System.out.println("-----startsWith-----");
        String s1 ="abc";
        System.out.println(s1.startsWith("a"));
        System.out.println(s1.startsWith("b"));
        System.out.println("-----compareTo-----");
        String s3 ="abcdef";
        System.out.println(s3.compareTo("abc"));
        System.out.println("-----sort-----");
        String[] arr1={"melon","apple","pear","banana"};
        Arrays.sort(arr1);
        for(var c:arr1){
            System.out.print(" "+c);
        }
        System.out.println("-----contains-----");
        String s4 ="abcd";

        System.out.println(s4.contains("a"));
        System.out.println("-----indexOf lastIndexOf-----");
        String s5 ="abcda";
        System.out.println(s5.indexOf("a"));
        System.out.println(s5.indexOf("e")); //找不到返回-1
        System.out.println(s5.lastIndexOf("a")); //从后面开始找
        System.out.println(s5.lastIndexOf("e"));
        String tom = "I am a good cat";
        System.out.println(tom.indexOf("a",3));//从指定位置开始找 包括指定位置
        System.out.println("-----substring-----");
        String tom2 = "I am a good dog";
        System.out.println(tom2.substring(1,5));
        System.out.println("-----trim-----");
        String tom3 = " I am a good fox ";
        System.out.println(tom3.trim());
        System.out.println("-----String to Other-----");
        int x;
        String str ="876";
        String str2 = "9.9";
        x=Integer.parseInt(str);
        System.out.println(x+1);
        double y;
        y=Double.parseDouble(str2);
        System.out.println(y);
        System.out.println("-----Other to String----");
        String str3 = String.valueOf(123.4);
        System.out.println(str3);
        Integer i2 = 100;
        System.out.println(i2.toString());
        System.out.println("-----Char and String----");
        char[] arr_char,c2;
        String str4 ="1945年8月15日是抗战胜利日";
        arr_char=new char[4];
        str4.getChars(11,15,arr_char,0); //从哪里开始到哪里结束（不包括）char数组，从char数组哪里开始存放
        System.out.println(arr_char);
        c2="十一长假期间,学校都放假了".toCharArray();
        for (char c : c2) {
            System.out.print(c);
        }
        System.out.println();
        System.out.println("-----concat----");
        String str5="!!!!";
        System.out.println(str4.concat(str5));
        System.out.println("-----copyValueOf----");
        char[] chars2={'a','b','c'};
        String str6="";
        str6= String.copyValueOf(chars2);
        String str7=String.copyValueOf(chars2,1,2);//子数组的初始偏移量,子数组的长度。
        System.out.println(str6);
        System.out.println(str7);
        System.out.println("-----endsWith----");//startsWith以字符串开头
        String Str = "菜鸟教程：www.runoob.com";
        boolean retVal;
        retVal = Str.endsWith( "runoob" );//是否以字符串结尾
        System.out.println("返回值 = " + retVal );
        System.out.println("-----replace----");
        String Str8 = "Runoob";
        System.out.print("返回值 :" );
        System.out.println(Str8.replace('o', 'T'));
        System.out.println("-----split----");
        String Str9 = "www.runoob.com";
        String[] tmp;
        tmp = Str9.split("\\."); //. 为特殊字符，需要转义
        for (String string : tmp) {
            System.out.print(string);
        }
        System.out.println();
        System.out.println("-----substring----");
        String Str10 = "www.runoob.com";
        System.out.println(Str10.substring(4));
        System.out.println(Str10.substring(4, 10));
        System.out.println("-----toCharArray----"); //将此字符串转换为一个新的字符数组。
        String Str11 = "www.runoob.com";
        char[] Str12;
        Str12 = Str11.toCharArray();
        for (char c : Str12) {
            System.out.print(c);
        }
        System.out.println();
        System.out.println("-----toLowerCase----"); //toUpperCase变大写
        String Str13 = "www.runoob.COM";
        System.out.println(Str13.toLowerCase());
        System.out.println("-----valueOf----"); //将其他类型转换为String
        int num=100;
        System.out.println(String.valueOf(num));
        System.out.println("-----trim----"); //清空俩段空格
        String Str14 = "   runoob   ";
        System.out.println(Str14.trim());
        System.out.println("-----contains----");
        String Str15 = "runoob";
        System.out.println(Str15.contains("runoob"));
        System.out.println(Str15.contains("a"));
        System.out.println("-----isEmpty----");
        String Str16 = "runoob";
        System.out.println(Str16.isEmpty());
    }
}
