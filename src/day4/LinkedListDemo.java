package day4;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        //LinkedList 链表
        LinkedList<String> sites = new LinkedList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        sites.addFirst("a");
        sites.addLast("b");
        sites.removeFirst();

        System.out.println(sites);
    }
}
