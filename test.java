package com.company.hw2_3;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true) {
            Student s = Helper.createStudent();

            while (true) {
                Course course = Helper.createCourse();
                s.addCourse(course);
                System.out.println("請輸入quit離開創建課程loop，或輸入任何以繼續新增課程");
                if(scanner.nextLine().equals("quit")) {
                    break;
                }
            }
            System.out.println(s.getStudentDetail());

            System.out.println("請輸入quit離開創建課程loop，或輸入任何以繼續新增學生");
            if(scanner.nextLine().equals("quit")){

                try {
                    FileWriter Writer = new FileWriter("1.txt");
                    Writer.write("Name: " + s.getName());
                    Writer.write("\n" + s.getCourse());
                    Writer.write("\n" + "Credit Earned: " + s.getCreditEarned());

                    Writer.close();
                    System.out.println("Successfully wrote to the file.");

                } catch (FileNotFoundException e) {
                    System.out.println("File not found");
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }

                System.out.println("拜拜嘍");
                break;
            }
        }
    }
}
