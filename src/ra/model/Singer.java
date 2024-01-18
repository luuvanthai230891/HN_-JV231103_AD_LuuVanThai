package ra.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Singer {
    private static int nextId = 1;
    private int singerId;
    private String singerName;
    private int age;
    private String nationality;
    private boolean gender;
    private String genre;

    public Singer() {
    }

    public Singer(int singerId, String singerName, int age, String nationality, boolean gender, String genre) {
        this.singerId = nextId++;
        this.singerName = singerName;
        this.age = age;
        this.nationality = nationality;
        this.gender = gender;
        this.genre = genre;
    }

    public int getSingerId() {
        return singerId;
    }

    public void setSingerId(int singerId) {
        this.singerId = singerId;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            // Xử lý lỗi nếu age không hợp lệ
            System.out.println("Tuổi phải lớn hơn 0.");
        }
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        if (nationality != null && !nationality.trim().isEmpty()) {
            this.nationality = nationality;
        } else {
            // Xử lý lỗi nếu quốc tịch không hợp lệ
            System.out.println("Quốc tịch không được để trống.");
        }
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        if (genre != null && !genre.trim().isEmpty()) {
            this.genre = genre;
        } else {
            // Xử lý lỗi nếu thể loại không hợp lệ
            System.out.println("Thể loại không được để trống.");
        }

    }

    public void inputData(Scanner sc) {
        if (singerId <= 0) {
            // thêm mới
            System.out.println("Nhập id ca sĩ: ");
            this.singerId = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Nhập tên ca sĩ : ");
        this.singerName = sc.nextLine();
        System.out.println("Nhập tuổi ca sĩ : ");
        // chuyển đổi từ String => Date
        this.age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập quốc tịch ca sĩ : ");
        this.nationality = sc.nextLine();
        System.out.println("Nhập giới tính ca sĩ : ");
        this.gender = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Nhập thể loại ca sĩ  : ");
        this.genre = sc.nextLine();
    }
    public void displayData(){
        System.out.println("Ca sĩ: {" +
                "  Mã ca sĩ :'" + singerId + '\'' +
                ", Tên :'" + singerName + '\'' +
                ", Tuổi : " + age +
                ", Quốc tịch :'" + nationality + '\'' +
                ", Giới tính : =" + (gender?"Nam":"Nữ") +
                ", Thể loại :'" + genre + '\'' +
                '}');
    }
}
