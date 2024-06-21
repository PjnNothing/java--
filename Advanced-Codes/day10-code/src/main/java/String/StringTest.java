package String;

import java.util.TreeSet;

public class StringTest {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "b";
        System.out.println(s1.compareTo(s2));

        String s3 = "张";
        String s4 = "王";
        System.out.println(s3.compareTo(s4));

        TreeSet<String> ts = new TreeSet<String>();
        ts.add("a");
        ts.add("c");
        ts.add("d");
        ts.add("baa");
        ts.add("baa");
        ts.add("aa");
        ts.add("az");
        System.out.println(ts);
    }
}
