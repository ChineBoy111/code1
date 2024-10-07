package Mould17;

public class Test01 {
    public static void main(String[] args)throws InterruptedException {
        //创建线程对象
       // MyThread t1 = new MyThread();
        //给线程设置名字
        //t1.setName("金莲");

        //调用start方法,开启线程,jvm自动调用run方法
        //t1.start();

//        for (int i = 0; i < 10; i++) {
//            Thread.sleep(1000L);
//            System.out.println(Thread.currentThread().getName()+"线程..........执行了"+i);
//        }

        Thread t1 = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+"执行了......"+i);
            }
        },"金莲");

        MyThread1 t2 = new MyThread1();
        t2.setName("阿庆");
        /*
           获取两个线程的优先级
           MIN_PRIORITY = 1 最小优先级 1
           NORM_PRIORITY = 5 默认优先级 5
           MAX_PRIORITY = 10 最大优先级 10
         */
        //System.out.println(t1.getPriority());
        //System.out.println(t2.getPriority());

        //设置优先级
        t1.setPriority(5);
        t2.setPriority(1);

        t1.start();
        t2.start();
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            //线程睡眠
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+"...执行了"+i);
        }
    }
}
class MyThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"执行了......"+i);
        }
    }
}