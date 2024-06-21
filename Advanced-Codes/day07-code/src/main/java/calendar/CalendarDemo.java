package calendar;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        //Calendar C:抽象类
        //Calendar.getInstance()：获取的是子类对象

        //1、获取当前时间的日历对象
        Calendar c = Calendar.getInstance(); //多态的写法

        //2、调用get方法，获取指定字段的信息
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        //注意Calendar类的月份是0~11，想要获取常规的月份，需要对结果+1操作
        int month = c.get(Calendar.MONTH);
        System.out.println(month+1);

        int week = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(week);

    }
}
