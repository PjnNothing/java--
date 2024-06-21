package OrderService;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：1、国内订单  2、国外订单");

        OrderService orderService = null;

        int choice = sc.nextInt();
        switch (choice){
            case 1:
                //创建国内订单的业务类
                orderService = new OrderSeriveImpl();

                break;
            case 2:
                //创建国外订单的业务类
                orderService = new OverseasServiceImpl();

                break;
        }


        orderService.create();
        orderService.findOne();
        orderService.findList();
        orderService.cancel();
        orderService.finish();
        orderService.paid();
    }
}
