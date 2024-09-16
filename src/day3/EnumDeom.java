package day3;

public class EnumDeom {
    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println(c1);
        for(Color c2 : Color.values()){
            System.out.println(c2);
        }
        Color[] arr=Color.values();
        for(Color c : arr){
            // 输出枚举元素的名称和索引
            System.out.println(c+" at index "+c.ordinal());
        }
        Size s1=Size.SMALL;
        System.out.println(s1);
        s1.abc();
    }
}
enum Color{
    RED,BLUE,GREEN;
}
enum Size{
    SMALL,MEDIUM,LARGE;
    private Size(){
        System.out.println("Constructor called for : "+ this.toString());
    }
    public void abc(){
        System.out.println("abc");
    }
}