package ra.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Song {
    private String songId;
    private String songName;
    private String descriptions;
    private Singer singer;
    private String songWriter;
    private LocalDateTime createdDate;
    private Boolean songStatus;

    public Song() {
    }

    public Song(String songId, String songName, String descriptions, Singer singer, String songWriter, LocalDateTime createdDate, Boolean songStatus) {
        this.songId = songId;
        this.songName = songName;
        this.descriptions = descriptions;
        this.singer = singer;
        this.songWriter = songWriter;
        this.createdDate = createdDate;
        this.songStatus = songStatus;
    }

    public static Singer[] singers = new Singer[0];
    public String getSongId() {
        return songId;
    }

    public void setSongId(String songId) {
        // Kiểm tra điều kiện cho songId
        if (isValidSongId(songId)) {
            this.songId = songId;
        } else {
            System.out.println("Mã bài hát không hợp lệ.");
        }
    }
    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        if (songName != null && !songName.trim().isEmpty()) {
            this.songName = songName;
        } else {
            // Xử lý lỗi nếu quốc tịch không hợp lệ
            System.out.println("Tên không được để trống.");
        }
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    public String getSongWriter() {
        return songWriter;
    }

    public void setSongWriter(String songWriter) {
        if (songWriter != null && !songWriter.trim().isEmpty()) {
            this.songWriter = songWriter;
        } else {
            //tên tác giả không được để trống
            System.out.println("Tên  không được để trống.");
        }
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public Boolean getSongStatus() {
        return songStatus;
    }

    public void setSongStatus(Boolean songStatus) {
        this.songStatus = songStatus;
    }

    private boolean isValidSongId(String songId) {
      return songId.matches("^S([A-Za-z0-9&&[^S]]){3}$");
    }
    public static Singer[] Singgers = new Singer[0];
    public void inputData(Scanner sc){
        if (songId==null) {
            // thêm mới
            System.out.println("Nhập id bài hát : ");
            this.songId = sc.nextLine();
        }
        System.out.println("Nhập tên bài hát : ");
        this.songName = sc.nextLine();
        System.out.println("Nhập mô tả bài hát : ");
        this.descriptions = sc.nextLine();
        System.out.println("Chọn id ca sĩ");
        int idChoice = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <Singgers.length;i++){
            if(idChoice == i){
                    Singgers[idChoice].displayData();
                }
            }
        this.singer = Singgers[idChoice];
        System.out.println("Nhập tên tác giả : ");
        this.songWriter = sc.nextLine();
        System.out.println("Nhập trạng thái : ");
        this.songStatus = Boolean.parseBoolean(sc.nextLine());
    }
    public void displayData(){
        System.out.println("Bài hát: {" +
                "  Mã bài hát :'" + songId + '\'' +
                ", Tên bài hát :'" + songName + '\'' +
                ", Mô tả : " + descriptions +
                ", Tên ca sĩ :'" +  + '\'' +
                ", Tác giả : =" + songWriter +
                ", Ngày tạo :'" + createdDate + '\'' +
                ", Trạng thái :'" + songStatus + '\'' +
                '}');
    }

}
