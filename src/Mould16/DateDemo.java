package Mould16;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        //Date() -> 获取当前系统时间
        Date date1 = new Date();
        System.out.println("date1 = " + date1);
        //Date(long time) -> 获取指定时间,传递毫秒值 -> 从时间原点开始算
        Date date2 = new Date(1000L);
        System.out.println("date2 = " + date2);
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        System.out.println("year = " + year);
        calendar.set(Calendar.YEAR, year + 1);
         year = calendar.get(Calendar.YEAR);
        System.out.println("year = " + year);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //1.String format(Date date) -> 将Date对象按照指定的格式转成String
        String time1 = sdf.format(new Date());
        System.out.println("time1 = " + time1);


        //static LocalDate now()  -> 创建LocalDate对象
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " + localDate);
        //static LocalDate of(int year, int month, int dayOfMonth)  -> 创建LocalDate对象,设置年月日
        LocalDate localDate1 = LocalDate.of(2000, 10, 10);
        System.out.println("localDate1 = " + localDate1);

        //static LocalDateTime now()  创建LocalDateTime对象
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);
        //static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute, int second) 创建LocalDateTime对象,设置年月日时分秒
        LocalDateTime localDateTime1 = LocalDateTime.of(2000, 10, 10, 10, 10, 10);
        System.out.println("localDateTime1 = " + localDateTime1);

        LocalDate local1 = LocalDate.of(2022, 12, 12);
        LocalDate local2 = LocalDate.of(2021, 11, 11);

        Period period = Period.between(local2, local1);

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());


        LocalDateTime local11 = LocalDateTime.of(2022, 12, 12,12,12,12);
        LocalDateTime local22 = LocalDateTime.of(2021, 11, 11,11,11,11);
        Duration duration = Duration.between(local22, local11);
        System.out.println(duration.toDays());
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
        System.out.println(duration.toMillis());
    }
}
