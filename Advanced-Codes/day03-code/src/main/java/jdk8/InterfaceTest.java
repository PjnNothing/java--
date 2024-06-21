package jdk8;

public class InterfaceTest {
    /*
        JDK8版本特性：
            1、允许定义非抽象方法，需要加入default关键字
                -作用：解决接口的升级问题
                -注意事项：
                    1.1 public可以省略，但是default不能省略
                    1.2 默认方法，实现类是允许重写的，但是重写时需要去掉default关键字
                    1.3 如果实现了多个接口，多个接口中存在相同的默认方法，实现类必须重写默认方法
            2、允许定义静态方法
                -理解：既然接口已经允许方法带有方法体了，干脆也放开静态方法，可以类名调用
                -注意事项：
                    2.1 public可以省略，但是static不能省略
                    2.2 接口中的静态方法，只允许接口名调用，不允许实现类通过对象调用
     */
    public static void main(String[] args) {
        AInterImpl a = new AInterImpl();
        a.method();
        A.function();
        // a.function(); 不允许实现类通过对象调用

    }
}

interface A{
    default void method(){
        System.out.println("A...method");
    }

    public static void function() {
        System.out.println("A...static...function");

    }
}

interface Inter{
    void show();
    void print();
    public default void method(){
        System.out.println("Inter...method");
    }
}

class AInterImpl extends Object implements Inter,A {

    @Override
    public void show() {
        System.out.println("AInterImpl...show");
    }

    @Override
    public void print() {
        System.out.println("AInterImpl...print");
    }

    @Override
    public void method() {
       // Inter.super.method();  //此行代码表示继承接口（干爹）的方法, 接口名.super.方法名()--使用接口名做标识
        //A.super.method();
        // super.method(); 此行代码表示寻找亲爹父类中的方法
        System.out.println("AIterImpl...show");
    }
}