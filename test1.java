package com.company.hw2_3;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

public class test1 {

    public static void main(String[] args) {

        while(true) {
            Student s = Helper1.createStudent();

            while (true) {
                Course course = Helper1.createCourse();
                s.addCourse(course);
                String sr1 = JOptionPane.showInputDialog("請輸入quit離開創建課程loop，或輸入任何以繼續新增課程");
                if(sr1.equals("quit")) {
                    break;
                }
            }
            JOptionPane.showMessageDialog(null,s.getStudentDetail());

            String sr2 = JOptionPane.showInputDialog("請輸入quit離開創建課程loop，或輸入任何以繼續新增學生");
            if(sr2.equals("quit")){

                try {
                    FileWriter Writer = new FileWriter("1.txt");
                    Writer.write("Name: " + s.getName());
                    Writer.write("\n" + s.getCourse());
                    Writer.write("\n" + "Credit Earned: " + s.getCreditEarned());

                    Writer.close();
                    JOptionPane.showMessageDialog(null,"Successfully wrote to the file.");

                } catch (FileNotFoundException e) {
                    System.out.println("File not found");
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }

                JOptionPane.showMessageDialog(null,"拜拜嘍");
                break;
            }
        }
    }
}

