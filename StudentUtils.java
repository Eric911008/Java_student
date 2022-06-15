package com.company.hw2_3;
import java.util.*;


public class StudentUtils {

    public static int calculateRemainPeriod(Date enrolled_date,int study_period){

        Date current_date  = Calendar.getInstance().getTime();
        int counter = current_date.getYear() - enrolled_date.getYear();

        if ( counter > 0 && current_date.getMonth() < enrolled_date.getMonth() ) {
            counter -= 1;
        }

        return study_period - counter;
    }
}