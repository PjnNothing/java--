package mstatic;

public class StaticDemo2 {
    static int num1 = 10;
    int num2 = 20;

    public static void method() {
        System.out.println("static...method");
    }

    public void print(){
        System.out.println("print...");
    }

    public static void main(String[] args) {
        // 在静态方法中，只能访问静态成员（直接访问）,因为静态方法随着类的存在而存在，而非静态方法/成员只能随着对象的产生而产生
        method();  //可以直接访问
        //System.out.println(num2); //不能访问
        //print(); //不能访问

        StaticDemo2 sd = new StaticDemo2();
        System.out.println(sd.num2);
    }

}
