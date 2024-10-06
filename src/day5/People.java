package day5;

public class People {
    private String name;
    private int age;

    public People() {
        System.out.println("我是无参构造方法");
    }
    {
        System.out.println("我是构造代码块");
    }
    //静态代码块
    // 静态代码块优先于构造代码块和构造方法执行的,而且只执行一次
    static{
        System.out.println("我是静态代码块");
    }
    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
