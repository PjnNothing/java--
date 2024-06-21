package list;

import java.util.LinkedList;

public class LinkedListDemo {
    /*
         LinkedList特有方法：
            1、public void addFirst(E e): 头部添加
            2、public void addLast(E e): 尾部添加
            3、public E getFirst(E e): 获取第一个
            4、public void getLast(E e): 获取最后一个
            5、public void removeFirst(): 删除第一个
            6、public void removeLast(): 删除最后一个

     */
    public static void main(String[] args) {

    }

    private static void method2() {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("张三");
        list.addFirst("李四");
        list.addFirst("王五");
        list.addLast("赵六");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
    }

    private static void method1() {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("张三");
        list.addFirst("李四");
        list.addFirst("王五");
        list.addLast("赵六");
        System.out.println(list);
    }
}
