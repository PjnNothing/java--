package test;

public class Student extends Person {
    private double score;


    public Student() {
    }
    public Student(String name, int age,double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }
    public void study(){
        System.out.println("姓名为" + super.getName() + ",年龄为" + "成绩为" + score+"学生，正在学习");
    }


}
