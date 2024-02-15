package day16.src.com.pintu.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test1 extends JFrame {
    public Test1()  {
        this.setSize(603, 680);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("拼图游戏");

        this.setLayout(null);
        this.setVisible(true);


        JButton jb1 = new JButton("AAA");
        jb1.setBounds(0,0,100,50);
        jb1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("DONE");
            }
        });
        this.add(jb1);
    }
}
