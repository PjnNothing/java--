package regex;

public class RegexDemo {
    /*
        正则表达式:本质上是一个字符串，可以指定一些规则，来校验其他字符串
     */
    /*
        1、字符类
        -------------------------------
        [abc]:只能是a或b或c
        [^abc]:除a、b、c之外的任何字符
        [a-zA-Z]：a到z，A到Z，包括（范围）
        [a-z&&[^bc]]:a到z，除了b和c
     */
    /*
        2、预定义字符类
        --------------------------------
        .: 任何一个字符
        \d: 一个数字[0-9]
        \D:非数字[^0-9]
        \s: 一个空白字符[\t\n\x0B\f\r]
        \S: 非空白字符：[^\s]
        \w: [a-zA-Z_0-9]英文、数字、下划线
        \W: [^\w]一个非单词字符
        \: 转义字符
     */
    /*
        3、数量：
        -------------------------------
        X?: X,一次或0次
        X*: X，零次或多次（任意次数）
        X+: X，一次或多次
        X{n}: X，正好n次
        X{n,}: X，至少N次
        X{n,m}: X，至少n但不超过m次

     */
    public static void main(String[] args) {
        String regex = "[abc]";
        System.out.println("z".matches(regex));
        System.out.println("a".matches(regex));

        String regex1 = ".";
        System.out.println("1".matches(regex1));
        System.out.println("11".matches(regex1));

        String regex2 = "\\D";
        System.out.println("1".matches(regex2));
        System.out.println("11".matches(regex2));

        String regex3 = ".+";
        System.out.println("abc".matches(regex2));


    }
}
