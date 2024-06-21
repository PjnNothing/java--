package handle;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HandleExceptionDemo {
    /*
        异常的处理方式：
            1、try...catch捕获异常
                好处：异常对象可以被捕获，后续的代码可以继续执行
                格式：
                    try{
                        可能会出现异常的代码
                    }catch(异常名称 对象名）{
                        异常的处理方案
                    }

            2、throw: 抛出异常
            ---------------------------------------
            问题：正在面临的异常，是否需要暴露出来
                -不需要暴露：try...catch 捕获
                -需要暴露：抛出异常

     */
    //public static void main(String[] args) throws ParseException, FileNotFoundException {}
    public static void main(String[] args) throws Exception {
        method();
    }

    public static void method() throws ParseException, FileNotFoundException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse("abd");
        System.out.println(date);

        FileReader fr = new FileReader("D:\\A.txt");

    }

    private static void tryCatchDemo() {
        System.out.println("开始");
        try {
            int[] arr = null;
            tryCatchDemo(arr[10]);
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("捕获了运算异常");
        } catch (NullPointerException e) {
            System.out.println("捕获了空指针异常");
        } catch (Exception e) {
            System.out.println("捕获了异常");
        }
        System.out.println("结束");
    }

    private static void tryCatchDemo(int x) {
        System.out.println(x);
    }
}