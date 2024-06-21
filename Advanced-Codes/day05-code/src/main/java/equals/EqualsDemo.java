package equals;
import toString.Student;

import java.util.Objects;

public class EqualsDemo {
    /*
        Object类中的equals方法：
            public boolean equals(Object obj):对象之间进行比较，返回true，或者是false

                public boolean equals(Object obj) {
                    return (this == obj);
                        //this: stu1
                        //obj: stu2
                }
                结论：Object类中的equals方法，默认比较的是对象内存地址
                    -通常会重写equlas方法，让对象之间，比较内容

     */
    public static void main(String[] args) {
        //Student stu1 = new Student("张三",23);
        Student stu1 = null;
        Student stu2 = new Student("张三",23);

        System.out.println(stu1 == stu2); //==号比较引用类型数据时，比较的是地址值
        // System.out.println(stu1.equals(stu2));

        //问题：Objects.equals和stu1.equals方法，有什么区别？
        //细节：Objects.equals方法：内部依赖于我们自己所编写的equals
        //好处：Objects.equals方法：内部带有非Null的判断
        /*
            public static boolean equals(Object a, Object b) {
                return (a == b) || (a != null && a.equals(b));
                ----------------------------------------------------
                a==b: 如果地址相同，返回true, 符号是短路||，昨年为true,右边就不执行了
                    -结论：如果地址相同，方法直接返回true
                    : 如果地址不相同，就会返回false，短路||，左边为false，右边要继续执行
                ----------------------------------------------------
                a!=null: 假设a是null值
                    null != null: false
                    &&: 左边为false, 右边不执行，记录着null值的a,就不会调用equal方法
                        -避免空指针异常！
                ----------------------------------------------------
                a!=null: 假设a不是null值
                    stu1 != null: true
                    &&: 左边为false, 右边继续执行，a.equals(b),这里就不会出现空指针异常
            }
         */

        System.out.println(Objects.equals(stu1, stu2));

        System.out.println("看看我执行了吗？");
    }
}
