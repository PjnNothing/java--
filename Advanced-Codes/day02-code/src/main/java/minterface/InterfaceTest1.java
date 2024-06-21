package minterface;

public class InterfaceTest1 {
    /*
        接口：体现的思想就是声明【规则】
        思路：如果一个类中，所有的组成，都是抽象方法
            -没有成员变量
            -没有普通方法

            这种类，通常设计为java中的接口，因为现在这个类存在的唯一价值，就只是声明规则了
        -----------------------------------------------------------------------

        接口的定义格式：
            interface 接口名{}
        注意：接口不允许实例化（因为接口里面都是抽象方法，创建对象没有意义）

        接口和类之间是实现关系，通过implements关键字来完成
            class 类名 implements 接口名{}
            实现类（接口的子类）：
                1、重写所有的重写方法
                2、将实现类变成抽象类(用得少）
     */
    public static void main(String[] args) {
        // 创建实现类对象
        InterImpl ii = new InterImpl();
        ii.method();
        ii.show();


    }
}

interface Inter{
    public abstract void show();
    public abstract void method();
}

abstract class InterImpl2 implements Inter{

}
class InterImpl implements Inter{

    @Override
    public void show() {
        System.out.println("show...");
    }

    @Override
    public void method() {
        System.out.println("method...");
    }
}