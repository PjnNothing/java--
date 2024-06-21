package lambda;

public class LambdaDemo3 {
    public static void main(String[] args) {


    }

    public static void useRandomNumHandler(RandomNumHandler randomNumHandler){
        int result = randomNumHandler.getNumber();
        System.out.println(result);
    }
}

interface RandomNumHandler{
    int getNumber();
}
