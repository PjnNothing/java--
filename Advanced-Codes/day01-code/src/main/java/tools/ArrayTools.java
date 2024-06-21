package tools;

public class ArrayTools {
    /*
        编写一个类ArrayTools内部编写三个方法
            1、从数组中找最大值
            2、从数组中找最小值
            3、打印数组中所有元素，要求格式为[11,22,33]
     */
    private ArrayTools(){}

    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]< min){
                min=arr[i];
            }
        }
        return min;
    }

    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.print(arr[arr.length-1]+"]");
    }

}
