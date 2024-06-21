package generics;

public class GenericsDemo2 {
    /*
        常见的泛型标识符：E(element)、 V(value值）、 K（key键）、 T（type)


        清楚不同的泛型，在什么时机能确定到具体的类型
        泛型类：在创建对象时能确定数据类型

     */
    public static void main(String[] args) {
        Student<String> stu = new Student<String>();

    }
}

class Student<E>{
    private E e;

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }
}
