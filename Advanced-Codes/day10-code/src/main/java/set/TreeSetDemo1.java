package set;

import java.util.TreeSet;

public class TreeSetDemo1 {
    /*
        TreeSet集合的特点体验: 排序、去重
     */
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("a");
        ts.add("e");
        ts.add("b");
        ts.add("c");
        ts.add("d");
        ts.add("d");
        ts.add("d");
    }
}
