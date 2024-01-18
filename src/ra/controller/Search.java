package ra.controller;

import ra.service.SingerService;

import java.util.Scanner;

public class Search {
    public static SingerService singerService = new SingerService();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("*********************SEARCH-MANAGEMENT************************\n");
            System.out.println("1.Tìm kiếm bài hát theo tên ca sĩ hoặc thể loại . ");
            System.out.println("2.Tìm kiếm ca sĩ theo tên hoặc thể loại");
            System.out.println("3.Hiển thị danh sách bài hát theo thứ tự tên tăng dần");
            System.out.println("4.Hiển thị 10 bài hát được đăng mới nhất ");
            System.out.println("5.Thoát");
            System.out.println("Nhập lựa chọn của bạn");
            byte choice = Byte.parseByte(sc.nextLine());
            switch (choice){
                case 1:
//                    singerService.addNewSingger(sc);
                    break;
                case 2:
//                    singerService.showAllSingger();
                    break;
                case 3:
//                    singerService.updateSingger(sc);
                    break;
                case 4:
//                    singerService.deleteSingger(sc);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.err.println("Error choice");
            }
        }
    }

}
