package day4;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        //HashSet 基于 HashMap 来实现的，是一个不允许有重复元素的集合。
        //HashSet 允许有 null 值。
        //HashSet 是无序的，即不会记录插入的顺序。
        HashSet<String> sites = new HashSet<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        sites.add("Runoob");  // 重复的元素不会被添加
        System.out.println(sites);
    }
}
