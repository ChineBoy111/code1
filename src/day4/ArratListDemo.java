package day4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArratListDemo {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        sites.set(2, "Wiki"); // 第一个参数为索引位置，第二个为要修改的值
        sites.remove(3); // 删除第四个元素
        System.out.println(sites);
        System.out.println(sites.size());
        System.out.println(sites.get(2));
        Collections.sort(sites); //排序
        for (String site : sites) {
            System.out.println(site);
        }

    }
}
