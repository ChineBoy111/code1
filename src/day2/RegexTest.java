package day2;

public class RegexTest {
    public static void main(String[] args) {
        String content ="I am noob from runoob.com";
        String pattern = ".*runoob.*";
        boolean match = content.matches(pattern);
        System.out.println(match);

    }
}
