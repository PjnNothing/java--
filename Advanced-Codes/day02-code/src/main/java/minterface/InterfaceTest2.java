package minterface;

import a.Inter;

public class InterfaceTest2 {
    /*
        接口的成员特点：
            1、成员变量: 只能定义常量，因为系统会默认加入三个关键字
                public static final
                    - 这三个关键字没有先后顺序
            2、成员方法: 只能是抽象方法，因为系统会默认加入两个关键字，
                public abstract
            3、构造方法：没有
     */
    public static void main(String[] args) {
        System.out.println(MyInter.NUM); // 通过 类名. 方式访问成员变量
        // MyInter num = 20; 被final修饰

        System.out.println(Inter.num); // 访问不同包下的变量，因为接口中成员变量默认被public修饰


    }
}

interface MyInter{
    // public final static int num = 10;
     int NUM = 10;

     // public abstract void show();
     void show();

}
