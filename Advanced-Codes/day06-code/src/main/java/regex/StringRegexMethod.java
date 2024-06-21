package regex;

public class StringRegexMethod {
    /*
        String类中与正则有关的常见方法：
            public String replaceAll(String regex,String newStr): 按照正则表达式匹配的内容进行替换
     */
    public static void main(String[] args) {
        String s = "及我记得1井底蛙2记得我记得3";
        System.out.println(s.replaceAll("\\d", ""));
    }
}
