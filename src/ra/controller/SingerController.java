package ra.controller;

import ra.service.SingerService;

import java.util.Scanner;

public class SingerController {
    public static SingerService singerService = new SingerService();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("**********************SINGER-MANAGEMENT*************************");
            System.out.println("1.Nhập vào số lượng ca sĩ cần thêm và nhập thông tin cần thêm mới");
            System.out.println("2.Hiển thị danh sách tất cả ca sĩ đã lưu trữ");
            System.out.println("3.Thay đổi thông tin ca sĩ theo mã id ");
            System.out.println("4.Xóa ca sĩ theo mã id");
            System.out.println("5.Thoát");
            System.out.println("Nhập lựa chọn của bạn");
            byte choice = Byte.parseByte(sc.nextLine());
            switch (choice){
                case 1:
                    singerService.addNewSingger(sc);
                    break;
                case 2:
                    singerService.showAllSingger();
                    break;
                case 3:
                   singerService.updateSingger(sc);
                    break;
                case 4:
                   singerService.deleteSingger(sc);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.err.println("Error choice");
            }
        }
    }

}
