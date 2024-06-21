package HashSet;

import damain.Student;

import java.util.HashSet;

public class HashSetDemo2 {
    /*
        HashSet集合存储自定义的对象
     */
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<Student>();
        hs.add(new Student("张三",23));
        hs.add(new Student("李四",24));
        hs.add(new Student("王五",25));
        hs.add(new Student("王五",25));
        System.out.println(hs);

    }

}
