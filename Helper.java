package com.company.hw2_3;
import java.util.*;

public class Helper {

    //此為輸入介面，在最後會回傳單筆course資料
    public static Course createCourse() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入課程名稱");
        String course_name = scanner.nextLine();

        int course_score;

        while(true){
            try{
                System.out.println("請輸入分數");
                course_score = scanner.nextInt();
                break;
            }
            catch(Exception e) {
                System.out.println("分數輸入錯誤");
            }
            finally{
                scanner.nextLine();
            }
        }
        return new Course(course_name,course_score);
    }

    public static Date createDate(){
        int year,month,day;

        Scanner scanner = new Scanner(System.in);
        while(true){
            try{
                System.out.println("請輸入【年】");
                year = scanner.nextInt();
                System.out.println("請輸入【月】");
                month = scanner.nextInt();
                System.out.println("請輸入【日】");
                day = scanner.nextInt();
                break;
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            finally{
                scanner.nextLine();
            }
        }

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.MONTH,month-1);
        calendar.set(Calendar.DATE,day);

        return  calendar.getTime();
    }

    //創建Student物件，視選擇回傳UGStudent或Student
    public static Student createStudent() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入名字");
        String name = scanner.nextLine();

        System.out.println("請輸入【入學日期】");
        Date enrolled_date = Helper.createDate();

        while(true){
            if( enrolled_date.compareTo(Calendar.getInstance().getTime()) > 0 ){
                System.out.println("入學月份不能大於本日");
                enrolled_date = Helper.createDate();
            }
            else{
                break;
            }
        }

        while(true){
            System.out.println("請輸入學生類型(UG / G)");
            String type = scanner.nextLine();
            if(type.equals("UG")){
                return new UGStudent(name,enrolled_date);
            }
            else if(type.equals("G")){
                return new GStudent(name,enrolled_date);
            }
        }
    }
}