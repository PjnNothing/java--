package arrays;

import java.util.Arrays;

public class ArraysDemo {
    /*
        Array类常用方法：
        -----------------------------
        public static String toString(类型[] a): 将数组元素拼接为带有格式的字符串
        public static boolean equals(类型[] a): 比较两个数组内容是否相同
        public static int binarySearch(类型[] a): 查找元素在数组中的索引（二分查找法：保证数组的元素是排好序的）,如果查找的元素在数组中不存在，返回（-（插入点）-1）
        public static void sort(类型[] a):对数组进行默认升序排序
            todo:后面学完了红黑树，回头对这个方法做补充
     */
    public static void main(String[] args) {
        int[] arr1 = {11,22,33,44,55};
        int[] arr2 = {11,22,33,44,66};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.equals(arr1,arr2));
        System.out.println(Arrays.binarySearch(arr1, 33));
        System.out.println(Arrays.binarySearch(arr1, 66));
        System.out.println("---------------------------");
        int[] nums = {22,11,55,44,33};
        System.out.println(Arrays.binarySearch(nums, 11));
        System.out.println("--------------------");
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

    }
}
