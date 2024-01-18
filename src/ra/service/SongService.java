package ra.service;

import ra.model.Singer;
import ra.model.Song;

import java.util.Scanner;

public class SongService {
    public static Song[] Songs = new Song[0];
    public void addNewSong(Scanner sc) {
        // Nhập số lượng cần thêm
        System.out.println("Nhạp số lượng cần thêm");
        int n = Integer.parseInt(sc.nextLine());
        // tạo mảng mới và copy giá trị cũ sang
        Song[] newSongs = new Song[Songs.length +n];
        for (int i = 0; i < Songs.length; i++) {
            newSongs[i] = Songs[i];
        }
//        lặp số lượng thêm và nhập ca sĩ mới
        for (int i = 0; i < n; i++) {
            Song newSong = new Song();
            newSong.inputData(sc);
            newSongs[Songs.length+i] = newSong;
        }
// gán lại mảng cũ
        Songs = newSongs;
    }
    public void updateSong(Scanner sc) {
        // Nhập id cần sửa
        System.out.println("Nhập id cần sửa :");
        int id = Integer.parseInt(sc.nextLine());
        int indexById = findIndexById(id);
        if (indexById !=-1){
            System.out.println("Thông tin cũ");
            System.out.println(Songs[indexById]);
            System.out.println("Nhập thông tin mới");
            Songs[indexById].inputData(sc);
            System.out.println("Cập nhạt thanh cong");
        }else {
            System.err.println("id khong tim thay");
        }
    }

    public void showAllSongs(){
        if (Songs.length==0){
            System.err.println("Danh sách rỗng");
        }else {
            System.out.println("Danh sách bài hát");
            for (int i = 0; i <Songs.length ; i++) {
               Songs[i].displayData();
            }
        }
    }
    public void deleteSong(Scanner sc){
        // Nhập id cần xóa
        System.out.println("Nhap id cần xoa :");
        int id = Integer.parseInt(sc.nextLine());
        int indexById = findIndexById(id);
        if (indexById !=-1){
            Song[] newSongs = new Song[Songs.length-1];
            for (int i = 0; i < newSongs.length; i++) {
                if(i<indexById){
                    newSongs[i] = Songs[i];
                }else if (i>indexById){
                    newSongs[i-1] = Songs[i];
                }
            }
            Songs = newSongs;
            System.out.println("Xóa thành công");
        }else {
            System.err.println("id khong tim thay");
        }
    }


    public int findIndexById(int id){
        for (int i = 0; i < Songs.length; i++)
            if (Songs[i].getSongId().equals(id)){
                return i;
            }
        return -1;
    }
}
