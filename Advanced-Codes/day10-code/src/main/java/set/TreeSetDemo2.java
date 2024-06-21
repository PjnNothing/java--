package set;

import domain.Student;

import java.util.TreeSet;

public class TreeSetDemo2 {
    /*
        TreeSet集合存储Student学生对象
        CompareTo:
            0: 集合中只有new Student("王五",25)；
            1：正序排列
            -1：倒序排列
        当调用add方法时，向TreeSet添加元素的时候，内部会自动调用CompareTo方法，根据这个方法的返回值，来决定节点怎么走
     */
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>();
        ts.add(new Student("王五",25));
        ts.add(new Student("王五",25));
        ts.add(new Student("王五",25));
        ts.add(new Student("张三",23));
        ts.add(new Student("李四",24));
        ts.add(new Student("赵六",26));
        System.out.println(ts);
    }
}
