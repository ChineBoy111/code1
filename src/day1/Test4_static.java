package day1;

public class Test4_static {
    public static void main(String[] args) {

        Lader laderOne = new Lader();
        Lader laderTwo = new Lader();
        laderOne.setSd(28);
        laderTwo.setSd(66);
        laderOne.setXd(2);
        laderTwo.setXd(22);
        System.out.println("laderOne的上底:"+laderOne.getSd());
        System.out.println("laderOne的下底:"+laderOne.getXd());
        System.out.println("laderTwo的上底:"+laderTwo.getSd());
        System.out.println("laderTwo的下底:"+laderTwo.getXd());
    }
}
class Lader{
    double sd,height;
    static double xd;
    void setSd(double a){
        sd=a;
    }
    void setXd(double b){
        xd=b;
    }
    double getSd(){
        return sd;
    }
    double getXd(){
        return xd;
    }
}