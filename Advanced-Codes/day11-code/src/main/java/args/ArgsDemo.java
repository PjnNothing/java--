package args;

public class ArgsDemo {
    public static void main(String[] args) {
        System.out.println(getSum(1));
        System.out.println(getSum(1,2,3));

        int[] arr = {1,2,3,4,5};
        System.out.println(getSum(arr));


    }

    public static int getSum(int...nums){
        int sum = 0;
        for (int num:nums){
            sum+=num;
        }
        return sum;
    }

}
