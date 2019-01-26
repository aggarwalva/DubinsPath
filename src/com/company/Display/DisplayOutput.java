package com.company.Display;

import javax.swing.*;
import java.awt.*;

public class DisplayOutput extends JFrame {

    public DisplayOutput(){
        initUI();
    }

    private void initUI(){
        add(new DrawLester());

        setTitle("Basic Lester Example");
        setSize(650,520);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                DisplayOutput d = new DisplayOutput();
                d.setVisible(true);
            }
        });
    }
}
