package bigdecimal;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    /*
        BigDecimal类：解决小数运算中，出现的不精确问题
        BigDecimal创建对象：
            public BigDecimal(double val)  //不推荐，无法保证小数运算的精确
            --------------------------------------------
            public BigDecimal(String val)
            public static BigDecimal valueOf(double val)

        BigDecimal常用成员方法：
            public BigDecimal add(BigDecimal b): 加法
            public BigDecimal subtract(BigDecimal b): 减法
            public BigDecimal multiply(BigDecimal b): 乘法
            public BigDecimal divide(BigDecimal b): 除法
            public BigDecimal divide(另一个BigDecimal对象，精确几位，舍入模式）：除法

     */
    public static void main(String[] args) {

        BigDecimal bd1 = new BigDecimal(0.1);
        BigDecimal bd2 = new BigDecimal(0.2);
        System.out.println(bd1.add(bd2));

        BigDecimal bd11 = new BigDecimal("0.1");
        BigDecimal bd22 = new BigDecimal("0.2");
        System.out.println(bd11.add(bd22));

        BigDecimal bd3 =  BigDecimal.valueOf(0.1);
        BigDecimal bd4 =  BigDecimal.valueOf(0.2);
        System.out.println(bd3.add(bd4));
        System.out.println(bd3.subtract(bd4));
        System.out.println(bd3.multiply(bd4));
        System.out.println(bd3.divide(bd4));

        BigDecimal bd5 =  BigDecimal.valueOf(10.0);
        BigDecimal bd6 =  BigDecimal.valueOf(3.0);
        System.out.println(bd5.divide(bd6,2, RoundingMode.HALF_UP));
        System.out.println(bd5.divide(bd6,2, RoundingMode.UP));
        System.out.println(bd5.divide(bd6,2, RoundingMode.DOWN));

        BigDecimal result = bd5.divide(bd6, 2, RoundingMode.HALF_UP);
        double v = result.doubleValue();
        Math.abs(v);


    }
}
