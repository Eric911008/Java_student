package com.company.hw2_3;
import java.util.*;
import javax.swing.*;

public class Helper1 {
    //此為輸入介面，在最後會回傳單筆course資料
    public static Course createCourse() {

        String course_name = JOptionPane.showInputDialog("請輸入課程名稱");
        int course_score;

        while(true){
            try{
                course_score = Integer.parseInt(JOptionPane.showInputDialog("請輸入分數"));
                break;
            }
            catch(Exception e) {
                JOptionPane.showMessageDialog(null,"分數輸入錯誤");
            }
        }
        return new Course(course_name,course_score);
    }

    public static Date createDate(){
        int year,month,day;

        while(true){
            try{
                year = Integer.parseInt(JOptionPane.showInputDialog("請輸入【年】"));
                month = Integer.parseInt(JOptionPane.showInputDialog("請輸入【月】"));
                day = Integer.parseInt(JOptionPane.showInputDialog("請輸入【日】"));
                break;
            }
            catch(Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
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

        String name = JOptionPane.showInputDialog("請輸入名字");
        JOptionPane.showMessageDialog(null,"請輸入【入學日期】");
        Date enrolled_date = Helper1.createDate();

        while(true){
            if( enrolled_date.compareTo(Calendar.getInstance().getTime()) > 0 ){
                JOptionPane.showMessageDialog(null,"入學月份不能大於本日");
                enrolled_date = Helper1.createDate();
            }
            else{
                break;
            }
        }

        while(true){
            String type = JOptionPane.showInputDialog("請輸入學生類型(UG / G)");
            if(type.equals("UG")){
                return new UGStudent(name,enrolled_date);
            }
            else if(type.equals("G")){
                return new GStudent(name,enrolled_date);
            }
        }
    }
}
