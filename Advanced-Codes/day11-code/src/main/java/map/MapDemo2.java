package map;

import java.util.HashMap;
import java.util.TreeSet;

public class MapDemo2 {
    /*
        双层集合底层的数据结构，都是针对于键有效，跟值没有关系

            HashMap: 键唯一,底层是hash表结构，自定的数据结构仍然需要重写hashCode和equals方法
            TreeMap：键排序
            LinkedHashMap: 键唯一，且可以保证存取顺序
     */
    public static void main(String[] args) {
        showTreeMap();

    }

    private static void showTreeMap(){
        TreeMap<Person,String> tm = new TreeMap<>();
        tm.put(new Person("李四",24),"上海");
        tm.put(new Person("张三",23),"北京");
        tm.put(new Person("王五",25),"成都");
        tm.put(new Person("王五",25),"成都");
        System.out.println(tm);
    }
}
