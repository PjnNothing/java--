package mextends;

public class ExtendsDemo3 {
    /*
        方法重载（Overload）：同一个类中，方法名相同，参数不同，与返回值无关。参数不同：类型不同、个数不同、顺序不同
        方法重写(Override)：在子父类当中，出现了方法声明一模一样的方法（方法名，参数，返回值也相同）
            目标1：能够独立识别出方法是不是重写的
                -注解: @Override 不报错时表示是重写方法
            目标2：方法重写的使用场景
                -当子类需要父类的方法，但是觉着父类的方法逻辑不好（修改、增强）
            注意：
                父类中的私有方法不能被重写
                子类重写父类方法时，访问权限必须大于等于父类（权限修饰符：private, (default), protected, public)
     */
    public static void main(String[] args) {
        Son s = new Son();
        s.love();

    }
}

class Father{
    public void love(){
        System.out.println("送花");
        System.out.println("送肉");
        System.out.println("唱歌");
    }

    private void love1(){
        System.out.println("送花");
        System.out.println("送肉");
        System.out.println("唱歌");
    }
}

class Son extends Father{
    @Override
    public void love() {
        super.love();
        System.out.println("送酱肉包");
        System.out.println("送口红");
        System.out.println("我喜欢你，一起去爬山吗？");
    }

    // @Override
    public void love1() {
        super.love();
        System.out.println("送酱肉包");
        System.out.println("送口红");
        System.out.println("我喜欢你，一起去爬山吗？");
    }


}

