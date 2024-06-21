package mextends;

public class ExtendsDemo2 {
    /*
        子父类中，出现了方法声明一模一样的方法（方法名，参数，返回值）
            在创建子类对象，调用方法时，会优先使用子类的方法逻辑
            虽然看起来是就近原则的现象，但其实是子类的方法，对父类的方法，进行了重写操作
     */
    public static void main(String[] args) {
        Zi z = new Zi();
        z.method();
        z.show();

    }
}

class Fu{
    int num = 10;

    public void show(){
        System.out.println("FU...show");
    }
}

class Zi extends Fu{
    int num = 20;

    public void method(){
        int num = 30;
        System.out.println(num);    //30
        System.out.println(this.num);    //20,调用本类成员变量
        System.out.println(super.num);   //10，调用父类变量
    }

    public void show(){
        System.out.println("Zi...show");
    }
}
