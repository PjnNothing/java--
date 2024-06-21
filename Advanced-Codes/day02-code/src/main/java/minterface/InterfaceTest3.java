package minterface;

interface InterA{
    void show();
}
interface InterB{
    void show();
}

interface InterC extends InterA,InterB{
    void show();
}

class InterCImpl implements InterC{


    @Override
    public void show() {

    }
}

public class InterfaceTest3 {
    /*
        接口和类之间的各种关系：
            1、类和类之间：继承关系，只支持单继承，不支持多继承，可以多层继承
            2、类和接口之间：实现关系，可以单实现，多实现，甚至可以在继承一个类的同时，实现多个接口
            3、接口和接口之间：继承关系，可以单继承，多继承

     */
    public static void main(String[] args) {

    }
}

interface A{
    void show();

}

interface B{
    void show();

}

class Fu{
    public void show(){
        System.out.println("FU...show");
    }
}

/*
    class ABImpl implements A,B{

        @Override
        public void show() {

        }

        @Override
        public void show() {

        }
    }

*/

class Zi extends Fu implements A,B{


}
