package ra.controller;

import ra.model.Song;
import ra.service.SingerService;
import ra.service.SongService;

import java.util.Scanner;

public class SongController {
    public static SongService songService = new SongService();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("**********************SONG-MANAGEMENT*************************");
            System.out.println("1.Nhập vào số lượng bài hát cần thêm và nhập thông tin cần thêm mới");
            System.out.println("2.Hiển thị danh sách tất cả bài hát đã lưu trữ");
            System.out.println("3.Thay đổi thông tin bài hát theo mã id ");
            System.out.println("4.Xóa bài hát theo mã id");
            System.out.println("5.Thoát");
            System.out.println("Nhập lựa chọn của bạn");
            byte choice = Byte.parseByte(sc.nextLine());
            switch (choice){
                case 1:
                    songService.addNewSong(sc);
                    break;
                case 2:
                    songService.showAllSongs();
                    break;
                case 3:
                    songService.updateSong(sc);
                    break;
                case 4:
                    songService.deleteSong(sc);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.err.println("Error choice");
            }
        }
    }


}
