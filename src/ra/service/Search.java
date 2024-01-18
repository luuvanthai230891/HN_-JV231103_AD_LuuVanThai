package ra.service;

import ra.model.Singer;
import ra.model.Song;

import java.util.Scanner;

public class Search {
public static Scanner sc = new Scanner(System.in);

public static Singer[] singers = new Singer[0];
 public Singer findSinger(String string){
     System.out.println("Nhập tên ca sĩ hoặc thể loại:");
     String singerName = sc.nextLine();
     for(int i =0; i< singers.length;i++) {
         if (singers[i].getSingerName().contains(singerName)){
            System.out.println(singers[i]);
         }
     }
     return null;
 }
}
