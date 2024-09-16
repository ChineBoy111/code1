package day1;

import java.util.Date;

public class TestData {
    public static void main(String[] args) {
        char[] a = {'a','b','c','D','E','F','G','H'};
        for (int i = 0; i < a.length; i++) {
            if(Character.isLowerCase(a[i])){
                a[i] = Character.toUpperCase(a[i]);
            }
            else if(Character.isUpperCase(a[i])){
                a[i] = Character.toLowerCase(a[i]);
            }
        }
        for(char c:a){
            System.out.println(c);
        }
    }
}
