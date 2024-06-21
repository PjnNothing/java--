package test;
/*
    Lambda表达式的省略写法
        1、参数类型可以省略不写；
        2、如果只有一个参数，参数类型可以省略，同时()也可以省略
        3、如果Lambda表达式的方法体代码只有一行代码：
            3.1 可以省略大括号不写，同时省略分号
            3.2 此时，如果这行代码是return语句，必须省略return以及 ；不写
 */

public class LambdaTest1 {
    public static void main(String[] args) {
        useShowHandler(new ShowHandler() {
            @Override
            public void show() {
                System.out.println("我是匿名内部类，重写后的show方法...");
            }
        });
        System.out.println("------------------");

        useShowHandler(()->{System.out.println("我是Lambda表达式，重写后的show方法...");});

    }

    public static void useShowHandler(ShowHandler showHandler){
        showHandler.show();
    }
}

interface ShowHandler{
    void show();
}
