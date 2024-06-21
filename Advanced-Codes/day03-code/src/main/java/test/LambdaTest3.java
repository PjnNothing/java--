package test;
import java.util.Random;

public class LambdaTest3 {
    public static void main(String[] args) {

        useRandomNumHandeler(new RandomNumHandler() {
            @Override
            public int getNumber() {
                return new Random().nextInt(100)+1;
            }
        });

        System.out.println("-------------------");

        useRandomNumHandeler(()-> new Random().nextInt(100)+1
        );

    }

    public static void useRandomNumHandeler(RandomNumHandler randomNumHandler){

        int result = randomNumHandler.getNumber();
        System.out.println(result);
    }
}

interface RandomNumHandler{
    int getNumber();
}
