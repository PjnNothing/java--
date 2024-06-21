package set;

import domain.Student;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
    /*
        如果同时具备比较器和自然排序，会优先按照比较器的规则
        TreeSet排序：-比较器排序
            1、在TreeSet的构造方法中，传入Compartor接口的实现类对象
            2、重写compare方法
            3、根据方法返回值，组织排序规则
        TreeSet排序：-自然排序

     */
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() { //如果对提供的compareTo排序不满意，可以重写比较器Comparator
            @Override
            public int compare(Student o1, Student o2) {
                int ageResult = o1.getAge()-o2.getAge();
                return ageResult == 0?o1.getName().compareTo(o2.getName()):ageResult;

            }
        });

        ts.add(new Student("赵六", 26));
        ts.add(new Student("李四", 24));
        ts.add(new Student("张三", 23));
        ts.add(new Student("王五", 25));
        System.out.println(ts);
    }
}
