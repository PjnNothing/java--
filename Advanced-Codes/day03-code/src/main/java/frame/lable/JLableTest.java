package frame.lable;

import javax.swing.*;

public class JLableTest {
    /*
        案例：使用JLable展示文本的图片

        JLable构造方法：
            JLable(String text):使用指定的文本创建一个JLable对象
            JLable(Icon image):创建一个具有指定图像的JLable对象
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);

        //JLable展示文本
        JLabel jl1 = new JLabel("听君一席话");
        jl1.setBounds(50,50,100,100);
        frame.getContentPane().add(jl1);

        JLabel jl2 = new JLabel("如听一席话");
        jl1.setBounds(150,50,100,100);
        frame.getContentPane().add(jl2);

        //JLable展示图片
        JLabel imgLable_2png = new JLabel("C:\\Users\\28577\\Desktop\\1.png");
        imgLable_2png.setBounds(50,150,100,100);
        frame.getContentPane().add(imgLable_2png);

        JLabel imgLable_3png = new JLabel("C:\\Users\\28577\\Desktop\\1.png");
        imgLable_3png.setBounds(50,150,100,100);
        frame.getContentPane().add(imgLable_3png);

        frame.setVisible(true);
    }
}
