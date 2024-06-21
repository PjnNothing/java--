package this_super;

public class Test {
    /*
        开闭原则：对于功能扩展做开放，对修改代码做关闭
     */
    public static void main(String[] args) {
       A a1 = new A(1,2,3);
       A a2 = new A(4,5,6);
       A a3 = new A(1,2,3,4);
    }
}

/*
    项目Version1.0版本，有3个成员变量；
    项目Version1.1版本，新增1个成员变量；
 */
class A{
    int a;
    int b;
    int c;
    int d;

    public A() {
    }

    public A(int a, int b, int c) {
        super();// 可以省略
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public A(int a, int b, int c, int d) {
        //super(); this和super必须在第一行，所有二者不能共存
        this(a,b,c); //this(...):调用自己本类的方法；
        this.d = d;
    }
}
