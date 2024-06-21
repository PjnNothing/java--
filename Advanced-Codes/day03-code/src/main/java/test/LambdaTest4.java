package test;

public class LambdaTest4 {
    public static void main(String[] args) {
        // alt+enter: 可以一键替换成Lambda表达式
        useCalculator(new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });

        System.out.println("------------------");

        useCalculator((int a,int b)-> a-b);

    }

    public static void useCalculator(Calculator calculator){
        int result = calculator.calc(10,20);
        System.out.println(result);
    }
}

interface Calculator{
    int calc(int a,int b);
}
