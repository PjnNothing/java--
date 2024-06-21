package HashSet;

import java.util.HashSet;

public class HashSetDemo1 {
    /*
        HashSet集合的基本使用：
            特点：去重
            遍历：迭代器，增强for，foreach方法
     */
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("b");
        hs.add("b");
        hs.add("b");
        hs.add("a");
        hs.add("c");
        System.out.println(hs);
    }
}
