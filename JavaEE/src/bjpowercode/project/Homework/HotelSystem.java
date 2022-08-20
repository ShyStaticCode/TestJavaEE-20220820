package bjpowercode.project.Homework;

import java.util.Scanner;

/**
 * 酒店管理系统，模拟订房，退房，打印房间状态等信息
 */
public class HotelSystem {
    public static void main(String[] args) {
        System.out.println("*********************");
        System.out.println("* 欢迎光临动力节点大酒店 *");
        System.out.println("*********************\n");
        System.out.println("欢迎使用酒店管理系统，请阅读说明后操作：");
        System.out.println("          【0】退出系统：\n");
        System.out.println("          【1】查看房间列表：\n");
        System.out.println("          【2】订房间：\n");
        System.out.println("          【3】退房间：\n");
        Hotel hotel = new Hotel();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入功能编号:");
            int i = sc.nextInt();
            if(i == 0){
                System.out.println("您已退出，欢迎下次光临.");
                break;
            } else if(i == 1) {
                System.out.println("房间状态列表如下：");
                hotel.print();
            }else if(i == 2) {
                System.out.println("请输入预定房间号:");
                int i1 = sc.nextInt();
                hotel.order(i1);
                System.out.println(i1+"已订房");
            }else if(i == 3) {
                System.out.println("请输入入住房间号:");
                int i2 = sc.nextInt();
                hotel.exit(i2);
                System.out.println(i2+"退房成功，欢迎下次光临.");
            }else{
                System.out.println("您的输入有误，请重新输入！");
            }
        }
    }
}
