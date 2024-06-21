package regex;

public class RegexTest {
    /*
        1、QQ号正则
            不能以0开头
            全部为数字
            5~12位
        2、手机号正则
            必须以1开头
            第二位：3 4 5 6 7 8 9
            全部是数字，必须11位
        3、邮箱正则
            xxx@itcast.com
            xxx@qq.com

     */
    public static void main(String[] args) {
        String qqRegex = "[`1-9]\\d{4,11}";
        System.out.println("1256".matches(qqRegex));

        String telRegex = "[1][3-9]\\d{9}";

        String emailRegex = "\\w+[@][\\w]&&[^_]]+(\\.[a-z]{2,3})+";
    }
}
