package this_super;

public class SuperTest {
    /*
        super调用父类成员的省略规则：
            super.父类成员变量 | super.父类成员方法()
            -> 被调用的变量和方法，在子类中不存在，super.可以直接省略的(本质来讲，省略的是this)
     */
    public static void main(String[] args) {
        Zi z =new Zi();
        z.method();

    }
}

class Fu{
    int num = 10;
    public void show(){
        System.out.println("Fu...show");
    }
}

class Zi extends Fu{
    int num = 20;

    @Override
    public void show() {
        System.out.println("Zi...show");
    }


    public void method(){
        System.out.println(super.num);
        System.out.println(num);
        super.show();
        show();

        System.out.println(this.num);
        System.out.println(num);
        this.show();
        show();

    }
}


