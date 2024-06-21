package list;

import java.util.ArrayList;
import java.util.List;

public class listDemo1 {
    /*
        List接口的特点：存取有序，有索引，可以存储重复的
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("zhangsan");
        list.add("zhangsan");
        list.add("zhangsan1");
        list.add(0,"赵六");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.set(0,"wangwu");
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println("------------------");

        List<Integer> list2 = new ArrayList<>();
        list2.add(111);  // Integer e = 111;
        list2.add(222);
        list2.add(333);
        list2.remove(Integer.valueOf(222));
        list2.remove(0);

        System.out.println(list2);
    }



}
