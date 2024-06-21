package domain;

/*
    自然排序：
        1、在类中实现Comparable接口，重写compareTo方法
 */
public class Student implements Comparable<Student>{  // Comparable<T>：Student类与谁比，T就写谁
    private String name;
    private int age;

    //this.xxx - o.xxx 正序
    //o.xxx - this.xxx 降序
    @Override
    public int compareTo(Student o) {
        //根据年龄做主要排序条件(降序）
        int ageResult = o.age - this.age;
        //根据姓名做次要排序条件（降序）
        int nameResult = ageResult == 0?o.name.compareTo(this.name):ageResult;
        //判断姓名是否相同
        int result = nameResult == 0?1:nameResult;
        return result;
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }


}
