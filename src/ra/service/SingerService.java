package ra.service;

import ra.model.Singer;

import java.text.ParseException;
import java.util.Scanner;

public class SingerService {
    public static Singer[] Singgers = new Singer[0];
    public void addNewSingger(Scanner sc) {
        // Nhập số lượng cần thêm
        System.out.println("Nhạp số lượng cần thêm");
        int n = Integer.parseInt(sc.nextLine());
        // tạo mảng mới và copy giá trị cũ sang
        Singer[] newSinggers = new Singer[Singgers.length +n];
        for (int i = 0; i < Singgers.length; i++) {
            newSinggers[i] = Singgers[i];
        }
//        lặp số lượng thêm và nhập ca sĩ mới
        for (int i = 0; i < n; i++) {
            Singer newSinger = new Singer();
            newSinger.inputData(sc);
            newSinggers[Singgers.length+i] = newSinger;
        }
// gán lại mảng cũ
        Singgers = newSinggers;
    }
    public void updateSingger(Scanner sc) {
        // Nhập id cần sửa
        System.out.println("Nhập id cần sửa :");
        int id = Integer.parseInt(sc.nextLine());
        int indexById = findIndexById(id);
        if (indexById !=-1){
            System.out.println("Thông tin cũ");
            Singgers[indexById].displayData();
            System.out.println("Nhập thông tin mới");
            Singgers[indexById].inputData(sc);
            System.out.println("Cập nhạt thanh cong");
        }else {
            System.err.println("id khong tim thay");
        }
    }

    public void showAllSingger(){
        if (Singgers.length==0){
            System.err.println("Danh sách rỗng");
        }else {
            System.out.println("Danh sách ca sĩ");
            for (int i = 0; i <Singgers.length ; i++) {
                if(Singgers[i] != null)
                    Singgers[i].displayData();
            }
        }
    }

    public void deleteSingger(Scanner sc){
        // Nhập id cần xóa
        System.out.println("Nhap id cần xoa :");
        int id = Integer.parseInt(sc.nextLine());
        int indexById = findIndexById(id);
        if (indexById !=-1){
            Singer[] newSingers = new Singer[Singgers.length-1];
            for (int i = 0; i < newSingers.length; i++) {
                if(i<indexById){
                    newSingers[i] = Singgers[i];
                }else if (i>indexById){
                    newSingers[i-1] = Singgers[i];
                }
            }
            Singgers = newSingers;
            System.out.println("Xóa thành công");
        }else {
            System.err.println("id khong tim thay");
        }
    }


    public int findIndexById(int id){
        for (int i = 1; i < Singgers.length; i++)
            if (Singgers[i].getSingerId() == id){
                return Singgers[i].getSingerId();
        }
            return -1;
    }


}
