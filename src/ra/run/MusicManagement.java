package ra.run;

import ra.controller.SingerController;
import ra.controller.SongController;
import ra.service.SongService;

import java.util.Scanner;

public class MusicManagement {
//    public static SingerController singerController = new SingerController();
//    public static SongController songController = new SongController();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("************************MUSIC-MANAGEMENT*************************");
            System.out.println("1. Quản lý ca sĩ");
            System.out.println("2. Quản lý bài hát");
            System.out.println("3. Tìm kiếm bài hát");
            System.out.println("4. Thoát");
            System.out.println("Nhập lựa chọn của bạn");
            byte choice = Byte.parseByte(sc.nextLine());
            switch (choice){
                case 1:
//**********************SINGER-MANAGEMENT*************************
                    SingerController.main(args);
                    break;
                case 2:
//**********************SONG-MANAGEMENT*************************
                    SongController.main(args);
                    break;
                case 3:
//*********************SEARCH-MANAGEMENT************************
                  //tim kiem
                    break;
                case 4:
                    //thoat
                    System.exit(0);
                    break;
                default:
                    System.err.println("Error choice");
            }
        }
    }
}
