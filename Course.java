package com.company.hw2_3;

public class Course {

    private String course_name;
    private int course_score;

    public Course(String course_name, int course_score) {
        this.course_name = course_name;
        this.course_score = course_score;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_score(int course_score) {
        this.course_score = course_score;
    }

    public int getCourse_score() {
        return course_score;
    }

    public String toString() {
        return course_name + ", " + course_score;
    }
}