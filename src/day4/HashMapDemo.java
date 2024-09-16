package day4;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        //HashMap 是一个散列表，它存储的内容是键值对(key-value)映射。
        //HashMap 实现了 Map 接口，根据键的 HashCode 值存储数据，具有很快的访问速度，最多允许一条记录的键为 null，不支持线程同步。
        //HashMap 是无序的，即不会记录插入的顺序。
        // 创建 HashMap 对象 Sites
        HashMap<String, String> Sites = new HashMap<String, String>();
        // 添加键值对
        Sites.put("one", "Google");
        Sites.put("two", "Runoob");
        Sites.put("three", "Taobao");
        Sites.put("four", "Zhihu");
        System.out.println(Sites);
        // 输出 key 和 value
        for (String i : Sites.keySet()) {
            System.out.println("key: " + i + " value: " + Sites.get(i));
        }
        // 返回所有 value 值
        for(String value: Sites.values()) {
            // 输出每一个value
            System.out.print(value + ", ");
        }
    }
}
