package mstatic;

public class StaticDemo1 {
    /*
            static关键字：修饰符，可以修饰成员变量，成员方法
            特点：
                1、被类的所有对象所共享
                2、多了一种调用方式，可以通过类名而调用（推荐使用类名调用）
                3、随着类的加载而加载，优先于对象存在
             static 成员变量
                1、共享变量
             static 成员方法
                1、常用于工具类
             注意事项：
                1、static方法中，只能访问静态成员（直接访问）
                2、static中不允许使用this关键字
         */
    public static void main(String[] args) {
        Student.school= "传智学院";

        Student stu1 = new Student();
        stu1.name="张三";
        stu1.age=23;

        System.out.println(stu1.name+"---"+stu1.age+"---"+stu1.school);

        System.out.println("---------------------------------------------");

        Student stu2 = new Student();
        stu1.name="李四";
        stu1.age=24;
        // stu1.school= "传智学院";
        System.out.println(stu2.name+"---"+stu2.age+"---"+stu2.school);



    }
}
