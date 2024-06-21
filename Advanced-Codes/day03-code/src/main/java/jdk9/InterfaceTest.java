package jdk9;

public class InterfaceTest {
    /*
        jdk9接口特性：
            接口中允许定义私有方法
     */
    public static void main(String[] args) {

    }
}

interface Inter{
    void show();
    void print();

    public default void start(){
        System.out.println("Start方法执行...");
        // log();
    }

    public default void end(){
        System.out.println("end方法执行...");
        // log();
    }

    /*
        private static void log(){
        System.out.println("日志记录");
    }
     */


}
