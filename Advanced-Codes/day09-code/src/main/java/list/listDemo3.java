package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class listDemo3 {
    /*
        并发修改异常：ConcurrentModificationException
            场景：使用迭代器遍历集合的过程中，调用了[集合对象]的添加、删除方法，就会出现此异常
            解决方法：使用迭代器自己的添加、删除方法
                删除方法：普通迭代器有
                添加方法：普通迭代器没有，需要使用list集合特有的迭代器

     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("jiw");
        list.add("jiwdjiw");
        list.add("jiwjdi");
        list.add("jiwdji");

        ListIterator<String> it = list.listIterator();
        while (it.hasNext()){
            String s = it.next();
            if ("jiw".equals(s)) {
                //list.remove("jiw"); 集合对象的删除方法
                it.remove();
                it.add("hhh");
            }
        }
        System.out.println(list);

    }
}
