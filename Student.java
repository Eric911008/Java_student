package com.company.hw2_3;
import java.util.*;

public class Student {

    private String name;
    protected ArrayList<Course> courses; // 宣告在父類別比在子類別好
    private Date enrolled_date;
    protected static final int CREDIT = 3;

    public Student(String name,Date enrolled_date){
        this.courses = new ArrayList<Course>(5);
        setName(name);
        setEnrolledDate(enrolled_date);
    }
    public String getCourse(){
        String rs = "";
        for(int i=0; i< courses.size(); i++) {
            rs += String.format("%s:%d,", this.courses.get(i).getCourse_name(), this.courses.get(i).getCourse_score());
        }
        return rs;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setEnrolledDate(Date enrolled_date){
        this.enrolled_date = enrolled_date;
    }
    public Date getEnrolledDate(){
        return enrolled_date;
    }
    //計算剩餘修業年限
    //條件：（如大於1年，但少於2年，算已修1年，如此類推）
    public int getRemainPeriod() {
        return 0;
    }
    public int getCreditEarned() {
        return 0;
    }
    public String getStudentDetail() {
        return "";
    }
    //新增課程
    public void addCourse(Course course) {
        this.courses.add(course);
    }
}
