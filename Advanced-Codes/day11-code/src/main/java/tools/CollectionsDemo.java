package tools;

import damain.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo {
    public static void main(String[] args) {
        //批量添加
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","c","d","d");
        System.out.println(list);

        //二分查找（前提：必须是拍好序的数据）
        System.out.println(Collections.binarySearch(list, "b"));

        //洗牌
        Collections.shuffle(list);
        System.out.println(list);

        ArrayList<Student> nums = new ArrayList<>();
        Collections.addAll(nums,new Student("张三",23),new Student("李四",24));

        //从集合中找最值
        System.out.println(Collections.max(nums));
        System.out.println(Collections.min(nums));

        //对集合中的元素进行交换
        Collections.swap(nums,0,1);
        System.out.println(nums);


        ArrayList<Integer> box = new ArrayList<>();
        Collections.addAll(box,1,3,5,2,4);

        //sort:对集合进行排序（升序）
        Collections.sort(box);
        System.out.println(box);

        //自定义降序排列
        Collections.sort(box, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(box);




    }
}
