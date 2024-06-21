package mabstract;

public class AbstractTest2 {
    /*
        抽象类的注意事项：
            1、抽象类不能实例化(不能创建对象）
                -如果允许创建对象的话，就可以调用内部没有方法体的抽象方法了
            2、抽象类存在构造方法
            3、抽象类中可以存在普通方法
                -可以让子类继承到，并继续使用
            4、抽象类的子类
                1）、要么重写抽象类中的所有抽象方法
                2）、要么是抽象类

        abstract 关键字的冲突
            1、final: 被abstract修饰的方法，强制要求子类重写，被final修饰的方法子类不能重写；
            2、private: 被abstract修饰的方法，强制要求子类重写，被private修饰的方法子类不能重写；
            3、static: 被static修饰的方法可以类名调用，类名调用抽象方法没有意义；
     */
    public static void main(String[] args) {
        //Fu f = new Fu();  不允许创建对象
        //f.show();
        Zi z = new Zi();
        z.method();


    }
}

abstract class Fu{
    public Fu(){

    }
    public abstract void show();
    public void method(){
        System.out.println("method...");
    }

}

class Zi extends Fu{
    public Zi(){
        super();
    }

    @Override
    public void show() {

    }
}

abstract class A{
    public abstract void showA();
}
abstract class B extends A{
    @Override
    public void showA() {
    }

    public abstract void showB();
}

class C extends B{
    @Override
    public void showB() {

    }
}
