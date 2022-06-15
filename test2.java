package com.company.hw2_3;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

public class test2 extends JFrame {

    test2() {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(470, 270, 500, 300);
        frame.setTitle("學生成績系統");
        frame.setVisible(true);


        while(true) {

            Student s = Helper1.createStudent();

            while (true) {
                Course course = Helper1.createCourse();
                s.addCourse(course);
                String sr1 = JOptionPane.showInputDialog(frame,"請輸入quit離開創建課程loop，或輸入任何以繼續新增課程");
                if(sr1.equals("quit")) {
                    break;
                }
            }
            JOptionPane.showMessageDialog(frame,s.getStudentDetail());

            String sr2 = JOptionPane.showInputDialog(frame,"請輸入quit離開創建課程loop，或輸入任何以繼續新增學生");
            if(sr2.equals("quit")){

                try {
                    FileWriter Writer = new FileWriter("1.txt");
                    Writer.write("Name: " + s.getName());
                    Writer.write("\n" + s.getCourse());
                    Writer.write("\n" + "Credit Earned: " + s.getCreditEarned());
                    Writer.close();
                    JOptionPane.showMessageDialog(frame,"Successfully wrote to the file.");

                } catch (FileNotFoundException e) {
                    JOptionPane.showMessageDialog(frame,"File not found");
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(frame,"An error occurred.");
                    e.printStackTrace();
                }

                JOptionPane.showMessageDialog(frame,"拜拜嘍");
                break;
            }
        }
        frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
    }
    public static void main(String[] args) {
        test2 t = new test2();
    }
}
