package collection;

import domain.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class collectionTest1 {
    /*
        collection的常用方法
     */
    public static void main(String[] args) {
        Collection<Student> c = new ArrayList<>();
        c.add(new Student("zhang",23));
        c.add(new Student("zhang1",23));
        c.add(new Student("zhang2",23));
        c.remove(new Student("zhang",23));
        System.out.println(c);
        System.out.println(c.contains(new Student("zhang",23)));
        System.out.println(c.contains(new Student("zhang1",23)));


    }

    private static void method() {
        //collection是接口，其实现类是ArrayList，但是采用多态的方式创建对象，调用单列集合中的共有方法
        Collection<String> c = new ArrayList<String>();

        boolean b1 = c.add("张三");
        c.add("lisi");
        c.add("wangwu");
        boolean b = c.contains("李四");
        System.out.println(b);
        System.out.println(b1);
        System.out.println(c);
        System.out.println(c.isEmpty());
        c.remove("张三");
        System.out.println(c);
        c=null;
        System.out.println(c.isEmpty());


        c.clear();
        System.out.println(c);
        System.out.println(c.isEmpty());
    }
}
