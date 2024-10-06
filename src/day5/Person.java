package day5;

public interface Person {
    String getName();
    default void run() {
        System.out.println(getName() + " run");
    }
}
