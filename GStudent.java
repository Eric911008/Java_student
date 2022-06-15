package com.company.hw2_3;
import java.util.*;


public class GStudent extends Student {

    private static final int PASSING_SCORE = 70;
    private static final int STUDY_PERIOD = 4;

    public GStudent(String name,Date enrolled_date){
        super(name,enrolled_date);
    }

    public int getRemainPeriod(){
        return StudentUtils.calculateRemainPeriod(getEnrolledDate() , STUDY_PERIOD);
    }

    public int getCreditEarned() {

        int credit_earned = 0;
        int i = 0;

        for (i = 0; i < courses.size(); i++) {
            if (this.courses.get(i).getCourse_score() > this.PASSING_SCORE){
                credit_earned += Student.CREDIT;
            }
        }
        return credit_earned;
    }

    public String getStudentDetail(){
        return String.format("【學生姓名】%s\n【已修習課程】%s\n【已修習學分】%d\n【剩餘修業年限】%d",
                getName(),getCourse(),getCreditEarned(),getRemainPeriod());
    }
}