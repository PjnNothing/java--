package collection;

import domain.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class collectionTest2 {
    /*
        public Interator<E> iterator(): 获取遍历集合的迭代器
        public E next(): 从集合中获取一个元素
        public boolean hasNext(): 如果仍有元素可以迭代，返回true


        注意：如果next()方法调用次数过多，会出现NoSuchElementException
     */
    public static void main(String[] args) {
        Collection<Student> c = new ArrayList<>();
        c.add(new Student("zhang",23));
        c.add(new Student("zhang1",23));
        c.add(new Student("zhang2",23));

        //1、获取迭代器
        Iterator<Student> it = c.iterator();

        //2、循环判断，看集合中是否还有元素
        while (it.hasNext()){
            //3、调用next方法，将元素取出
            Student stu = it.next();
            System.out.println(stu);
            System.out.println(stu.getName()+"---"+ stu.getAge());
        }

        System.out.println("----------");

        //使用增强for循环遍历集合 .快捷键 c.for,再加回车键
        for (Student stu:c){
            System.out.println(stu);
        }


        //foreach方法遍历集合
        c.forEach(new Consumer<Student>() { //forEach要的参数是接口Consumer，采用匿名内部类方式
            @Override
            public void accept(Student stu) {
                System.out.println(stu);
            }
        });

        //foreach方法遍历集合
        c.forEach(stu -> System.out.println(stu));



    }
}
