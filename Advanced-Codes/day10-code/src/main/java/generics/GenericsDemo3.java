package generics;

public class GenericsDemo3 {
    /*
        泛型方法：
            1、非静态方法：内部的泛型，会根据类的泛型去匹配
            2、静态方法：静态方法中如果加入了泛型，必须声明除自己独立的泛型,不能根据类泛型匹配，因为静态方法随着类字节码文件的加载而存在
                        -时机：在调用方法时，传入实际的参数的时候，确定到具体的类型
            3、泛型只能编写引用型数据类型，不能编写基本数据类型
     */
    public static void main(String[] args) {
        String[] arr1 = {"张三","李四","wangwu"};
        Integer[] arr2 = {11,22,33};
        Double[] arr3 = {11.1,22.2,33.3};

       int[] nums = {11,22,33};
        //printArray(nums); 泛型只能编写引用型数据类型，不能编写基本数据类型

        printArray(arr1);
        printArray(arr2);
        printArray(arr3);

    }

    public static<T> void printArray(T[] arr){
        System.out.println("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+",");
        }
        System.out.println(arr[arr.length-1]+"]");
    }
}
