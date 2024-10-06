package day5;

public class Main{
    public static void main(String[] args) {
        Person p = new Student("ww");
        p.run();
        People p1= new People();
        People p2= new People();

    }
}

class Student implements Person {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
